package test1;

public class PersonMain {
	
		public static void main(String[] args) {
			Person hong = new Person();
//			hong.introduce("홍길동", 20);
//			hong.hello();
			hong.age = 30;
			
			System.out.println("hong의 나이는 " + hong.age+"세입니다.");
		}
	} 

