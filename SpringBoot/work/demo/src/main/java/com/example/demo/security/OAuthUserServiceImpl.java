package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.persistence.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OAuthUserServiceImpl extends DefaultOAuth2UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	
	public OAuthUserServiceImpl() {
		super();
	}
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		//DefaultOAuth2UserService의 기존 loadUser를 호출한다.
		//이 메서드가 user-info-uri를 이용해 사용자 정보를 가져오는 부분이다.
		final OAuth2User OAuth2User = super.loadUser(userRequest);
		try {
			log.info("OAuth2User attributes {} ",new ObjectMapper().writeValueAsString(OAuth2User.getAttributes()));
		} catch (Exception e) {
		}
		final String username = (String)OAuth2User.getAttributes().get("login");
		//현재 사용자가 어떤 OAuth2 제공자를 통해 로그인했는지 이름을 반환한다.
		final String authProvider = userRequest.getClientRegistration().getClientName();
		
		UserEntity userEntity = null;
		
		//유저가 존재하니 않으면 새로 생성한다.
		if(userRepository.existsByUsername(username) == false) {
			userEntity = UserEntity.builder()
							.username(username)
							.authProvider(authProvider)
							.build();
			//내욜을 넣은 userEntity 객체를 db에 저장
			userEntity = userRepository.save(userEntity);
		}
		log.info("Successfully pulled user info username {} authProvider {}",username,authProvider);
		return new ApplicationOAuth2User(userEntity.getId(), OAuth2User.getAttributes());
	}
	
}
