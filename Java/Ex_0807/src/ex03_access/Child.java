package ex03_access;

import ex02_modifier.Parent;

public class Child extends Parent{
	
	void accesssTest() {
		super.accessProtected();//protected가 붙은 메서드도 이 방법으로 접근이 가능핟.
		
		Parent p1 = new Parent();
		//p1.accessProtected();자식클래스더라도, 객체로 접근하는 것은 불가능하다.
		
		
	}

}
