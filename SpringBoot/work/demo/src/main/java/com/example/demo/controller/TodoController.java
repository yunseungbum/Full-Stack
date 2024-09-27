package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.Todoservice;

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
	
}
