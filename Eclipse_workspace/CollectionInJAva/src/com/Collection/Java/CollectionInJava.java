package com.Collection.Java;

public class CollectionInJava {
	public static void main(String[] args) {
		/*
		 * why we need collection
		 * =======================
		 * to over come the drawback of array 
		 * 
		 * drawback of array
		 * ==================
		 * 1 fixed size
		 * 2 same data type elements
		 * 3 we cannot reduce the size of an array
		 * 
		 * advantages
		 * ===========
		 * 1 random access
		 * 2 type safety -  the elements inside the array is based on the data type
		 * 3 type casting - to print elements in array  
		 */
		
		int arr[] = new int [2];
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println((int)arr[0]);			//no need of type casting
		System.out.println(arr[0]);
	}
}
