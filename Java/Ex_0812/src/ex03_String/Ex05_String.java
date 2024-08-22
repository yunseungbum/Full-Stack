package ex03_String;

import java.util.Scanner;

public class Ex05_String {
	public static boolean main(String[] args) {
		//문자열 s는 키보드에서 입력받기
		//문자열 s의 길이가 4 또는 6이고, 숫자로만 구성되어있는지
		//확인하는 코드 만들기
		//예시 "a234"면 False,"1234"면 True
		
		//제한사항
		//s는 영문 알파벳 대소문자 또는 0~9까지의 숫자로 이루어져있습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요");
		String s = sc.next();
		
		
		
		
	
		if(s.length() == 4 || s.length() ==6) {
			try {
				int n = Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;
			}
			
			
			}return false;
		
		}
	
	

}
