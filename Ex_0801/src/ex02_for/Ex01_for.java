/*반복문
 * -특정수행문을 원하는 만큼 반복하여 실행하는 제어문
 * 
 * 반복문의 종류 
 * for,while
 * 
 * for문
 * -주로 반복횟수가 정해져있을 때 사용하는 문법
 * 
 * for(초기식;조건식;증감식;){   
 * 	 반복하고싶은 명령  
 * 	명령은 여러개 일 수 있다. ex)산술연산,대입,출력,조건비교(if문이 또 들어 갈 수있다)   }
 * 초기식: 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
 * 조건식: 반복을 하기 위한 종료값으로 비교연산자를 많이 사용한다.
 * 증감식: 초기식의 변수의 값을 증감시켜주는 역할(증감연산자를 많이 사용)
 * 
 */


package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {//main 시작
		
		for(int i =0; i <3; i++) {//for(int)시작
			
		System.out.println(i);
			
			
	}//for(int)종료
		
		
		
		System.out.println("------------------------------------");
		//1 2 3 4 5 6 7 8 9 10
		
		for(int i = 1; i<11; i++) {//for(i) 시작
			
			System.out.print(i + " ");
			
		}//for(i) 종료
		
		System.out.println();
		
		for(int i = 10;i>0; i--) {//for 시작
			System.out.print(i + " ");
		}//for 종료
		
		System.out.println();
		
		//1 ~ 20까지 홀수만 출력하기
		for(int i =1; i<=20; i+=2) {//for 시작
			System.out.print(i + " ");
		}//for 종료
		
		System.out.println();
		
		//1~10까지 3의 배수만 출력하기
		
		for(int i = 1; i <=10; i++) {//for 시작
	if(i % 3 ==0) {//if시작
			System.out.print(i+" ");
		}//if종료
	}//for 종료
		
		System.out.println();
		
		//1부터 10까지의 총합 구하기
		//총 합은 한번만 출력하세요!
		
		int sum = 0;
		
		for(int i = 1;i<=10; i++) {//for 시작
			
			sum +=i;
			
			}//for 종료
		System.out.println(sum);
		
		System.out.println();
		
		//정수형 변수 dan에 2~9사이의 값으로 초기화 하고
		//해당 dan에 해당하는 구구단 출력하기
		//2 x 1 = 2
		//2 x 2 = 4
		
		int dan = 4;
		int total = 0;
		
		for(int i = 1; i <= 9; i++) {//for문시작
			
			total = (dan*i);
			System.out.printf("%d x %d = %d\n" ,dan,i,total);
			
			
		}//for 종료
		
		
		//키보드에서 정수를 하나 입력 받아
		//1부터 입력받은 수 까지의 총합을 구하세요
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		int nt = 0;
		for(int i =1;i<=num;i++) {
			nt +=i;
			
		}
		System.out.println(" 총 합 :" + nt);
		
		//10개의 정수를 입력 받아 그 중에 짝수가 몇개인지
		//개수를 출력해주세요
		
		
	
//		int count = 0;
//		
////		for(int i=1;i<=10;i++) {//for 시작
////			System.out.print("정수를 입력하세요.");
////			int n = sc.nextInt();
////			if(n%2==0) {//if시작
////				
////				count++;
////				
////				
////				
////			}//if종료
////			
////			
////		}//for종료
////		
////		System.out.println("짝수의 개수: " + count);
////		
		
		
	//키보드로부터 정수를 두 개입력 받는다.
	//입력 받은 x부터 y까지의 총합을 출력하세요.	
	//예를 들어 2와5를 입력받으면
		//2+3+4+5를 한 14가 출력이 되야 한다.
		//단,x가 y보다 큰경우
		//x와 y의 값을 바꿔서 총합을 구한다.
		
		 System.out.print("정수를 입력하세요.");
		 int x = sc.nextInt();
		 
		System.out.print("정수를 입력하세요.");
		 int y = sc.nextInt();
		
		
		if(x>y) {//if 시작
			int z = x;
			x = y;
			y = z;
			
			
		  }//if 끝
		sum = 0;
		for(int i =x; i <=y; i++) {//for 시작
			sum+= i;
		}//for 끝
		System.out.printf("%d부터 %d까지의 총합: %d",x,y,sum);
		
		
		
		
}//main 종료
}
