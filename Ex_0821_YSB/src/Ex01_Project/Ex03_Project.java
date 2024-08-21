package Ex01_Project;

import java.util.Random;

public class Ex03_Project {
	public static void main(String[] args) {
		int money = new Random().nextInt((500)+10)*10;
		
		int [] arr = {500,100,50,10};
		
		for(int i = 0; i < arr.length; i++) {
			int di = money/arr[i];
			System.out.println(arr[i]+"원 : "+di);
			money %= arr[i];
			
		}

}
}
