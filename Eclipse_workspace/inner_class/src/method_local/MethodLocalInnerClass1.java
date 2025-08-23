package method_local;

public class MethodLocalInnerClass1 {

	public static int a = 10;
	public static int b = 20;
	
	public static void m1() {
		class Inner {
			public void m2() {
				System.out.println(a+" "+b);
			}
		}
		Inner in = new Inner();
		in.m2();
	}
	
	public static void main(String[] args) {
		new MethodLocalInnerClass1();
		MethodLocalInnerClass1.m1();
	}
}
