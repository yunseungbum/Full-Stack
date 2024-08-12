package ex03_String;

import java.util.Scanner;

public class Ex04_String {
//	결과)
//
//	주민번호를 모두 입력하세요(-포함)
//	예)911223-203345
//	>> 991122-1122333
//	당신은 1999년 11월 22일에 태어난 남자입니다.
// 형식을 잘못 입력했을 때는 "주민번호를 올바르게 입력하세요"라고 출력하기
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요");
		String str = sc.next();
		
		
		System.out.println(str.substring(7,8));
		if(Integer.parseInt(str.substring(2,4))<24 ||Integer.parseInt(str.substring(2,4))<13 ||Integer.parseInt(str.substring(4,6))<31)
				{System.out.println("잘못된 입력 입니다. 다시 입력하세요");
				
				}else {
					if(str.substring(0,1) != "0") {
						System.out.print("당신은 19"+str.substring(0,2)+"년 " +str.substring(2,4)+"월"+str.substring(4,6)+"에 태어난");
						
						}else {
							System.out.print("당신은 20"+str.substring(0,2)+"년 " +str.substring(2,4)+"월"+str.substring(4,6)+"에 태어난");
						}
						
						if(str.substring(7,8) == "1") {
							System.out.println("남자입니다.");
						}
						else if(str.substring(7,8) == "1"){
							System.out.println("여자입니다.");
						}
				}
 
		
		
		
}
}
