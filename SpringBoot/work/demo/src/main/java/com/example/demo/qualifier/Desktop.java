package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
//default값으로 사용할 클래스으로 사용할 클래스에 @Primary 어노테이션을 붙힌다.
@Qualifier("deskTop")
public class Desktop implements Computer{

	@Override
	public int getScreenWidth() {
		// TODO Auto-generated method stub
		return 1920;
	}
	
}
