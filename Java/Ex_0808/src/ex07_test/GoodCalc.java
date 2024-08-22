package ex07_test;

public class GoodCalc extends Calculator{
	//goodCalc클래스를 만들고 Calculator를 상속받아
	@Override
	public int add(int a, int b) {
		
		return a + b;
	}//두 수를 더하여 반환하는 add()

	@Override
	public int substract(int x, int y) {
		
		return x - y;
	}//두 수를 빼서 반환하는 substract;

	@Override
	public double average(int[] a){
		int sum = 0;
		for(int i = 0 ; i < a.length;i++) {
			sum += a[i];
			
		}
		double avg = sum/(double)a.length;
		return avg;
	}//배열의 평균을 구하는 average();


}
