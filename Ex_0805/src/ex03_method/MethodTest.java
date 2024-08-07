package ex03_method;

import java.util.Arrays;

public class MethodTest {
	//배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	//배열의 매개변수로 전달받는다.
	void maxFinder(int[]arr) {
	Arrays.sort(arr);
	System.out.println("최대값 : " + arr[arr.length-1]);
			
	
	}//maxFinder 끝
	
	//계산기 만들기
	//Main에서 숫자 두개랑,산술연산자를 전달 받아서 계산을 해서 반환하는
	//getResult()메서드 작성하기
	
	int getResult(int x,int y,String str) {
		
		if(str.equals("+")) {
			return x + y;
			}
		else if (str.equals("-")) {
			return x - y;
		}
		else if (str.equals("*")) {
			return x * y;
		}
		else if (str.equals("/")) {
			return x / y;
		}else
			System.out.println("연산기호가 올바르지 않습니다.");
		return -1;
		
	}
	
	

}
