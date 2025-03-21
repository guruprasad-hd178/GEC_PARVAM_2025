package inheritance;

interface Interface1{
	public void method() ;
	public default void defaultMehod() {
		System.out.println("This is a default method in interface");
	}
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
}

class Child1 implements Interface1 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("This is method");
	}
	
}

public class InterfaceInJava2 {
	public static void main(String[] args) {
		
		Child1 child1 = new Child1();
		child1.method();
		child1.defaultMehod();
		Interface1.staticMethod();
	}
}
