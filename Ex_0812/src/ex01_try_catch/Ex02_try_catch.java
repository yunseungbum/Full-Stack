package ex01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("당신의 나이를 입력하세요");
			int age = sc.nextInt();
			
			
			if(age < 0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			if(age > 19 ) {
				System.out.println("성인입니다.");
			} else if(age > 13) {
				System.out.println("청소년입니다.");
			}else if( age > 6) {
				System.out.println("어린이입니다.");
			} else {
				System.out.println("아동입니다.");
			}
			
			
		}	catch(Exception e){
				System.out.println(e.getMessage());
			};
			
		}
	}


