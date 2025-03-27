package com.map;

import java.util.TreeMap;

public class TreeMapInJava {
	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>((a,b)->b-a);
		treemap.put(3, "three");
		treemap.put(1, "one");
		treemap.put(2, "two");
		System.out.println(treemap);
	}
}
