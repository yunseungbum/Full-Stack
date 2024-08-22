package ex03_method;

public class Calc {
	
	//두 수를 더하는 sum메서드 만들기
	//"두 수의 합은 x입니다." 라는 출력문 작성하기
	
	 void add( int x,int y) {
		System.out.println("두 수의 합은 "+ (x + y)+ "입니다.");
	}//sum 종료
	 
	 int sum(int[] nums) {
		 int result = 0;
		 for(int i = 0; i < nums.length; i++) {
			 result += nums[i];
			 
		 }//for 끝
		 //System.out.println("숫자들의 합은 : " + result + "입니다.");
		 return result;
	 }//sum(int[] nums)끝
	 

}
