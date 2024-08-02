//for문의 중첩(다중 for문)
//-for문 안에 다른 for문을 사용하는 경우
//-for문을 중첩하여 사용하기 대문에 코드가 어려워 보일 수는 있으나,
//-반복문의 원리와 같다.
//
//
//for(초기식;조건식;증감식){
//	for(초기식;조건식;증감식){
//		반복할 명령
//		}
//	}




package ex02_for;

public class Ex02_for {
	public static void main(String[] args) {//main 시작
		for(int i =1; i < 3; i++) {//for(i)시작
			
			for(int j = 1; j<4; j++){//for(j)시작
				
				System.out.println(i+ " "+j);
				
			}//for(j)끝
				
				
		}//for(i)끝
		
		System.out.println();
		for(int i =1; i<5; i++) {//for(i) 시작, 행
			
			for(int j =1; j<4;j++) {//for(j) 시작, 열
				System.out.print(1+" ");
			}//for(j) 끝
			
			System.out.println();
			
		}//for(i) 끝
		
		
		
		System.out.println("------------------");
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		
		for(int i=1;i<4;i++) {//for(i)시작
			
			for(int j = 1; j<5;j++) {//for(j)시작
				System.out.print(j+ " ");
				
			}//for(j)끝
			
			System.out.println();
				
			
		}//for(i)끝
		
		System.out.println();
		
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		
		int count = 0;
		for(int i=1;i<4;i++) {//for(i)시작
			
			for(int j=1;j<5;j++) {//for(j)시작
				System.out.printf("%02d ", ++count);
			}//for(j)끝
			System.out.println();
		
			
	}//for(i)끝
		
		System.out.println();
		
		//A B C D
		//E F G H
		//I J K L
		char co = 'A';
		for(int i=1;i<4;i++) {//for(i)시작
			
			for(int j=1;j<5;j++) {//for(j)시작
				System.out.printf("%s ",co++);
			}//for(j)끝
			System.out.println();
		}//for(i)끝
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		for(int i=1;i<6;i++) {//for(i)시작
			
			
			for(int j=0;j<i;j++) {//for(j)시작
				System.out.print("* ");
			}//for(j)종료
			
			
			System.out.println();
			
		}//for(i)끝
		
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//4 5 6 7 8 9 10 1 2 3
		//5 6 7 8 9 10 1 2 3 4
		//6 7 8 9 10 1 2 3 4 5
		//7 8 9 10 1 2 3 4 5 6
		//8 9 10 1 2 3 4 5 6 7
		//9 10 1 2 3 4 5 6 7 8
		//10 1 2 3 4 5 6 7 8 9
		
		
		

	

		for(int i =1; i<=10;i++) {//for(i)시작
			for(int j = 0; j < 10; j++) {//for(j)시작
				int num = i+j;
				if(num > 10) {
					num -=10;
				}
				System.out.printf(num + " ");
			}//for(j)종료
			System.out.println();
			
		}//for(i)종료
		
		
	}//main 끝

}
