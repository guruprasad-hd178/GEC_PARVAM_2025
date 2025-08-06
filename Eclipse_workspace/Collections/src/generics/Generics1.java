package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	public static void main(String[] args) {
		List marks = new ArrayList();
		marks.add(120);
		marks.add(140);
		System.out.println(marks);
		
		int marks1 = (int) marks.get(0);
		int marks2 = (int) marks.get(1);

		List<String> names = new ArrayList<String>();
		names.add("guru");
		names.add("prasad");
		System.out.println(names);
		
		String name1 = names.get(0);
	}
}
