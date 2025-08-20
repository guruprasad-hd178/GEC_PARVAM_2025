package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI5 {
	public static void main(String[] args) {
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
		System.out.println("Before : "+asList);
		
		List<Integer> flattenedList = asList.stream()
				.flatMap(c -> c.stream())
				.collect(Collectors.toList());
		System.out.println("After : "+flattenedList);
	}
}
