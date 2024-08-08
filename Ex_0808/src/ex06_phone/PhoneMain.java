package ex06_phone;

public class PhoneMain {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone();
		pp.powerOn();
		pp.powerOff();
		
		System.out.println();
		
		ThreeStarPhone tp = new ThreeStarPhone();
		
		tp.powerOn();
		tp.powerOff();
	}

}
