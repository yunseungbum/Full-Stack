package ex03_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4,5,1,2,10};
		mt.maxFinder(arr);
		
		
		int x,y;
		String str;
		MethodTest test = new MethodTest();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		x = sc.nextInt();
		
		System.out.print("숫자를 입력하세요 :");
		y = sc.nextInt();
		
		
		System.out.println("연산기호를 입력 : ");
		str = sc.next();
		
		int result = test.getResult(x,y,str);
		System.out.print("연산 결과 : " + result);
		
	}
}
