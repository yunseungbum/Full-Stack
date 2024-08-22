
/*  	break가 없으면 어떻게 될까??
 * 		실행은 되지만 맞는 명령부터 밑에 모든 명령이 실행된다.
 */

package ex01_switch;

public class Ex03_switch {
public static void main(String[] args) {//main시작
	
	
	
	int num = 7;
	
	switch(num) {//switch 시작
	case 1:
		System.out.println("num은 1입니다.");
		
	case 7:
		System.out.println("num은 7입니다.");
		
		default:
		System.out.println("num은 1도 7도 아닙니다.");
	}//switch 종료
	
	
	
}//main 끝
}
