package final_this_super;

class Person{
	public String name;
	public int age;
	
	public Person() {
		System.out.println("No args constructor");
	}
	
	public Person(String name, int age) {
		System.out.println("All args constructor");
		this.name = name;
		this.age = age;
	}
	
	public void sayhello() {
		System.out.println("Hello");
	}
	public void display() {
		this.sayhello();
		System.out.println("Name is : "  +this.name);
		System.out.println("Name is : " +name);
	}
}

public class ThisInJava {
	public static void main(String[] args) {
		/*
		 * this keyword 
		 * =============
		 * 1 used to refer instance variables current class
		 * 2 used to refer current class constructor
		 * 3 used to refer methods in current class
		 */
		Person person = new Person("guru", 21);
		person.display();
		
		Person person1 = new Person();
		person1.display();

	}
}
