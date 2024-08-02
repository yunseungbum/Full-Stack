/*	while문
 * -for문은 정해진 횟수만큼 반복을 하는 문법
 * -while문은 반복횟수가 정해져 있지 않고, 조건식이 true일경우 계속해서 반복하는 문법
 * 반복하는 문법
 * -주의 하지 않으면 무한루프에 빠질 수 있다.
 * 
 * 기본형태
 * while(조건식) { 조건식이 참일 때 반복할 명령}
 * 
 * while문은 for문처럼 시작값과 증감값을 가지고 있지 않다.
 */




package ex03_while;

import java.util.Scanner;

public class Ex01_while {
	public static void main(String[] args) {//main 시작
		
		int num =1;//초기식
		 while(num <=10) {//while 시작
			 
			 System.out.println(num);
			 num++;//증감식
			 
		 }//while 끝
		
		 
		 System.out.println("-----------------------------");
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
//		 int n = 0 ;
//		 while(n != -1) {//while 시작
//			 System.out.println("정수 입력 : ");
//			 n = sc.nextInt();
//			 System.out.println("입력된 정수 : " + n);
			 
			 
//		 }//while 끝
		 
		 //각 자리수의 합 구하기
		 //정수형 변수 n이 있을때, 각 자리의 합을 더한 결과를 출력하세요.
		//n의 값이 12345라면,1+2+3+4+5의 결과인 15를 출력하세요.
		//n의 값은 키보드에서 받기
	
		
		
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		 int sum = 0;
		 while(n > 0) {//while 시작
			 sum += n%10;
			 n = n/10;
		
	}//while 끝
System.out.println("각 자리수의 합: " + sum);


System.out.println("--------------------------------");
//두 개의 주사위를 던졌을 때, 눈의 합이 6이되는 모든 경우의 수
//출력하기
//ex)결과
//1, 5
//2, 4
//3, 3
//3, 3
//4, 2
//5, 1
	int x = 1;
	
	while(x <= 6) {//while(x) 시작
		int y =1;
		while(y <= 6) {//while(y) 시작
			if(x+y ==6) {
				System.out.println(x + ", " +y);
			}
			y++;
		}//while(y)끝
		
		x++;
		}//while(x) 끝




		 
		
		
		
	}//main 종료

}
