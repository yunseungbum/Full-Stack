package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {//main 시작
		//10이하의 숫자를 키보드에서 입력받는다.
		//해당 숫자가 짝수인지 홀수인지 판별하는 코드를 
		//switch로 작성해 주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int di = num%2;
		switch(di) {//switch 시작
		case 1:
			System.out.println("홀수입니다.");
			break;
			
			default:
			System.out.println("짝수입니다.");
				
		}//switch 종료
		
		//키보드에서 달(month)를 입력받아
		//해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요
		//결과
		//x월은 x일까지 있습니다.
		
	
		System.out.print("월을 입력하세요: ");
		int month = scan.nextInt();

		switch(month) {//switch 시작
		case 1:
			System.out.println("1월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println("2월은 29일까지 있습니다.");
			break;
		case 3:
			System.out.println("3월은 31일까지 있습니다.");
			break;
		case 4:
			System.out.println("4월은 31일까지 있습니다.");
			break;
		case 5:
			System.out.println("5월은 31일까지 있습니다.");
			break;
		case 6:
			System.out.println("6월은 30일까지 있습니다.");
			break;
		case 7:
			System.out.println("7월은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println("8월은 31일까지 있습니다.");
			break;
		case 9:
			System.out.println("9월은 30일까지 있습니다.");
			break;
		case 10:
			System.out.println("10월은 31일까지 있습니다.");
			break;
		case 11:
			System.out.println("11월은 30일까지 있습니다.");
			break;
		case 12:
			System.out.println("12월은 31일까지 있습니다.");
			break;
			
			default:
				System.out.println("잘못 입력하셨습니다. 1-12 사이의 숫자만 사용해주세요.");
			break;
		
		
		} //switch 끝
		
		//-----------------------------------------------------
		//계산기 프로그램 만들기
		//두 개의 정수를 입력 받는다.
		//산술 연산자도 입력받아서 문자열에 담는다
		//switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.print("사칙연산 기호를 넣어주세요: ");
		String str = scan.next();
		System.out.print("숫자를 입력하세요: ");
		int num2 = scan.nextInt();
		
		
		switch(str) {//switch(str)시작
		case"*":
			System.out.println(num1 * num2);
			break;
			case"/":
			System.out.println(num1 / (double)num2);
			break;
			//수학적인 나누기를 하려면 숫자 하나를 double로 형변환을 하면 된다. 
		case"+":
			System.out.println(num1 + num2);
			break;
		case"-":
			System.out.println(num1 - num2);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 질문에 알맞은 기호나 수를 넣어주세요");
		break;
		
		}//switch(str)종료
		
		
		
		
		
	}//main 종료

}
