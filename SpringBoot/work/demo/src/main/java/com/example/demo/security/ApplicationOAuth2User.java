package com.example.demo.security;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class ApplicationOAuth2User implements OAuth2User {

	private String id;
	private Collection<? extends GrantedAuthority> authorities;
	private Map<String, Object> attributes;
	public ApplicationOAuth2User(String id, Map<String, Object> attributes) {
		
		this.id = id;
		this.attributes = attributes;
		this.authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
		
		//singletonList()
		//단일 요소를 포함하는 불변 리스트를 생성한다.
		//여기서는 new SimpleGrantedAuthority("ROLE_USER")라는 하나의 권한 객체를
		//담고 있는 리스트를 생성하는데 사용된다.
		
		
		getAttributes();
	}//ApplicationOAuth2User 생성자 end
	@Override
	public Map<String, Object> getAttributes() {
		// TODO Auto-generated method stub
		return this.attributes;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return  this.authorities;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	
	
}
