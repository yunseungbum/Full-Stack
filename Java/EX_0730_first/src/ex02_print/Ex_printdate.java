package ex02_print;

public class Ex_printdate {
	public static void main(String[] args) {
		//정수형 데이터: 소수점이 없는 숫자 1,24,100, -50, -255 ...
		//실수형 데이터: 소수점이 있는 숫자 1.23,3.14 ...
		//문자형 데이터: 홑따옴표로 감싼 한글자 'a','f','e'...
		//문자열 데이터: 쌍따옴표로 감싼 글자  "안녕하세여","Hello World"....
		
		System.out.println(100);
		System.out.println(100+50);
		System.out.println("안녕하세요"+50);
		//문자열 앞뒤에 오는 더하기는 "연결의 의미"
		//"안녕하세요50"
		System.out.println(5+10+":"+5+10);
		//계산식 1. 5+10 =15 2. 15+: = 15: 3.15 : 5+10= 15:510 (뒤에 5+10은 문자로 의미)
		System.out.println(5+10+":"+(5+10));
		
		System.out.println();
	}

}
