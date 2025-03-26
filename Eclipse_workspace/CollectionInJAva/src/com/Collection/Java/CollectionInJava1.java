package com.Collection.Java;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * collection --> root interface in collection framework
		 * Collections --> it will provide some of the utility methods to work wth collection
		 * 
		 * Collection
		 * ===========
		 * when you represent a group of individual object as a single entity then we should go for collection
		 * root interface in collection framework
		 * this will provide some of of built in methods to work with any collection class
		 * 
		 */
		
		@SuppressWarnings("rawtypes")
		Collection collection = new ArrayList();
		collection.add(10);
		collection.add("Name");
//		collection.clear();
		System.out.println(collection);
	}
}
