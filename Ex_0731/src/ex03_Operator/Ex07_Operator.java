package ex03_Operator;

import java.util.Scanner;
public class Ex07_Operator {
	public static void main(String[] args) {
		//과수원에서 배,사과,오렌지를 하루에 각각 5,7,5씩 생산한다.
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		/*int a = 5;
		int b = 7;
		int c = 5;
		int d = a+b+c;
		System.out.println("하루 총 생산 된 과일: "+ d );
		double e = (double) d / 24;
		System.out.printf("시간당 총 생산량 : %.2f\n" , e );
		*/
		//------------------------------------------------
		//상자 하나에는 농구공이 5개가 들어 갈 수있다.
		//만일 농구공이 23개라면 몇개 상자가 필요한가?
		
		int box = 5;
		int ball  = 23;
		int result1 = ball/box;
		int  result2 = (ball/box)<5 &(ball/box)>0?1:0;
		
		
		
		//------------------------------------------------
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력 받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균출력하기
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60이상일때 합격
		//아니면 불합격
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int k = scan.nextInt();
		scan.nextLine();
		System.out.print("영어 점수를 입력하세요 : ");
		int e = scan.nextInt();
		scan.nextLine();
		System.out.print("수학 점수를 입력하세요 : ");
		int m = scan.nextInt();
		scan.nextLine();
		
		int total = (k+e+m);
		System.out.printf("세 과목 총합은 : %d \n", total);
		double avg = (k+e+m) / 3.0;
		System.out.printf("세 과목 평균은 : %.1f \n",avg);
		
		String result = (k >= 40 && e >= 40 && m >= 40 && avg >= 60)?"합격":"불합격";
		System.out.println(result);
		
		
	
	
		 
	
		
		
		
		
		
		
	
		
	}

}
