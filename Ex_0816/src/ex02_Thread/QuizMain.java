package ex02_Thread;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();//스레드 구동
		qt.startGame();//문제풀이 함수
	}

}
