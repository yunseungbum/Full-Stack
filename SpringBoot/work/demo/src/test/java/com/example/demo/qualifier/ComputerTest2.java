package com.example.demo.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
//테스트에 필요한 의존성을 대신 제공
public class ComputerTest2 {
	
	@Autowired @Qualifier("desktop") 
	Computer computer;//주입을 해주려고 할텐데 이 자리에 Dsektop,Laptop 모두 올 수 있다.
	
	@Test
	public void widthTset() {
		System.out.println(computer.getScreenWidth());
		
	}
	
	
}
