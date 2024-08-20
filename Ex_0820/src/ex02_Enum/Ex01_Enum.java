/*
 *  name() : 열거형 상수의 이름을 문자열로 반환
	ordinal() : 열거형 상수가 정의된 순서를 반환
	valueof("상수명") : String값을 enum에서 가져온다 값이 없으면 Exception을 살생시킨다.
	valueof(Item.class, "START); : 넘겨받은 class에서 String을 찾아, enum에서 가져온다.
	values() : 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
 */

package ex02_Enum;

import java.util.Arrays;

public class Ex01_Enum {
	public static void main(String[] args) {
		//values() -? 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		
		//name():열거 객체가 가지고 있는 문자열을 반환,
		//ordinal() : 열거 타입을 정의할 때 주어진 순번을 반환
		for(Item item:items) {
			System.out.println("name="+item.name()+",ordinal = "+item.ordinal());
		}
		
		//valueOf():매개변수로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 반환
		Item i1 = Item.valueOf("START");
		System.out.println(i1);
		Item i2 = Item.START;
		System.out.println(i2);
		Item i3 = Item.STOP;
		System.out.println(i1 == i2);
		
		//초과,미만,이상,이하와 같은 비교연산자는 사용할 수 없다.
		//기준객체,compareTo(비교객체);
		//매개값을 주어진 객체를 비교해서 순번 차이를 반환
		//기준객체가 비교객체보다 순번이 빠르면 -> 음수 반환
		//기준객체가 비교객체보다 순번이 늦다 -> 양수 변환
		System.out.println(i1.compareTo(i3)); 
		
		switch(i1) {
		case START://Item.START라고 쓸 수 없다.
			System.out.println("게임시작!");
		break;
		case STOP:
			System.out.println("게임멈춤!");
		break;
		case EXIT:
			System.out.println("게임종료!");
		break;
		}
		
		//생성자가 private이기 때문에 열거형 객체를 직접 만드는 것은 불가능하다.
		Season s = Season.SUMMER;
		System.out.println(s);
		
		
	}

}
