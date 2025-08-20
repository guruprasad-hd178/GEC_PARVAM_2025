package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 7, 11, 16);
		
		Stream<Integer> squares = numbers.stream().filter(n -> n > 10);
		
		System.out.println(squares.toString());
	}
}
