package encapsulation;


class Student{
	private String name;
	private int age;
	private double marks;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public double getMarks() {
//		return marks;
//	}
//	public void setMarks(double marks) {
//		this.marks = marks;
//	}
	
	//full args constructor
		public Student(int age, String name, double marks) {
			System.out.println("Full args constructor");
			this.age = age;
			this.name = name;
			this.marks = marks;
		}
		
		//no args constructor
		public Student() {
			System.out.println("No args container");
		}
	
		public void display() {
			System.out.println("Name : " +this.name);
			System.out.println("Age : " +this.age);
			System.out.println("Marks : " +this.marks);
		}
}
public class EncapsulationInJava {
	public static void main(String[] args) {
		/*
		 * encapsulationEncapsulation is a mechanism that binding the data into a single 
		 * i,e making fields(state) 
		 */
		
//		Student std1 = new Student();
//		std1.setName("guru");
//		System.out.println(std1.getName());
//		
//		Student std2 = new Student();
//		System.out.println(std2.getName());
	
		Student std1 = new Student();
		std1.display();
		
		Student std2 = new Student(21, "guru", 400.0);
		std2.display();

	}
}
