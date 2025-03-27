package com.Collection.Java;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * List
		 * ========
		 * it is a child interface of collection
		 * it will contain some of the built in methods that used inside a list implemented classes only
		 * when you represent a group of individual object as a single entity where order is preserved and index based access and duplicate is allowed 
		 * 
		 */
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add(2);
		list.add("gp");
		list.add(9.8);
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double d = (double) list.get(2);
		System.out.println(d);
	}
}
