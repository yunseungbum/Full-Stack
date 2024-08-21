package Ex06_Project;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_stream {
	public static void main(String[] args) {
		Integer[] nums = {1,44,33,21,36,68,77,4,5,6,1,1,1,2,2,2};
		
		
		//1.스트림 객체 만들기
		
		Stream<Integer>  stream = Arrays.stream(nums);
		
		//2.중간연산
		stream.distinct().sorted().limit(5).forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(x -> System.out.print(x+" "));
		//skip(n): 맨 처음 n개를 버리고 시작
		//limit(n): n개의 개수를 갖는 스트림을 반환
		System.out.println();
		IntStream intStream2 =  IntStream.of(1,2,2,3,3,4,5,6,6,7,7,7,8,9,10);
		
		intStream2.distinct().filter(x -> x%2 ==0).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		//문자열의 길이가 3이상인것만 출력하기
		Stream.of("ab","a","abc","abcd","abcdef","abcdefg").filter(x -> x.length()>2).forEach(x -> System.out.println(x + " "));
		
		
		
		
	}

}
