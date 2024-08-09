package ex01_interface;

public class MicMain {
	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.music();
		tj.sing();
	
	System.out.println("--Tjmic 객체를 BluetoothMic로 타입 변환--");
	BluetoothMic bm = tj;
	bm.connect();
	bm.music();
	bm.sing();
	
	System.out.println("--- Tjmic객체를 MicroPhone타입으로 변환 ---");
	MicroPhone m = tj;
	m.sing();
	//m.connect(); 호출불가능
	//m.music(); 호출불가능
	
	System.out.println("---Tjmic 객체를 Speaker타입으로 변환 ---");
	Speaker s = tj;
	
	s.music();
	//s.connect(); 호출불가능
	//s.sing(); 호출불가능
		
	}

}
