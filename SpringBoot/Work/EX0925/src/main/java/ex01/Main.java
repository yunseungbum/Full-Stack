package ex01;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};
class Engine{};

class AppContext{
	Map map;
	
	public AppContext() {
		try {
			Properties p = new Properties();
			p.load(new FileReader("config.txt"));
			
			map = new HashMap(p);
			
			for(Object key : map.keySet()) {
				Class clazz = Class.forName((String)map.get(key));
				map.put(key, clazz.newInstance());
			}
			
			//반복문을 통해서 클래스 일므을 얻고 객체를 생성해서 다시 map 저장
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	Object getBean(String key) {
		return map.get(key); 
	}
}
public class Main {
	public static void main(String[] args)throws Exception {
		AppContext ac = new AppContext();
		
		
		Car car = (Car)ac.getBean("car");
		System.out.println("car= " + car);
		
		Engine engine = (Engine)ac.getBean("engine");
		System.out.println("engine= " + engine);

}
}
