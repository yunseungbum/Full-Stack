package ex05_final;

public class BookMain {
 public static void main(String[] args) {
	Comic comic = new Comic("포켓몬","미상",true);
	
	comic.info_title();//final로 선언된 메서드는 오버라이드가 안되지만 사용하는 건 가능
	comic.info_author();
	comic.info_color();
}
}
