package Ex02_Project;

public class MethodTest {
	 public void maxFinder(int[] arr) {
		 int max = arr[0];
			for(int x : arr) {
				if(x > max) max = x;
			}
			
			System.out.println("최대값 : " + max);
		 }


		
		
	}

