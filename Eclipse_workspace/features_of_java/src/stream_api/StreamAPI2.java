package stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamAPI2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("bdc","abc","abd");
		names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
