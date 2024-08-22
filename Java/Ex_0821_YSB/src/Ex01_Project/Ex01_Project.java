package Ex01_Project;

import java.util.Scanner;

public class Ex01_Project {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i =1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
