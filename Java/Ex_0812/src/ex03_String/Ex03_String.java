package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		//회문 판별하기
		//회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장.
		//기러기,토마토,스위스,별똥별,다시합창합시다
		//키보드에서 문장을 입력 받고 해당 문장이 회문이면
		//xxx는 회문입니다. 아니면 xxx는 회문이 아닙니다 라고 출력하기
		
		
		String str = "";
		String str2 = "";
		System.out.print("회문을 입력하세요");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		
		for(int i = str.length(); i>0; i--) {
		str2 += str.charAt(i-1);
		
			
		}
		if(str.equals(str2)) {
			System.out.println(str +"은 회문입니다.");
		} else
			System.out.println(str +"은 회문이 아닙니다.");
	}

}
