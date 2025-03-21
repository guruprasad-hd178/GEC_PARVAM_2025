package inheritance;

interface Animal{
	public void makeSound();
	
}

class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat implements Animal {
	@Override
	public void makeSound(){
		System.out.println("Cat Meows");
	}
}

public class InterfaceInJava {
	public static void main(String[] args) {
		/*
		 * Interface:
		 * ==========
		 * it is a blue print of the class
		 * the methods in the interface by default abstract (does not contain a body)
		 * from java 8 we can write default and ststic methods in interface
		 * if you dont know the complete  
		 * 
		 * interface interface_name{
		 * //code
		 * }
		 * 
		 * interface Animal{
		 * 	public void makeSound();
		 * }
		 * 
		 */
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
	}
}
