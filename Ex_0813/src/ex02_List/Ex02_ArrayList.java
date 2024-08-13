package ex02_List;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		//ArrayList 데이터 치환
		//List에 저장된 데이터를 변경 할 수 있다.
		//변경을 원하는 index위치와 치환할 값 또는 객체를 지정하면
		//해당 위치의 값이 변경된다.
		//리스트 선언
		List<String> list = new ArrayList<>();
		
		//데이터삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		System.out.println("리스트 내용1 : " + list);

		// 데이터 변환
		list.set(0,"사과");
		list.set(1,"수박");

		System.out.println("리스트 내용2 : " + list);
	}

}
