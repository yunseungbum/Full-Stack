package ex04_generic;

interface Person {
}

// 인터페이스를 구현하는 클래스
class Student implements Person{

	
}

class Worker{
	
}

 class School < T extends Person> {
	 
 }


public class Ex02_Generic {
	public static void main(String[] args) {
		
		//Worker클래스가 Person인터페이스를 구현하지 않았기 때문에 불가능
		//School<Worker> s = new School<>();
		School<Student> s = new School<>();
	}

}
