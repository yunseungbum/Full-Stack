package Ex04_if;

import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {//main문 시작
		int num = 5;
		if(num > 4) {//if문 시작
			System.out.println(num + "은 4보다 큽니다.");
			
		}//if문 종료
		else {//else문 시작
			System.out.println(num + "은 4보다 작습니다.");
		}//else문 종료
		
		//------------------------------------------------
		//두개의 숫자 비교하기
		int a = 4;
		int b = 10;
		
		if(a > b) {//if문 시작
			 System.out.println("a가 b보다 큽니다. ");
			
		}//if문 종료
		else {//else문 시작
			
			if( a == b ) { //if문 시작
				System.out.println("a가 b와 같습니다.");
			}//if문 종료
			
			System.out.println("a가 b보다 작거나 같습니다. ");
			
		}//else문 종료
		
		
		System.out.println("------------------------------------");
		
		//int형변수 x가 10보다 크고 20보다 작을 때  true인 조건식
		//char형변수 ch가 'x' 또는 'X'일 때 true인 조건식
		//char형변수 ch2가 알파벳(대문자 또는  소문자) 일 때  true인 조건식
		
	   int x = 14;
		if(10<x && x<20) {//if문 시작
			System.out.println("true");
		}//if문종료
		
	   char ch = 'x';
	   if(ch == 'x'|| ch == 'X') {//if문 시작
			System.out.println("true");
		}// if문 종료
	   
		char ch2 = 'B';
		if(64<ch2 &&  ch2 <91) { //if문 시작
			System.out.println("true");
		} //if문 종료
		
		else { //else문 시작
			if(96<ch2 && ch2 <123) 
			System.out.println("true");
		}//else문 종료
		
		//삼항연산자로 만들었던 x개의 농구공을 담기 위한 박스의 개수 구하기
		//조건문으로 만들기
		
		
		
		
	}
	
		

		
	}//main문 종료


