package com.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		/*
		 * set
		 * ========
		 * when you represent a group of individualmobject as a single entity
		 * where the insertion order is not preserved , duplicate will not allow
		 * then we should go for set interface
		 */
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(12);
		set.add(30);
		set.add(1);
		set.add(100);
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(32);
		list.add(42);
		list.add(22);
		list.add(52);
		
		System.out.println(list);
		
		Collections.reverseOrder();
}
}
