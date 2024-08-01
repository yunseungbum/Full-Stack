package ex03_Operator;

public class Ex05_Operator {
public static void main(String[] args) {
	//논리연산자
	//피연산자를 두개 필요로 하는 연산자
	//피연산자로 논리형 데이터만 사용이 가능하다.
	
	//&&
	//and(그리고)의 의미를 가지고 있다.
	//앞뒤의 피연산자가 모두 ture면 ture를 반환한다.
	
	System.out.println(true && true);
	
	int myAge = 30;
	int limit = 35;
	boolean result = (limit-myAge) < 5 && (myAge+=1) > 30;
	System.out.println(result);
	System.out.println(myAge);
	//앞이 false면 뒤에는 연산하지 않는다.
	
	// ||(또는) or의 의미를 가지고 있다.
	// 앞 뒤의 피연사 중 하나라도  true면 true를 반환한다.
	
	int n1 = 10;
	int n2 = 20;
	boolean result2 = (n1+=10) > 20 || n2 - 10 == 11;
	System.out.println(result2);
	
}
}
