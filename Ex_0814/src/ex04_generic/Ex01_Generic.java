package ex04_generic;

/*	제네릭 타입 범위 한정하기
제네릭에 타입을 지정해줌으로서 클래스의 타입을 컴파일 타임에 정하여 타입 예외에 대한 안정성을 확보하는 것은 좋지만 
문제는 너무 자유롭다는 점이다.
* 
* 
* 타입 한정 키워드 extends
<T extends [제한타입]>
*/



//숫자만 받아 계산하는 계산기 클래스 모듈
class Calculator<T extends Number>{
void add(T a,T b) {};
void min(T a,T b) {};
void mul(T a,T b) {};
void div(T a,T b) {};


}

public class Ex01_Generic {
public static void main(String[] args) {
	
	//제네릭에 아무 타입이나 모두 할당이 가능
//	Calculator<Number> cal1 = new Calculator<>();
//	Calculator<Object> cal2 = new Calculator<>();
//	Calculator<String> cal3 = new Calculator<>();
//	Calculator<Ex07_Generic> cal4 = new Calculator<>();
	
	//제레릭에 아무 타입이나 모두 할당이 가능해서 문제가 될 수 있었지만
	//extends를 사용하고 타입을 어느정도 제한 시킬 수 있다.
	//타입 한정 키워드 사용 후
	Calculator<Integer> cal5 = new Calculator<>();
	Calculator<Double> cal6 = new Calculator<>();
	
}

}
