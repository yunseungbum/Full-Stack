package ex04_extends;

public class CarMain {
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		sb.takePerson();
		sb.ride();
		
		//자바 상속의 특징
		//내가 원하는 만큼 상속이 가능하다
		//다중상속은 불가능하다
		//한개의 부모클래스는 여러개의 자식클래스를 갖는 것은 가능하다
		
	}
}
