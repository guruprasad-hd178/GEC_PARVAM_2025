package polymorphism;

class Person{
	public void walking() {
		System.out.println("The person is walking");
	}
}

class Guru extends Person{
	public void walking() {
		System.out.println("Guru is walking");
	}
}

class Addtion {
	public static void add(int a, int b) {
		System.out.println("Additon is : " +(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Additon is : " +(a+b+c));
	}
}

public class PolymorphismInJava {
	public static void main(String[] args) {
		/*
		 * polymorphism
		 * =============
		 * poly - many
		 * morphism - forms
		 * it is a mechanism that metods will perform a differnt actions
		 * based on the situation
		 * 
		 * 1 - method overloading (one class)
		 * 2 - method overriding (two classes)
		 */
//		1 overriding 	runtime/dynamic poly	dynamic binding
		Guru guru = new Guru();
		guru.walking();
		
//		2 overloading 	compile/static poly 	static binding 
		Addtion addition = new Addtion();
		Addtion.add(10, 20);
		addition.add(10, 20, 30);
	}
}
