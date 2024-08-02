/* break
 * break문은 이전에 switch문을 학습할 때 case문을 종료할 때 사용되었다.
 * break라는 단어의 의미와 동일하게 반복문을 미리 종료할 때 사용한다.
 * 반복문이 진행되는 도중, 특정 조건을 만족해 더 이상 반복문을 실행 할 필요 없이 종료하려고할 때 사용
 * 
 */

package ex02_control;

import java.util.Scanner;

public class Ex02_break {
	public static void main(String[] args) {//main 시작
		
		//난수의 생성
		//1.Random 클래스 :0.0 ~ 1.0숫자를 랜덤으로 만들어줌
		//2.Math 클래스(java.lang패키지에 있는 클래스)
		
		//import java.util.Scanner; <- 없어도 실행되는 이유
		//Mate 클래스가 static의 정의되어있기 때문이다.
		
		//Random  rnd = new Random();
		//int r = rnd.nextInt(50)+1; <- 1~50까지 랜덤 수 생성
		
		int magicNumber = (int)(Math.random()*50)+1; 
		Scanner sc = new Scanner(System.in);
		
		
		
		//총합 -> 총합을 담아줄 변수
		//개수 -> 개수를 세서 담아줄 변수
		//이지선다 -> 논리형변수를 만들어서 사용
		
		boolean isMatched = false;
		
		for(int i = 0; i < 10; i++) {//for문 시작
			
			System.out.println("찾는 숫자를 입력 : ");
			int guess = sc.nextInt();
			
			if(guess == magicNumber) {//if(guess == magicNumber)시작
				
				System.out.println((i+1)+"번째에 맞췄습니다.");
				isMatched = true;
				break;
				
				
			}//if(guess == magicNumber) 종료 
			
			else if(guess > magicNumber) {
				
				System.out.println("Down!");
				
			}//else(guess > magicNumber) if 종료
			
else if(guess < magicNumber) {
				
				System.out.println("Up!");
				
			}//else if(guess < magicNumber) 종료
			
			//정답을 못맞춘 경우에는 "정답을 맞추지 못했습니다." 라고 출력하기
			
			
			
			
			
			
			
		}//for문 종료
		
		if(isMatched == false) {
			System.out.println("정답을 맞추지 못했습니다.");
			
		}//if(isMatched)종료
		
		
		//기타제어문 (continue,break)의 특징
		//1.기타제어문 바로 아래는 어떠한 코드도 올 수 없다.
		//2.반복문 안에서만 사용 가능하다.
		//3.다중 반복문일 때 기타 제어문을 가지고 있는 반복문에 대해서만 적용이 된다.
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j =1; j<=5;j++){
				
				if(j % 2 == 0) {
					//continue; 
					break;
				}//if(j) 종료
				
				System.out.println(j + "");
				
			}//for(j) 종료
			
			System.out.println();
			
		}//for(i) 문 종료
		
		System.out.println("---------------------------------------");
		//라벨을 이용하면 내가 원하는 반복문에 적용시킬 수 있다.
		happy:for(int i = 1; i <= 3; i++) {
			
			for(int j =1; j<=5;j++){
				
				if(j % 2 == 0) {
					//continue; 
					break happy; //기타 제어문 뒤에 쓴다.
				}//if(j) 종료
				
				System.out.println(j + "");
				
			}//for(j) 종료
			
			System.out.println();
			
		}//for(i) 문 종료
		
		
	}//main 종료

}
