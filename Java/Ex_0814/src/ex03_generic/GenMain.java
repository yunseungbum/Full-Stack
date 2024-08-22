

/*Gen클래스를 만들어 제네릭 타입T를 갖는 printArr메서드를 생성한다.
  printArr메서드 내부에서 배열을 순차적으로 보여줄수 있게 하는 코드를 작성.
  Main클래스를 만들어 Integer[], Double[], Character[]을 각각 만든 뒤
  Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하도록 해보자.
* 
* 결과 :
		1 2 3 4 5  //정수배열 출력
		1.1 2.2 3.3 4.4 5.5 //실수배열 출력
		A B C D E //문자배열 출력
* 
*/


package ex03_generic;


public class GenMain {
	public static void main(String[] args) {
		Gen gen = new Gen();
		
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
		
	}

}
