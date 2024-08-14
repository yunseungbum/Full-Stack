package Ex02_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_Map {
		public static void main(String[] args) {
			Map<Integer, Character> map = new HashMap<Integer, Character>();
			
			//map에 데이터 추가하기
			map.put(13, 'A');
			map.put(12, 'B');
			map.put(53, 'C');
			map.put(46, 'D');
			System.out.println(map);
			
			//map에서 value는 중복이 될 수 있다.
			map.put(5, 'A');
			System.out.println(map);
			
			//map에서 key는 중복이 될 수 없다.
			map.put(13, 'C');
			System.out.println(map);
			
			//map에서 요소의 삭제는 key값을 통해서 한다.
			System.out.println("삭제한 값: " +map.remove(12));
			System.out.println(map);
			
			//map의 크기
			System.out.println("map의 크기 : " + map.size());
			
			//map의 특정 value 꺼내오기
			//value를 꺼내올때도 key를 사용한다.
			char res = map.get(53);
			System.out.println(res);
			
			
			
			
			
		}
}
