package inheritance;

class ParentClass2 {
	public void parentMethod() {
		System.out.println("This is Parent class");
	}
}

interface Interface2{
	public void method() ;
}

class ChildClass3 extends ParentClass2 implements Interface2{
	public void childMethod() {
		System.out.println("This is child 1 class");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("interface inheritance");
	}
}

public class Hybrid {
	 public static void main(String[] args) {
		ChildClass3 childclass3 = new ChildClass3();
		childclass3.childMethod();
		childclass3.method();
	}
}
