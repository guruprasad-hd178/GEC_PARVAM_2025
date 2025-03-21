package inheritance;

interface A {
	public void method() ;
}

interface B {
	public void method() ;
}

class Child implements A,B {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("This is common method ");
	}

//	@Override
//	public void methodB() {
//		// TODO Auto-generated method stub
//		System.out.println("This is method B");
//	}
//
//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		System.out.println("This is method A");
//	}
	
}

public class InterfaceInJava1 {
	public static void main(String[] args) {
		Child child = new Child();
//		child.methodA();
//		child.methodB();
		
		child.method();
		child.method();
	}
}
