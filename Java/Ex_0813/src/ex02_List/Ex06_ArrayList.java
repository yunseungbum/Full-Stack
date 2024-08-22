package ex02_List;

import java.util.ArrayList;
import java.util.List;

public class Ex06_ArrayList {
	public static void main(String[] args) {
		Person p1 = new Person();
	//	p1.name = "홍길동";
		p1.age = 20;
		 
		Person p2 = new Person();
//		p2.name = "김자바";
		p2.age = 30;
	
		List<Person> list = new ArrayList<>();
		
		//객체를 리스트에 저장
		list.add(p1);
		list.add(p2);
		list.get(0).setName("홍길동");
		list.get(0).setAge(20);
		
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAge());
	}
}
