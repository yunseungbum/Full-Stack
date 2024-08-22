package Ex02_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Kim", 1111);
		map.put("Lee", 2222);
		map.put("Park", 3333);
		
		//id: aaaa
		//pw: 1111
		//아이디가 존재하지 않습니다.
		
		//id:Lee
		//pw:3333
		//비밀번호 불일치
		
		//id:Park
		//pw:3333
		//로그인 성공!
		
		
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String id = sc.next();
			System.out.print("pw : ");
			int pw = sc.nextInt();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			else {
				if(map.get(id)!= pw)
			{
				System.out.println(" 비밀번호 불일치 ");
			}
			else
			{
				System.out.println("로그인 성공!");
			}
			}
			
		
		
		
		
		
	}

}
