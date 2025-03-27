package predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInJava {
	public static void main(String[] args) {
		/*
		 * function
		 * ==========
		 * it will take one parametr then perform action and return value
		 * 
		 */
		Function<String, Integer> f = (s) -> s.length();
		int res = f.apply("Hello");
		System.out.println(res);
		
		Function<Integer, Integer> f1 = (s) -> s * s;
		int res1 = f1.apply(3);
		System.out.println(res1);
		
	}
}
