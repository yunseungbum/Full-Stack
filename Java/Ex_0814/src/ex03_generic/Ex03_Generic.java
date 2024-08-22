/*//	멀티타입 파라미터
 //	    제네릭은 반드시 하나만 사용해야하는 법은 없다. 
//		만일 타입 지정이 여러개 필요한 경우 2개,3개 얼마든지 만들 수 있다.
 * 
 */
package ex03_generic;
import java.util.ArrayList;
import java.util.List;

class Pear{};
class Peach{};

class FruitBox2<T, U> {
    List<T> peares = new ArrayList<>();
    List<U> peaches = new ArrayList<>();

    public void add(T pear, U peach) {
    	peares.add(pear);
    	peaches.add(peach);
    }
}

public class Ex03_Generic {
	public static void main(String[] args) {
		FruitBox2<Pear,Peach> box = new FruitBox2<>();
		box.add(new Pear(), new Peach());
		box.add(new Pear(), new Peach());
		
		
		
		
		
		
	}


	
}
