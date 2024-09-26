package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//http관련된 코드 및 요청/응답 매핑을 스프링이 알아서 해준다.
//@RequestMapping("test")//localhost:9090/test로 접속을 시도하면 이 컨트롤러로 요청이 들어와진다.
public class TestController {
	
	@GetMapping("/test/testGetMapping") //get요청으로 들어오면 아래의 메서드를 실행시킨다.
	public String testController() {
		return "Hello  World";
		
	}
	
	@PostMapping
	public String testController2() {
		return "Hello  World";
		
	}
	
	@PutMapping
	public String testController3() {
		return "Hello  World";
		
	}
	
	@DeleteMapping
	public String testController4() {
		return "Hello  World";
		
	}

}
