package com.Collection.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>() ;
		list.add(10);
		list.add(20);
		list.add(5);
		System.out.println("Before : " +list);
		
		/*
		 * collections 
		 * it is a utility classes that provides methods to work with collection
		 */
		
//		sort
		Collections.sort(list);
		System.out.println("After : " +list);

//		reverse
		Collections.reverse(list);
		System.out.println("Reverse : " +list);

//		max
		int max = Collections.max(list);
		System.out.println("Max : " +max);
		
//		min
		int min = Collections.min(list);
		System.out.println("Min : " +min);


	}
}
