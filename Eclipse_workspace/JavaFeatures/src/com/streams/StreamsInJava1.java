package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsInJava1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,45,56,67,78);
		Stream<Integer> stream = list.stream().filter(x -> x > 10);
//		Long res = stream.count();
//		System.out.println(res);
		
//		List<Integer> result = stream.collect(Collectors.toList());
//		System.out.println(result);
		
		Long res1 = stream.count();
		System.out.println(res1);
	}
}
