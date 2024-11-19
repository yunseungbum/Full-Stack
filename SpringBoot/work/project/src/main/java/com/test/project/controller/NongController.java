package com.test.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.project.dto.NongDTO;
import com.test.project.entity.NongEntity;
import com.test.project.service.NongService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

//@RestController : @controller와 @ResponseBody의 결합
//@ResponseBody: 컨트롤러 메서딍 반환 값을 HTTP응답의 바디에 직접 포함
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class NongController {
	private final NongService service;
	
	@PostMapping
	public ResponseEntity<?> adduser(@RequestBody NongDTO dto){
		//@RequestBody : JSON <-> 자바 객체 변환
		NongDTO users = service.adduser(dto);
		return ResponseEntity.ok().body(users); 
	}
	
	@GetMapping
	public ResponseEntity<List<NongDTO>> showAllUsers(){
		List<NongDTO> products = service.showAllUsers();
		return ResponseEntity.ok(products);
	}
	
	@PutMapping
	public ResponseEntity<List<NongDTO>> updateUsers(@RequestBody NongDTO dto){
		
		List<NongDTO> users = service.updateUsers(dto);
		
		return ResponseEntity.ok().body(users);
	}
	
	@DeleteMapping("/{clientNum}")
	public ResponseEntity<?> deleteUsers(NongDTO dto){
		
		boolean isDeleted = service.deleteUsers(dto);
		try {
			if(isDeleted) {
				return ResponseEntity.ok("회원이 탈퇴되었습니다.");
			}else {
				return ResponseEntity.status(404).body("회원정보를 찾을 수 없습니다.");
			}
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("데이터에러");
		}
		
		
	}
	

}
