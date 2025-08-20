package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(18);
		list.add(97);
		list.add(35);
		list.add(91);
		list.add(24);
		
//		Stream<Integer> stream = list.stream();
//		Stream<Integer> filter = stream.filter(n -> n%2 == 0);
//		long count = filter.count();
		
		long count = list.stream().filter(n -> n%2 == 0).count();
		
		System.out.println("Result : "+count);
		
		long sum = list.stream().count();
		
	}
}
