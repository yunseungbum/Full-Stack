/* 제네릭 사용시 주의사항
 * 1.제네릭 타입의 객체는 생성할 수 없다.
 * -제네릭 타입 자체로 타입을 지정하여 객체를 생성하는 것은 불가능하다.
 * 
 * 2.static 멤버에 제네릭 타입이 올 수 없음
 * -static 변수의 데이터 타입으로 제네릭 타입 파라미터가 올 수는 없다.
   -왜냐하면 static 멤버는 클래스가 동일하게 공유하는 변수로서 제네릭 객체가 
    생성되기도 전에 이미 자료 타입이 정해져 있어야 하기 때문이다.
    
   2-1 static 메서드의 반환타입으로 사용이 불가능하다.
   public staic T getAge(int n ) {		} -> X
   
   2-2 static 메서드의 매개변수의 타입으로 사용이 불가능하다.
   public staic void getAge(int n ) {		} -> X
   
   3. 제네릭으로 배열 선언 주의점
   -기본적으로 제네릭 클래스 자체를 배열로 만들 수는 없다.
   	Student<Integer> [] arr1 = new Student<>[10]; -> X
   -제네릭 타입 파라미터에 클래스가 타입으로 온다는 것은, 
    클래스끼리 상속을 통해 관계를 맺는 객체 지향 프로그래밍의 다형성의 원리가 그대로 적용이 된다는 뜻이다.
 */


package ex03_generic;

public class Ex01_Generic {
	public static void main(String[] args) {
		
		//객체를 생성하면서 제네릭 변수에 타입이 결정된다.
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("100");
			System.out.println(v1.getValue());
			
			GenEx<Integer> v2 = new GenEx<Integer>();
			v2.setValue(1000);
			System.out.println(v2.getValue());
			
			GenEx<Character> v3 = new GenEx<Character>();
			v3.setValue('B');
			System.out.println(v3.getValue());
			
			GenEx<Double> v4 = new GenEx<Double>();
			v4.setValue(3.14);
			System.out.println(v4.getValue());
		
	}

}
