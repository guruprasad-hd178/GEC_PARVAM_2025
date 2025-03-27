package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava4 {
	public static int eligible (int marks) {
		if (marks > 60)
			return marks;
		else
			return 0;
	}
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(45,56,67,78);
//		List<Integer> new_list = list.stream().map( (m) -> eligible(m) ).collect(Collectors.toList());
//		System.out.println(new_list);
//	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45,56,67,78);
		List<Boolean> new_list = list.stream().map( (m) -> m > 60 ).collect(Collectors.toList());
		System.out.println(new_list);
	}
}
