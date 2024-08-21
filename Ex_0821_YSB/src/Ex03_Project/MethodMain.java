package Ex03_Project;

import java.util.Scanner;

import Ex03_Project.MethodTest;

public class MethodMain {
	public static void main(String[] args) {
	System.out.print("숫자1,2를 입력하세요 : ");
	 Scanner sc = new Scanner(System.in);
	MethodTest test = new MethodTest();
	int num = sc.nextInt();
	if(num==1) {
		test.Change();
		
	}else if (num==2) {
		test.Change2();
	}else {
		System.out.println("잘못입력하셨습니다.1과2 중에 하나를 입력하세요");
	}
	}
}
