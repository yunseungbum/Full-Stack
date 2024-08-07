package Ex07_class_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Ex02_class_casting {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();//1차 상속 관계가 아니더라도 자동 타입 변환 가능
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		//Bus b3 = new OpenCar(); 오류
		
		//타입을 부모타입으로 변환한 객체는, 더이상 자신의 클래스에 추가한 멤버를 사용 할 수 없다.
		//부모클래스에 선언된 멤버만 사용 가능하다.
		//단, 부모 클래스의 메서드를 오버라이딩 한 경우 메서드의 경우에는 자식 객체의 것을 호출할 수 있다.
		
		//어떻게 타입변환을 해도 오버라이딩 된 메서드가 호출이 될까??
		//메서드가 실행 시점에 성격이 결정되는 동적바인딩을 하기 때문이다.
		//프로그램의 컴파일 시점에는 실행되는 메서드가 부모클래스의 것인지 하위클래스의 것인지 알기 어렵다.
		//실행 시점에 동적 바인딩이 일어나 부모가 자식 클래스의 멤버함수를 접근하여 실행할 수 있다.
		
		
	}

}
