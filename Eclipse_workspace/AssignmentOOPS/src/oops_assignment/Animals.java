package oops_assignment;

interface Animal {
    void eat();
    void makeSound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Animals {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.makeSound();
		
		Dog dog = new Dog();
		dog.eat();
		dog.makeSound();
	}
}
