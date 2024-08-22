package ex03_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_work {
	//아이디 생성 : abc
	//abc
	//아이디 생성 : abc2
	//abc abc2
	//아이디 생성 : abc2
	//중복된 아이디
	//아이디 생성 : abc3
	//abc abc2 abc3
	
	//리스트의 요소의 개수가 4개이면 프로그램 종료
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
	outer : while(true){	
		System.out.print("아이디 생성 : ");		
		String id = sc.next();

	//id중복체크	
		for(int i = 0; i < list.size(); i++){	           
			if(id.equals( list.get(i) )){	                
				System.out.println("중복된 아이디");
			        continue outer;	
	   		  }
		}
		list.add(id);

		System.out.println(list);
		System.out.println("-----------------------");
	}
	}
}

