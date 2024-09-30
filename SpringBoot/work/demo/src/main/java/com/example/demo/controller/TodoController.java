package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TodoDTO;
import com.example.demo.model.TodoEntity;
import com.example.demo.presistence.TodoRepository;
import com.example.demo.service.Todoservice;
import com.google.common.util.concurrent.Service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

//@Controller //view(html,jsp,thymelef)를 반환
@RestController //이 클래스가 컨트롤러임을 명시하는 어노테이션
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {
	//TodoService 의존성 주입하기
	//다른 클래스의 있는 메서드를 사용하기 위해 객체를 만들어야한다.
	//스프링에서는 객체가 이미 만들어져있다. 주입만 하면 된다.
	//Get /todo 로 요청을 했을 때 testTodo()메서드 호출되도록 정의하기
	//testTodo에서는 todoService의 메서드를 호출하여 결과를 ResponseDTO의 리스트에 추가한다.
	//ResponseEntity.ok().body(response)로 반환하기
	
	private final Todoservice todoService;
	
	
	
	@GetMapping("/test")
	 public ResponseEntity<?> testTodo() {
		String s =todoService.testService();
		
		//리스트의 생성
		//인덱스를 가지고 크기에 제한이 없는 자료구조
		List<String> list = new ArrayList<>(); 
		
		//리스트에 값 추가하기 list.add(value)
        list.add(s);
        
        //ResponseDTO 객체 생성
        ResponseDTO<String> response= ResponseDTO.<String>builder().data(list).build();
        
        //ResponseEntity에 body를 response를 실어서 응답을 보낸다.
        return ResponseEntity.ok().body(response); // ResponseEntity로 반환
    }
	
	@PostMapping
	public ResponseEntity<?> crateTodo(@RequestBody TodoDTO dto){
		try {
			String temporaryUserId = "temporary-user";//임시 유저 id
			
			//TodoDTO 객체를 TodoEntity로 변환한다.
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			//id에 null로 이미 들어가있지만 명시적으로 null로 한번 더 설정한다.
			//해당 엔티티가 새로운 데이터임을 보장하게 된다.
			entity.setId(null);
			
			//임시 userId 설정
			//지금은 인증과 인가 기능이 없으므로 임시 유저(temporary-user)만 로그인 없이 사용 가능한
			//애플리케이션인 셈이다.
			entity.setUserId(temporaryUserId);
			
			//서비스 레이어의 create메서드를 호출하여,TodoEntity를 데이터베이스에 저장하는 작업을 수행한다.
			//이 메서드는 저장된 TodoEntity 객체를 저장한 리스트를 반환한다.
			//entities라는 변수명으로 코드 작성해보기
			List<TodoEntity> entities = todoService.create(entity);
			
			//entities.stream().map(TodoDTO::new); TodoEntity객체들을 TodoDTO객테들로 변환하는 과정
			//.collect(Collectors.toList()):  stream으로 변환된 객체들을 List로 반환
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//변환된 TodoDTO객체를 담고 있는 리스트를 ResponseDTO의 data필드에 대입한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			//혹시 예외가 발생하는 경우 responseDTO객체에 리스트 대신 error 메시지를 넣어 반환한다.
			String error = e.getMessage();
			
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
			
			
			
		}
		
	}
	
	
	@GetMapping
	public ResponseEntity<?> retrieveTodoList(){
		String temporaryUserId = "temporary-user";
		
		//서비스 레이어의 retrieve메서드를 이용해 TodoEntity가 담겨있는 리스트를 반환받아 entities에 저장한다.
		List<TodoEntity> entities = todoService.retrieve(temporaryUserId);
		
		//자바 스트림을 이용해 반환된 리시트를 TodoDTO객체로 변환하고 리스트로 변환하여 dtos에 저장한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		//.stream() = list의 값들을 흐름으로 바꿔줌
		//.map(TodoDTO::new) = : map(TodoDTO::new)을 통해 각 Todo 객체를 TodoDTO 객체로 변환
		//.collect = 스트림의 요소들을 집계해주는 메서드 즉,스트림에 있는 데이터들을 하나의 컬렉션(리스트,세트)등으로 모으는 작업
		//Collectors.toList() = 스트림의 요소들을 List로 수집하는 방법을 제공하는 정적 메서드입니다.
		
		//변환된 dtos리스트를 이용해  ResponseDTO에 담고 ResponseEntity를 이용해 응답을 반환한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return  ResponseEntity.ok().body(response);
		
		
	}
	@PutMapping
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto){
		
		String temporaryUserId = "temporary-user";
		
		//dto -> Entity로 변환
		TodoEntity entity = TodoDTO.toEntity(dto);
		
		entity.setUserId(temporaryUserId);
		
		List<TodoEntity> entities = todoService.update(entity);
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return  ResponseEntity.ok().body(response);
		
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto){
		
		try {
			String temporartUserId = " temporary-user";
			//1.엔티티로 변경
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			//2.임시 유저 아이디 설정
			entity.setUserId(temporartUserId);
			
			//3.서비스를 이용해  entity를 삭제
			List<TodoEntity> entities = todoService.delete(entity);
			
			
			//4.자바 스트림을 이용해 반환된 엔티티 리스트들을 TodoDTO리스트로 변환한다.
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//5.ResponseDTO에 담아서 반환한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			//6.예외가 발생하는 경우 ResponseDTO에 error를 실어서 반환한다.
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
			
			
			
		}
		
	}
	
	
	
	
	
}

	

























