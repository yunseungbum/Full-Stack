package ex07_test;

public class CalcMain {
	public static void main(String[] args) {
		//추상클래스는 직접 객체화 할수 없다.
		Calculator calc = new GoodCalc();
		int [] a = {1,2,3,4,5};
		System.out.println("합 :" +calc.add(4,5));
		System.out.println("차 :" +calc.substract(5,6));
		System.out.println("평균 :" +calc.average(a));
	}
}
