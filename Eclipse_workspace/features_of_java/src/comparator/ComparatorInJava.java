package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	int roll_no;
	String name;
	
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
}

public class ComparatorInJava 
{
	public static void main(String[] args) 
	{
		Student std1 = new Student(1, "A");
		Student std2 = new Student(21, "B");
		Student std3 = new Student(12, "C");

		List<Student> student = new ArrayList<Student>();
		student.add(std1);
		student.add(std2);
		student.add(std3);
		
		System.out.println(student);
//		Comparator<Student> comp = new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.roll_no - o2.roll_no;
//			}
//		};
		Collections.sort(student, (s1, s2) ->  s1.roll_no - s2.roll_no );
		System.out.println(student);
	}
}
