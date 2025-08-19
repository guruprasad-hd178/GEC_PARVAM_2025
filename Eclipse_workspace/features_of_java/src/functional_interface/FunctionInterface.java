package functional_interface;

@FunctionalInterface
interface FunInterface {
	public int add (int a, int b);
}

public class FunctionInterface {
	public static void main(String[] args) {
		FunInterface in = (a, b) -> a + b;
		int res = in.add(10, 20);
		System.out.println(res);
	}
}
