package ex06_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {
	
	public static void checkYourSelf(Scanner sc) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2.혼자 있는 것이 좋다.");
		System.out.println("선택: ");
		int check = sc.nextInt();
		if(check == 1) {
			System.out.println("당신은 E");
		} else {
			System.out.println("당신은 I");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("---성격 유형 검사를 시작합니다.---");
		} catch(Exception e){
			System.out.println("키보드 입력이 잘못되었습니다.");
			
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
