package ex04_exception;

public class Ex01_Exception {
public static void main(String[] args) {
	
		
		//배열을 변수를 만들기만 하고 선언하지 않음
		String[] strArray = null;
		
		//생성되지 않은 배열을 호출하려고 하니 에러 발생
		System.out.println("strArray[0] = " + strArray[0]);
		
	}

}
