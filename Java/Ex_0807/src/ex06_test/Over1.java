package ex06_test;

public class Over1 {
	public static void main(String[] args) {
		Over1 a1 = new Over1();
		Over2 a2 = new Over2();
		System.out.println(a1.sum(3, 2) + a2.sum(3, 2));
		//답 11 
	}
	
	int sum(int x, int y) {
		return x + y;
	}
}
class Over2 extends Over1{
	@Override //자식 개체를 호출 할때 final이 없다면 Override 먼저 호출 된다.
	int sum(int x, int y) {
		return x - y + super.sum(x, y);
	}
}
