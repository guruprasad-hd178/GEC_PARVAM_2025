package inheritance;

class ParentClass1 {
	public void parentMethod() {
		System.out.println("This is Parent class");
	}
}

class ChildClass1 extends ParentClass1{
	public void childMethod() {
		System.out.println("This is child 1 class");
	}
}

class ChildClass2 extends ParentClass1{
	public void childMethod() {
		System.out.println("This is child 2 class");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		ChildClass1 childclass1 = new ChildClass1();
		childclass1.childMethod();
		
		ChildClass2 childclass2 = new ChildClass2();
		childclass2.childMethod();
	}
}
