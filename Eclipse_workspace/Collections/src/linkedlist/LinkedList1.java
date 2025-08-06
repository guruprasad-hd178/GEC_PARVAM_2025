package linkedlist;

import java.util.LinkedList;
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

public class LinkedList1 {
	public static void main(String[] args) {
		
		List<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		
		Student std1 = new Student("guru1", 123,1 ,"1gmail");
		Student std2 = new Student("guru2", 3,2 ,"2gmail");
		Student std3 = new Student("guru3", 1,21 ,"3gmail");
		Student std4 = new Student("guru4", 13,121 ,"4gmail");
		Student std5 = new Student("guru5", 13,212 ,"5gmail");
		
		List<Student> students = new LinkedList<Student>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		System.out.println(students);
		
		students.addLast(std1);
		students.removeFirst();
		System.out.println(students);
		
	}

}
