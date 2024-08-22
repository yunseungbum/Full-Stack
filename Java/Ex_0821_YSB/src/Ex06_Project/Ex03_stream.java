package Ex06_Project;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_stream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1,5);
		LongStream longStream = LongStream.range(1, 5);
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
	}

}
