package com.korea.user.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.user.dto.ResponseDTO;
import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.security.TokenProvider;
import com.korea.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenProvider tokenprovider;//토큰을 발급해주는 주체(로그인 메서드에서 사용)
	
	
	
	//id중복조회
	//POST,PUT,DELETE로 전달하면 데이터들이 RequsetBody로 전송
	//GET으로 전달할 때는 RequestBody로 전송되지 않는다.
	//Get으로 전달 할 때는 localhost:9090/users/idCheck?userId='xx'로 전달해야한다.
	@PostMapping("idCheck")
	public ResponseEntity<?> isIdDuplicate(@RequestBody UserDTO dto){
		boolean check = userService.isIdDuplicated(dto.getUserId());
		ResponseDTO<Boolean> response = ResponseDTO.<Boolean>builder().value(check).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("signup")
	//id,pwd,name,eamil을 넘겨야함
	public ResponseEntity<?> signup(@RequestBody UserDTO dto){
		List<UserDTO> dtos = userService.insert(dto);
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	//모든 유저 조회
	@GetMapping("allUsers")
	public ResponseEntity<?> allUsers(){
		List<UserDTO> dtos = userService.allUsers();
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	//로그인
	@PostMapping("/signin")
	//아이디와 비밀번호를 입력받는다.
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto){
		
		//id와 비밀번호를 통해 유저를 반환받는다.
		UserEntity user = userService.getByCredetial(dto.getUserId(), dto.getPwd());
		
		//조회가 됐다면
		if(user != null) {
			//토큰을 발급해준다.
			//토큰은 암호화된 문자열이다.
			final String token = tokenprovider.create(user);
			final UserDTO responseUserDTO = UserDTO.builder()
												.userId(user.getUserId())
												.idx(user.getIdx())
												.name(user.getName())
												.email(user.getEmail())
												.token(token)
												.build();
			
			return ResponseEntity.ok().body(responseUserDTO);
		}else {
			ResponseDTO responseDTO = ResponseDTO.builder().error("Login failed").build();
			return ResponseEntity.badRequest().body(responseDTO);
		}
	}
	
	   @GetMapping("name")
	   //@RequestHeader: HTTP 요청헤더 값을 컨트롤러 메서드에 주입하는데 사용되는 어노테이션
	   public ResponseEntity<?> getUserName(@RequestHeader("Authorization") String token){
	      // "Bearer " 제거
	       String actualToken = token.substring(7);
	       
	       // JWT에서 유저 id 추출
	       String userId = tokenprovider.validateAndeGetUserId(actualToken);
	       
	       UserEntity entity = userService.getUserName(userId);
	       
	       //entity - > dto
	       UserDTO dto = new UserDTO(entity);
	       
	       //list에 묶음
	       List<UserDTO> dtos = Arrays.asList(dto);
	    	
	       //ResponseDTO의 data필드에 넣어서 반환
	       ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
	       return ResponseEntity.ok().body(response);
	   }//getUserName end
	   
	   @PutMapping
	   public void modify(@RequestBody UserDTO dto){
		   userService.modify(dto);
		   
		   
		   
	   }
	   
	   
	}//class end
	

















