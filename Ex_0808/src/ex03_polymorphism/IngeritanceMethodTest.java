package ex03_polymorphism;

class  Parent{
	public void display() {
		System.out.println("부모 클래스의 display()메서드이다.");
	}
}

class Child extends Parent{
	//오바라이딩 된 메서드
	@Override
	public void display() {
		System.out.println("자식 클래스의 display() 메서드이다.");
	}
	
	//오버로딩 된 메서드
	public void display(String str) {
		System.out.println(str);
	}
}
public class IngeritanceMethodTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display()메서드입니다.");
	}

}
