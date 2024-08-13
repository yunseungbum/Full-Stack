package ex03_list;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<>();
		
		while(true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.println("항목선택 : ");
			
			Scanner sc = new Scanner(System.in);
			select =sc.nextInt();
			
			switch(select){
			case 1://정보추가
				p = new Person();//정보를 추가할때마다 Person객체를 새로 생성한다.
				
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(sc.next());
				
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				
				System.out.print("전화 : ");
				p.setTel(sc.next());
				
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				
				System.out.println("----------------------");
				break;
				
			case 2://정보삭제
				System.out.println("-----정보삭제-----");
				System.out.print("이름할 이름 : ");
				String name = sc.next();
				
				for(int i =0;i <personArr.size(); i++) {
					if((personArr.get(i).getName()).equals(name)) {
						personArr.remove(i);
						System.out.println(name + "의 정보를 삭제했습니다.");
						break;
					}
					else {
						if(i + 1 == personArr.size()) {
							System.out.println(name + "이 존재하지 않습니다.");
						}
					}
					
				}
				break;
				
			case 3://전체정보
				System.out.println("----전체정보----");
				System.out.println("등록인원 "+personArr.size() + "명");
				for(Person pe : personArr) {
					System.out.println("이름 : " + pe.getName());
					System.out.println("나이 : " + pe.getAge());
					System.out.println("번호 : " + pe.getTel());
					System.out.println("-----------------");
				}
				break;
				
			case 4://종료
					System.out.println("프로그램 종료");
					return;
			}
			
		}
	}

}
