package com.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {
	public static void main(String[] args) {
		/*
		 * linked list
		 * ============
		 * linked list underline data structure is doubly linked list
		 * linked list allows duplicate
		 * linked list allow random access
		 * linked list will never allow null value
		 * linked list will preserve the order of insertion
		 * 
		 */
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(45);
		list.add(null);
		list.add(25);
		list.add(40);
		System.out.println(list);
		System.out.println(list.get(2));
		
		/*
		 * linked list underline data structure is doubly linked list
		 * arrayList dynamic array
		 * 
		 * linked list will occupy more memory (3 nodes)
		 * arraylist will occupy less memory
		 * 
		 * when ever there is a continuos operations on deletion we should go for linked list
		 * when ever there is a continuos operation on deletion then we should not go for array list
		 */
	}
}
