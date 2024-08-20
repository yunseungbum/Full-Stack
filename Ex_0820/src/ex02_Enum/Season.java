package ex02_Enum;

public enum Season {
	//상수 하나하나를 객체라고 보면된다.
	//1.생성자에 값을 전달하는 것과 같은 원리이다.
	
	SPRING("봄"),
	SUMMER("여름"),
	FALL("가을"),
	WINTER("겨울");
	
	//3.필드에 전달된다.
	private String season;
	
	//2.전달한 값을 생성자를 통해서 받고
	Season(String season){
		this.season = season;
	}

}
