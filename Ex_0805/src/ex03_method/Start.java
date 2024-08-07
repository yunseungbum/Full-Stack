/*Start클래스를 생성하여 1 ~ 50사이의 난수를 발생시킨다.
메인클래스를 만들고 사용자가 키보드를 통해 정수를 입력받는다.
Start클래스에서 사용자가 입력한 숫자를 판단하여 
발생한 난수보다 크다면 DOWN!! 작다면 UP!!을 출력.
사용자가 입력한 숫자와 발생한 난수가 같을경우에 프로그램을 종료시키며
몇회만에 정답을 맞췄는지 판단해보자.
단, 정답을 맞춘 경우 프로그램의 종료는 Start클래스가 아닌 
메인클래스에서 이루어 지도록 한다.

 * 
 */

package ex03_method;

import java.util.Random;

public class Start {
	Random rnd = new Random();
	
	int rnum = rnd.nextInt(50)+1;
	int count = 1;
	String check(int number) {
		if(number == rnum) {
			return "정답!";
			
		}//if 종료
		else if(number > rnum){
			return "Down!";
			
			
		}//else if끝
		else {
			return "Up!";
		}//else 끝
	}//check 끝

}
