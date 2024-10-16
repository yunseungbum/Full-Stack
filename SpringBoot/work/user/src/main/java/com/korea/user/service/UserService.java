package com.korea.user.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.presistence.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//id중복체크메서드
	//id를 db로 전달해서 조회가 되면 false, 조회가 안되면 true를 반환
	//true면 아이디 생성 가능, false면 아이디 생성 불가능
	public boolean isIdDuplicated(String id) {
		userRepository.findByUserId(id);
		
		Optional<UserEntity> user = userRepository.findByUserId(id);
	
		return !user.isPresent();//조회가 되면 true이기 때문에 not을 붙힘
	}
	
	
	
	//회원가입 메서드
	public List<UserDTO> insert(UserDTO dto){
		
		UserEntity entity = UserDTO.toEntity(dto);
		userRepository.save(entity);
		
		//List<UserEntity> -> List<UserDTO>
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
		
		
	}
	
	
	//유저 전체 조회
	public List<UserDTO> allUsers(){
		List<UserDTO> list = userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
		return list;
	}
	
	
	//로그인
	//아이디랑 비밀번호를 받는다.
	public UserEntity getByCredetial(String userId, String pwd) {
		return userRepository.findByUserIdAndPwd(userId,pwd);
	}
	
	//이름 조회
	public UserEntity getUserName(String userId){
		Optional<UserEntity> option = userRepository.findByUserId(userId);
		
		if(option.isPresent()) {
			//option에서 내용을 꺼내와 entity에 저장
			UserEntity entity = option.get();
			return entity; 
		}else {
			return null;	
		}//else end

	}//getUserName end
	
	public void modify(UserDTO dto) {
	
		//1.원본을 db에서 꺼내온다.
		//Optional : 값이 있거나 없음을 명시적으로 표현 할 수 있게 해주는 클래스
		Optional<UserEntity> option = userRepository.findByUserId(dto.getUserId());
		if(option.isPresent()) {
			UserEntity entity = option.get();
			
			//2.내가 가져온 내용으로 객체를 setting을 한다.
			entity.setUserId(dto.getUserId());
			entity.setPwd(dto.getPwd());
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			
			//3.수정한 내용을 db에 저장한다.
			userRepository.save(entity);
			
			
		}//if end
	}//userModify end
	
	
}






















