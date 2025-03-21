package inheritance;

class GrandParentClass{
	public void grandParentMethod() {
		System.out.println("This is grandparent class");
	}
}

class ParentClass extends GrandParentClass{
	public void parentMethod() {
		System.out.println("This is Parent class");
	}
}

class ChildClass extends ParentClass{
	public void childMethod() {
		System.out.println("This is child class");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		ChildClass childclass = new ChildClass();
		childclass.childMethod();
		childclass.parentMethod();
		childclass.grandParentMethod();
	}
}
