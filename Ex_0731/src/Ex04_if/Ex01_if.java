package Ex04_if;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {//main문 시작
		int result = 0;
		
		if( 3 > 2) {//if문 시작
			result = 3;
			int n = 10;
		}//if문 종료
		
		System.out.println(result);
		//System.out.println(n);
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("나이를 입력해 주세요 :");
		int age = sc.nextInt();
		if(age > 19) {//if문 시작
			
			System.out.println("성인입니다.");
			
		}//if문 종료
		
		System.out.println("성인이아닙니다.");
		
	}//main문 종료

}
