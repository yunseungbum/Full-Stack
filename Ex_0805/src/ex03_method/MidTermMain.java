package ex03_method;

public class MidTermMain {
	public static void main(String[] args) {
		int[] studentA = {80,95};
		int[] studentB = {85,94};
		MidTerm mid = new MidTerm();
		
		int sum1 = mid.score(studentA);
		int sum2 = mid.score(studentB);
		
		if(sum1<sum2) {
			System.out.println("studentB가 크다");
		}//if 종료
		else if(sum1 > sum2) {
			System.out.println("studentA가 크다");
		}//else if 종료
		else{
			System.out.println("동점입니다.");
		}//else 종료
		
		
	}//main 종료

}
