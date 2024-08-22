package Ex01_Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class ex01_TreeSet {
	public static void main(String[] args) {
		
		//TreeSet객체 생성
		TreeSet<Integer> set1 = new TreeSet<>();
		
		
		//set1의 모든 값을 가진 TreeSet 객체 생성
		TreeSet<Integer> set2 = new TreeSet<>(set1);
		
		//초기값을 가지고 만들어지는 TreeSet객체
		TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1,2,3));
		
		TreeSet<Integer> set = new TreeSet<>();//TreeSet생성
		
		//TreeSet에 값 추가하기
		set.add(7);
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		
		//TreeSet값 삭제
		set.remove(1);//값 1 제거
		System.out.println(set);
		set.clear();//모든 값 제거
		System.out.println(set);
		
		//TreeSet크기 구하기
		TreeSet<Integer> set4 = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7));//초기값 지정
		System.out.println(set4.size());
		
		//TreeSet값 출력하기
		System.out.println(set4);
		
		//최소값을 찾아서 반환
		System.out.println(set4.first());
		
		//최대값을 찾아서 반환
		System.out.println(set4.last());
		
		//인자로 전달된 값보다 큰 데이터 중 최소값 출력 없으면 null
		System.out.println(set4.higher(3));

		//입력값보다 작은 데이터중 최대값 출력 없으면 null
		System.out.println(set.lower(3));
		
		//index가 없기 때문에 요소를 하나씩 꺼낼수가 없다.
		//단 Iterator을 사용하면 하나씩 꺼낼수 있다.
		Iterator<Integer> iter = set.iterator();
		
		//hasnext() -> 다음에 순회할 요소가 있으면 true,아니면 false
		while(iter.hasNext()) {
			//다음 요소를 반환한다.
			int val = iter.next();
			System.out.println(val+ " ");
			
		}
		
		
	}

}
