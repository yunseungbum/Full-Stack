package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {
	
	public static void main(String[] args) {
		
		//10개의 정수를 담을 수 있는 배열 생성
		//배열의 이름은 numbers
		
		//배열에 Random클래스를 이용하여 1 - 30 사이의 난수 넣기
		//nextInt(30)+1;
		
		//배열의 모든 요소 출력하기(가로)
		//배열 안에서 짝수의 합 구하기
		
		Random rnd = new Random();
		
		
		int total = 0;
		
		int[] numbers = new int[10];
	 
		for(int i = 0; i < numbers.length ; i++) {
			int r = rnd.nextInt(30)+1;
			numbers[i] = r;
			if(r%2==0) {
				total +=r;
				
				
				
			}//if(rnd) 종료
			
			System.out.print(numbers[i]+ " ");
			
		}//for(i) 종료
		System.out.println("");
		System.out.println("짝수의 합: " + total );
		
		
		
		//배열에서 영문자만 추출하여 이어붙혀 출력하기
		
		char[] cards = {'1','L','2','O','2','V','E','3'};
		String myWord = "";
		
		for(int i = 0; i < cards.length; i++) {
			
			if(cards[i] >= 65) {
				
				myWord += cards[i];
				
			}//if 종료
			
		
		}//for문 종료
		System.out.println(myWord);
		//출력결과
		//LOVE

		
		
		//배열 arr에 담겨있는 모든 값의 합을 구하세요
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
			
			
		}//for 종료
		
		System.out.println(sum);
		
		//배열명.length : 배열에 들어있는 요소의 개수
		//index: 요소에게 번호표를 나눠준다(0부터시작)
		//배열에 있는 요소 꺼내는법
		//배열명[인덱스번호] - > 변수처럼 사용한다.
		//ex) arr[0] -> 10
		
		System.out.println("---------------------------");
		
		//다음조건에 맞는 문제를 푸세요
		//키보드에서 배열의 길이를 입력 받는다.
		//입력받은 길이만큼 알파벳을 넣고 출력한다.
		//ex) 배열의 길이를 입력하세요: 5
		//ABCDE
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요");
//		int n = scan.nextInt();
//		int[] number = new int[n];
//		char ch = 'A';
//		
//		for(int i=0;i<number.length;i++) {
//			
//			
//			if(number[i]>= 0) {
//				ch++;
//				
//				
//			}//if 종료
//			
//			System.out.print(ch);
//		}//for 종료
		
		//동전의 개수 구하기
		//10 ~ 5000사이의 난수를 변수에 담는다.
		//1의 자리는 반드시 0이 되어야 합니다.
		//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드
		//가능한 적은 수의 동전을 사용하도록 한다.
		//4170
		//500원 : 8
		//100원 : 1
		//50원 : 1
		//10원 : 2
		
		int [] coin = {500,100,50,10};
		int r = (rnd.nextInt(500)+1)*10;
		int money =(rnd.nextInt(500)+1)*10;
		System.out.println("돈 : " + money);
		
		
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];//동전의 개수
			money %= coin[i];//잔돈
			System.out.printf("%d원 : %d개\n",coin[i],res);
		}
		
	
			
	
		//로또번호 생성하기
		//1 ~ 45사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기
		 
		int [] lotto = new int [6];
		
		for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45)+1;
			for(int j =0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue ;
					
				}//if(lotto[i] == lotoo[j]) 종료
				
				
			}//for(j)종료
			System.out.print(lotto[i] + " ");
			i++;
		}//for(i)종료
		
		
	}//main 종료
	
}
