package ex02_Enum;

public class Ex02_Transportation {
	public static void main(String[] args) {
		Transportaion[] trans = Transportaion.values();
		
		for(Transportaion tran : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n",tran.name(),tran.totalFare(100));
		}
	}
}