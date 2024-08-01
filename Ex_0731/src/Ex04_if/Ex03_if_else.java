package Ex04_if;

import java.util.Scanner;

public class Ex03_if_else {
	public static void main(String[] args) {
		
	
	//삼항연산자로 만들었던 x개의 농구공을 담기 위한 박스의 개수 구하기
			//조건문으로 만들기
	Scanner scan = new Scanner(System.in);
	System.out.println("공이 몇개 입니까? : ");
	int ball = scan.nextInt();
	int box = 5;
	int total = ball/box;
	int num =  ball%box;
	if(num > 0) {//if문 시작 
		total++;
	}//if문 종료 
	
	System.out.println(total);
		
	}
	
}
