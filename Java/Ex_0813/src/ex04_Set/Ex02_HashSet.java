package ex04_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex02_HashSet {
	public static void main(String[] args) {
		//1.순서가 없다.
		//2.중복되는 값이 안들어간다.
		
		
		//HashSet을 선언한 후
		//1 ~ 45 사이의 난수를 생성하여 로또번호로 뽑기
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			int r = new Random().nextInt(45)+1;
			hs.add(r);
			
			if(hs.size()==6) {
				break;
			}
			}
		System.out.println(hs);
		
		//Set -> 배열로 바꾸기
		Integer[] arr = hs.toArray( new Integer[0]);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
		
	}

}
