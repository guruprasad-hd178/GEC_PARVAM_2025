package inheritance;

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name + " is " + age + " years old");
	}
}

class Student extends Person {
	public String college;

	public Student(String name, int age, String college) {
		super(name, age);
		this.college = college;
	}

	public void display() {
		System.out.println(name + " is " + age + " years old and student of " + college);
	}

}

public class Inheritance2 {
	public static void main(String[] args) {
		Student s1 = new Student("Guru", 21, "GECH");
		s1.display();
	}
}
