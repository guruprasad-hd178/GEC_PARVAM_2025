package com.Collection.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(5);
	
//		1 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		System.out.println();
		
//		2 for each enhanced
		for (int i : list) {
			System.out.println(i+ " ");
		}
		System.out.println();

		
//		3 forEach
		list.forEach(i -> System.out.println(i+ " "));
		System.out.println();

		
//		4 iterator
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
	}
}
