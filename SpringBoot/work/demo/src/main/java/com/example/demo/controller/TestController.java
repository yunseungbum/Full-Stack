package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;

@RestController//http관련된 코드 및 요청/응답 매핑을 스프링이 알아서 해준다.
@RequestMapping("test")//localhost:9090/test로 접속을 시도하면 이 컨트롤러로 요청이 들어와진다.
public class TestController {
	
	@GetMapping("/testGetMapping") //get요청으로 들어오면 아래의 메서드를 실행시킨다.
	public String testController() {
		return "Hi";
		
	}
	
	
	
	@GetMapping("/{id}")
	// test/1
	public String tsetControllerWidthPathVariable(@PathVariable(required=false) int id) {
		return "Hello world id"+id;
	}
	
	@GetMapping("/testRequestParam")
	//testRequestParam?id=123
	public String testControllerRequestParam(@RequestParam(required =false) int id) {
		return " Hello ID"+id;
	}
	
	//요청바디에 데이터가 넘어왔을 때 -> 자바객체로 변환
	@GetMapping("/testRequestBody")
	public String tesyControllerRequestbody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello ID" + testRequestBodyDTO.getId() + " Message : " + testRequestBodyDTO.getMessage();
	}
	
	//응답바디에 데이터를 넘기는것
	
	@GetMapping("/testResponsetBody")
	public ResponseDTO<String> tesyControllerResponsebody() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		ResponseDTO<String> response= ResponseDTO.<String>builder().data(list).build();
		//여기엔 왜 어노에이션을 안쓸까?
		//@RsestController는 @Controller + @RseponseBody를 합친것
		//모든 메서드에 @ResponseBody가 적용되어 있는 상태다. 그래서 여기선 생략
		return response;
	}
	
	//ResponseEntity
	//HTTP응답을 보다 세밀하게 제어 할 수 있다.
	//HTTP상태코드,헤더,바디를 구성할 수 있다.
	
	@GetMapping("/testResponsetEntity")
	public ResponseEntity<?> testControllerResponseEntity(){
		List<String>list = new ArrayList<>();
		list.add("Hellow world! I`m ResponseEntity.And tou got 400");
		ResponseDTO<String> response= ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.badRequest().body(response);
	}
	
	

}
