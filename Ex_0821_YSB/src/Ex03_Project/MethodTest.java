package Ex03_Project;

import java.util.Scanner;

public class MethodTest {

 public void  Change() {
	 Scanner sc = new Scanner(System.in);
	  
	    double cel;
	    double faher;
	 
	System.out.println("섭씨를 입력하세요 : ");
	cel = sc.nextInt();
	faher = 1.8*cel+32;
	System.out.println("화씨로 변환된 온도는 "+faher+"입니다.");
	
	 
	 
	 
 }
 public void  Change2() {
	 Scanner sc = new Scanner(System.in);
	  
	    double cel;
	    double faher;
	 
	System.out.println("섭씨를 입력하세요 : ");
	faher = sc.nextInt();
	cel = (faher-32)/1.8;
	System.out.println("화씨로 변환된 온도는 "+cel+"입니다.");
	
	 
	 
	 
 }
}
