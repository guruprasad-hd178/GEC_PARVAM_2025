package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
	public static void main(String[] args) {
		Student std1 = new Student("gp", 12, 21);
		Student std2 = new Student("pg", 31, 32);
		Student std3 = new Student("hg", 13, 22);
		Student std4 = new Student("gh", 14, 23);
		
		List <Student> students = new ArrayList<Student>();
		
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		
		students.add(new Student("hh", 15, 21));
		
		System.out.println(students);
//		students.remove(0);
//		System.out.println(students);
		
		Collections.sort(students, (s1,s2) -> s2.getRoll_num()-s1.getRoll_num()  );
		System.out.println("After");
		System.out.println(students);

		Collections.sort(students, (s1,s2) -> s1.getAge()-s2.getAge()  );
		System.out.println("After");
		System.out.println(students);
		

	}
}
