package inheritance;

class Parent{
	int data = 100;
	public void parentMethod() {
		System.out.println("This is parent method");
	}
	public static void childMethod1() {
		System.out.println("This is child method");
	}
}

class Child2 extends Parent {
	int cdata = 200;
	public void childMethod() {
		System.out.println("This is child method");
	}
	
	
	public void parentMethod() {
		System.out.println("This is parent method");
	}
	
	void childMethod2() {
		System.out.println("This is child method");
	}

}


	


public class InheritanceInJava {
	public static void main(String[] args) {
		/*
		 * Inheritance:
		 * ===========
		 * extending the properties of parent class to child class
		 * properties (state and actions)
		 * 
		 * types
		 * ========
		 * 1 single level
		 * 2 multilevel
		 * 3 heirarchical
		 * 4 hybrid 
		 * 5 multiple -> not possible
		 */
		Child2 child2 = new Child2();
		child2.parentMethod();
		child2.childMethod();
		System.out.println(child2.data);
		System.out.println(child2.cdata);
		
		Parent.childMethod1();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
