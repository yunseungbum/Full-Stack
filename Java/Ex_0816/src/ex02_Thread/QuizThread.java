/*	QuizThread클래스를 만들어 스레드를 상속 받는다.
	startGame()메서드를 만들고 그 안에서 1 ~ 100사이의 난수 두 개를 더하는 문제를 출제
	키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복한다.
	정답을 맞히고 난 후에 모든 문제를 맞히는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램 종료.
 * 
 */
package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	
	int num1,num2;
	int count = 0;
	int timer = 0;
	int end = 5;
	boolean isCheck = true;
	
	
	public void startGame() {
		
		while(isCheck) {
			
			try {
				num1= new Random().nextInt(100)+1;
				num2= new Random().nextInt(100)+1;
				System.out.print(num1 + "+"+ num2 + " = ");
				Scanner sc = new Scanner(System.in);
				int result = sc.nextInt();
				if(num1 + num2 == result) {
					System.out.println("정답!");
				}else {
					System.out.println("오답");
					continue;
				}
				count++;
			}
			catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
			}
			if(count == 5) {
				System.out.println("결과: " + timer+"초");
				isCheck = false;
			}
			
		}
				
			}
		@Override
		public void run(){
			while(isCheck) {
				try {
					Thread.sleep(1000);
					timer++;
					
				} catch (Exception e) {
					
				}
			}
		}
			
	

}
