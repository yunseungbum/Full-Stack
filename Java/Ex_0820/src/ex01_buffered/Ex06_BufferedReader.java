package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex06_BufferedReader {
	public static void main(String[] args) throws IOException { 
		//Scanner -> 무겁고 느리다.
		//BufferedReader -> 보조스트림을 사용하면 더 빠르지 않을까?
		
		//System.in
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = buffer.readLine();
		System.out.println("입력된 문자열 : " + str);
		
		//정수입력받기
		System.out.println("정수 입력 : ");
		int n = Integer.parseInt(buffer.readLine());
		System.out.print(n+1);
		
		System.out.println( " ");
		//공백으로 구분된 정수 입력받기
		System.out.println("여러개 정수 입력 받기 : ");
		String [] iArr = buffer.readLine().split(" ");
		System.out.println(Arrays.toString(iArr));
		
		
		
	
	}
}
