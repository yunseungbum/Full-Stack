package ex03_anonymous_class;

interface buttonClickListener{
	//기능은 메서드에다 만듦
	public void click();
}

public class AnonymousExample {
	public class Button{
		
		private buttonClickListener listener;//필드
		
		public void setButtonListener(buttonClickListener listener){
			this.listener = listener;
			
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
				
			}//if 끝
		}//chick 끝
	}//button 끝
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();//버튼
		
		//인터페이스의 객체는 직접 만들 수 없다.
		//인터페이스를 구현한 클래스를 통해 객체를 만들 수 있다.
		button.setButtonListener(new buttonClickListener() {
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
				
			}
		}); 
		button.click();
	}
	

}

