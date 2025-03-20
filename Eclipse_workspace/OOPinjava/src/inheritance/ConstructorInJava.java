package inheritance;

class Student1{
	//states
	public int age ;
	public String name ;
	public double marks ;
	
	//full args constructor
	public Student1(int age, String name, double marks) {
		System.out.println("Full args constructor");
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	
	//no args constructor
	public Student1() {
		System.out.println("No args container");
	}
	
	//actions
	public void isPlaying() {
		System.out.println(this.name+ " Student is playing");
	}
	public void isSleeping() {
		System.out.println(this.name+ " Student is playing");
	}
	public void display() {
		System.out.println("Name : " +this.name);
		System.out.println("Age : " +this.age);
		System.out.println("Marks : " +this.marks);
	}
	
}

public class ConstructorInJava {
	public static void main(String[] args) {
		Student1 std1 = new Student1(21, "guru", 400.0);
		std1.display();
		Student1 std2 = new Student1();
		std2.display();
	}

	public ConstructorInJava() {
		super();
	}
}
