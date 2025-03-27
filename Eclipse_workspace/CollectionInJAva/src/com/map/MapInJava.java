package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
	public static void main(String[] args) {
		/*
		 * Map
		 * ========
		 * when you represent a group of individual object as a single entity
		 * in the form of key value pair then we should go for map interface
		 * 
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("two"));

	}
}
