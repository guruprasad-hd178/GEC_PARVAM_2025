package reference;

import java.util.function.Function;
import java.util.function.Supplier;

class Student {
	
	private String s;

	public Student() {
		System.out.println("This is student constructor");
	}
	
	public Student(String s) {
		this.s = s;
		System.out.println("This is student 2 constructor");
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Supplier<Student> sup1 = () -> new Student();
		sup1.get();
		
		Supplier<Student> sup2 = Student::new;
		sup2.get();
		
		Function<String, Student> fun1 = Student::new;
		fun1.apply("Hello");
	}
}
