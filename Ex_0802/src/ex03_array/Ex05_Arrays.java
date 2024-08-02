/* 배열의 정렬
 * 배열의 값이 순서 없이 저장되는 경우,
 * 배열의 값을 오름차순, 내림차순으로 정렬해야 할 때가 있다.
 * 정렬방법에는 다양한 알고리즘이 있다.
 * 
 * 
 */




package ex03_array;

public class Ex05_Arrays {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,6,3,2,10,7,9,5,4,8};
		
		int temp = 0;//잠깐 값을 담아놓을 변수
		for(int i = arr.length-1; i >0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j]> arr[j+1]) {
					temp =arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					
				}//if(arr[j]> arr[j+1]) 종료
			}//for(j)종료
		}//for(i) 종료
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}//for(arr)종료
		
		
	}//main 종료
	
	

}
