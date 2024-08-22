/* 	Math클래스
	수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스로 자바에서 수학 계산이 필요할 때 주로 사용한다
	객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가 제공하는 모든 메서드는 모두 정적 메서드로 이루어져 있다.
 * 
 * 	메서드							설명
 * 
int abs(int a)						절대값 계산
double abs(double a)				

double ceil(double a)				올림 계산

double floor(double a)				버림 계산

double round(double a)				반올림 계산

int max(int a, int b)				최대값 반환
double max(double a, double b)		

int min(int a, int b)				최소값 반환
double min(double a, double b)		

double random()	난수를 반환		

 */


package ex03_String;

public class Ex07_Math {
	public static void main(String[] args) {
				//올림
				System.out.println("3.51 올림 : " + Math.ceil(3.51));
				
				//내림
				System.out.println("13.61버림 : " + Math.floor(13.61));
				
				//반올림
				System.out.println("12.8 반올림 : " + Math.round(12.8));
				
				//절대값 구하기
				System.out.println("절대값 1 : " + Math.abs(-4.55));
				System.out.println("절대값 2 : " + Math.abs(-50));
				
				//최대값 구하기
				int maxValue = Math.max(30, 60);
				
				//최소값 구하기
				int minValue = Math.min(40, 70);
				
				System.out.println("30, 60 최대값 : " + maxValue);
				System.out.println("40, 70 최소값 : " + minValue);
	}

}
