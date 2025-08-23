package method_local;

public class MethodLocalInnerClass {
	
	public void m1() {
		class Inner {
			public void m2() {
				System.out.println("This is method local inner class");
			}
		}
		Inner in = new Inner();
		in.m2();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass class1 = new MethodLocalInnerClass();
		class1.m1();
	}
}




