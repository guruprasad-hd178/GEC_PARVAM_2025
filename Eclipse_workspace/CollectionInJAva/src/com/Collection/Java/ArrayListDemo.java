package com.Collection.Java;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String []args) {
		/*
		 * arraylist
		 * ==========
		 * array list is a improved version of array (Dynamic Array)
		 * array list underline data structure is dynamic array
		 * array list will allow duplicate
		 * array list will allow random access
		 * array list will allow null value
		 * array list will preserve the order of insertion
		 * array list will preserve the order of insertion
		 * 
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);
		list.add(null);
		list.add(1);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(5);
		list.remove(null);
		Integer i = 3;
		list.remove(i);
		System.out.println(list);
		System.out.println(list.size());

	}
}
