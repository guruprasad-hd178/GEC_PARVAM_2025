package method_local;

public class MethodLocalInnerClass2 {
	public  int a = 10;
	public static int b = 40;
	
	public void m1() {
		int z = 20;
		class Inner {	// final or abstract
			public void m2() {
				int z1 = 30;
				System.out.println(a+" "+z+" "+z1);
			}
		}
		Inner in = new Inner();
		in.m2();
	}
	
	public static void main(String[] args) {
		new MethodLocalInnerClass2().m1();
	}
}
