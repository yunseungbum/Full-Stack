
 /* switch
 * -if문과 비슷하지만 조건식에 들어가야 하는것과 달리
 * -switch에 조건으로 들어 갈 수 있는 연산자는 '=='밖에 없다.
 * 즉, 두 개의 피연산자 값이 같을때만 조건으로 활용할 수 있다.
 * 
 *switch(비교값){ case 조건값1: 비교값과 조건값1이 일치할 때 실행 할 명령 
 *					break;
 *				case 조건값2: 비교값과 조건값2이 일치할 때 실행 할 명령 
 *					break;
 *				case 조건값3: 비교값과 조건값3이 일치할 때 실행 할 명령 
 *					break;
 *				default: 비교값과 일치하는 조건값이 없을 때 실행 할 명령 }
 */



package ex01_switch;

public class Ex01_switch {
public static void main(String[] args) {//main 시작
	int num = 7;
	
	//1. 비교값과 조건값의 타입은 일치해야 한다.
	//2. 중복되는 조건값을 받을 수 없다.
	
	switch(num) {//switch 시작
	case 1:
		System.out.println("num은 1입니다.");
		break;
	case 7:
		System.out.println("num은 7입니다.");
		break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
	}//switch 종료
	
	
	//if vs switch
	//둘 다 조건에 따라 명령을 실행하는 문법
	//if문은 범위에 따라 조건을 비교하는데 효과적이고
	//switch문은 값을 1대1로 비교하는데 효과적이다.
	
}//main 종료
}
