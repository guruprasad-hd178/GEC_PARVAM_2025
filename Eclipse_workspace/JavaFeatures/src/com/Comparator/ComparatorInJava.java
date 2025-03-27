package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funInterface implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2; //small - high
	}
	
}



public class ComparatorInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3);
		list.add(30);
		list.add(13);
		Collections.sort(list, new funInterface());
		System.out.println(list);
		Comparator<Integer> c = (a,b)->a-b;
//		Collections.sort(list,  (o1, o2) -> o2 - o1);
		Collections.sort(list, c);

		System.out.println(list);
	}
}
