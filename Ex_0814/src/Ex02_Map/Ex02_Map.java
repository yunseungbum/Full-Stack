package Ex02_Map;

import java.util.HashMap;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("K1", 100.0f);
		map.put("K2", 3.14f);
		map.put("K3", 4.15f);
		
		//map에 특정 key 값이 포함되어 있는지 확인하는 메서드
		//containsKey()
		if(map.containsKey("k3")) {
			    System.out.println("k3라는 key가 존재합니다.");
			}
		
		
		//map에 특정 value값이 포함되어 있는지 확인하는 메서드
		//containsValue()
		if(map.containsValue(3.14f)) { 
			    System.out.println("map은 3.14값을 가지고 있습니다.");
			}
		
		
		
		
		
		
	}

}
