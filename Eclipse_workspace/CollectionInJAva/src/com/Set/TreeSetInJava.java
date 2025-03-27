package com.Set;

import java.util.TreeSet;

public class TreeSetInJava {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>((a,b)->b-a);
		treeset.add(2);
		treeset.add(100);
		treeset.add(10);
		treeset.add(50);
		System.out.println(treeset);
	}
}
