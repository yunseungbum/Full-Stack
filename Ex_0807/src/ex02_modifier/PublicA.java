package ex02_modifier;

public class PublicA {
	public int a;
	
	private PublicA (int a) {
		this.a=a;
		
	}
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드이다.");
		
	}
	
	
	DefaultC dc = new DefaultC();
	
	void methodA() {
		dc.variableC = 20;//public으로 선언된 필드이기 때문에 사용 가능
		
	}

}
