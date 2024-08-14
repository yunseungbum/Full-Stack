package Ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ex02_bingo {
	public static void main(String[] args) {
		//HastSet과 ArrayList를 이용하여  5*5 랜덤 빙고판 만들기
		//collections.shuffle(list객체만 가능)
		//1 ~ 50 난수 중 25개를 넣기
		
		
		HashSet<Integer> set = new HashSet<>();
		int [][] board = new int [5][5];
		
		for(int i = 0 ; set.size() < 25; i++) {
			set.add(new Random().nextInt(50)+1);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0 ; j <board[i].length; j++) {
				board[i][j]= iter.next();
				System.out.printf("%02d ",board[i][j]);
			}
			
			System.out.println();
		}
		

		
		
		
		
	}

}
