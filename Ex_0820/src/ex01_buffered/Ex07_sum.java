	//문제
		//N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 함해서 출력하는 프로그램을 작성하세요
		
		//입력
		//N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		//출력
		//입력으로 주어진 숫자 N개의 합을 출력
		
		//예시
		//1
		//1
		//결과
		//1
		
		//5
		//54321
		//결과
		//15
		
		//25
		//70000000000000000000
		//결과 
		//7

		//11
		//10987654321
		//결과
		//46
		

package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_sum {
	public static void main(String[] args) throws IOException { 
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 개수 입력 : ");
		int n = Integer.parseInt(buffer.readLine());
		System.out.print("개수에 맞는 숫자열 입력 : ");
		String str = buffer.readLine();
		
		 int total = 0;
		for(int i = 0 ; i<str.length();i++) {
			char c = str.charAt(i);
			
			 total += c - '0';
			
		}
		
		System.out.println("총합: " + total);
		
		
		
		
	}

}
