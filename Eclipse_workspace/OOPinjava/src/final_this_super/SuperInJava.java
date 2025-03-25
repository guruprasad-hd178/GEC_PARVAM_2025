package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("This is parent class constructor");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name : " +this.name);
		System.out.println("Age : " +this.age);
	}
}

class Dog extends NewAnimal{
	public String eat;

	public Dog(String name, int age, String eat) {
		super(name, age);
		System.out.println("This is child class constructor");
		this.eat = eat;
	}
	
	public void display() {
		super.display();
		System.out.println("Dog eats : "  +this.eat);
		System.out.println("Dog name : "  +super.name);

	}
}

public class SuperInJava {
	public static void main(String[] args) {
		/*
		 * super
		 * ========
		 * 1 it is used to call super class instance variables
		 * 2 it is used to call super class constructor
		 * 3 it is used to call super class metods
		 */
		Dog dog = new Dog("rk", 20, "kr"); 
		dog.display();
	}
}
