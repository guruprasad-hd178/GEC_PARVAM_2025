package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * Generics
		 * =========
		 * to provied the type safety and to avoid the type casting in collection
		 * then we should go for generic
		 * 
		 */
		char [] arr = {'a','b','c'};
		char firstEle = arr[0];
		System.out.println(firstEle);
	
//		without generics
		@SuppressWarnings("rawtypes")
		List arr1 = new ArrayList();
		arr1.add(12);
		arr1.add(10.9);
		arr1.add("Hello");
		int value = (int)arr1.get(0);
		System.out.println(value);
		System.out.println(arr1);

		
//		generics
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(109);
		int a = list.get(1);
		System.out.println(a);
		System.out.println(list);
	}
}
