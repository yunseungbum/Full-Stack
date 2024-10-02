package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//스프링에선 해당 클래스를 설정파일로 인식하고 Bean으로 등록한다.
@Configuration
public class WebNvcConfig implements WebMvcConfigurer{
	//WebMvcConfigurer
	//스프링 MVC 동작을 커스터마이징 할 때 사용된다.
	//스프링은 기본적으로 MVC동작을 설정해주지만, 때로는 프로젝트 요구사항에 맞게 특정 기능을 추가하거나
	//수정해야 할때 WebMvcContiturer을 구현하여 원하는 설정을 적용할 수 있다.
	
	//CORS 주요 기능
	
	//브라우저가 CORS요청 결과를 캐싱하는데 최대 시간 설정
	private final long MAX_AGE_SECS = 3600;
	
	 @Override
	   public void addCorsMappings(CorsRegistry registry) {
	      // 모든 경로에 대해 CORS 설정을 적용
	      registry.addMapping("/**")
	      //React 애플리케이션이 실행되는 도메인에서 오는 요청을 허용
	      .allowedOrigins("http://localhost:3000")
	      // http 메서드 허옹
	      .allowedMethods("GET","POST","PUT","DELETE")
	      // 모든 헤더를 허용
	      .allowedHeaders("*")
	      //쿠기나 인증 정보를 포함한 요청을 허용
	      .allowCredentials(true)
	      .maxAge(MAX_AGE_SECS);
	   }
	}
