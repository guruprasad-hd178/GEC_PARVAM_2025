package customObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int roll_no;
	private int age;
	private String email;
	
	public Student(String name, int roll_no, int age, String email) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", age=" + age + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}
}

public class Custom {
	public static void main(String[] args) {
		Student std1 = new Student("guru1", 123,1 ,"1gmail");
		Student std2 = new Student("guru2", 3,2 ,"2gmail");
		Student std3 = new Student("guru3", 1,21 ,"3gmail");
		Student std4 = new Student("guru4", 13,121 ,"4gmail");
		Student std5 = new Student("guru5", 13,212 ,"5gmail");
		
		System.out.println(std1);
		System.out.println("------------------------------------");

		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		System.out.println(students);

		Comparator<Student> rs = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getRoll_no() - o2.getRoll_no();
				
			}
		};
		
		System.out.println("------------------------------------");
		Collections.sort(students, rs);
		System.out.println(students);
	
		System.out.println("------------------------------------");
		Collections.sort(students, (s1,s2) -> s1.getAge() - s2.getAge());
		System.out.println(students);
		
		System.out.println("------------------------------------");
		Collections.sort(students);
		System.out.println(students);
	}
}


