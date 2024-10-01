package com.korea.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.persistence.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //final이 붙은 필드에 대해 생성자를 자동으로 생성
public class UserService {
	
	private final UserRepository repository;
	
	public List<UserDTO> create(UserEntity entity){
		repository.save(entity);
		
		return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}
	
	public List<UserDTO> getAllUsers(){
		
		return repository.findAll().stream().map(UserDTO :: new).collect(Collectors.toList());
	}
	
	public UserDTO getUserByEmail(String email) {
		UserEntity entity = repository.findByEmail(email);
		return new UserDTO(entity);
	}
	
	public List<UserDTO> updateUser(UserEntity entity){
		Optional<UserEntity> userEntityOptional = repository.findById(entity.getId());
		userEntityOptional.ifPresent(UserEntity -> {
			UserEntity.setName(entity.getName());
			UserEntity.setEmail(entity.getEmail());
			
			repository.save(UserEntity);
		});
		
		return getAllUsers();
	}
	
	public boolean deleteUser(Long id) {
		Optional<UserEntity> userEntityOptional = repository.findById(id);
		if(userEntityOptional.isPresent()) {
			repository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	 
	
	
	

}
