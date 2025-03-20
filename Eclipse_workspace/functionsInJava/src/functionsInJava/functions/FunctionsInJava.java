package functionsInJava.functions;

public class FunctionsInJava {
	
//	2
	public int add(int a, int b) {
		return a+b;
	}
	
//	1
	public int mud() {
		return 90;
	}
	
//	3
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
	
//	4
	public void mux() {
		System.out.println( 4 );
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * <access modifier> return_type function_name (parameters){
		 * 	code
		 * }
		 * 
		 * two:
		 * 
		 * 1. built-in - next(), nextLine(), println(), equals()
		 * 2  user defined
		 * ===============
		 * a function return a value not acceting parameter
		 * b function return a value and accept a parameter
		 * c function not return a value but accept a parameter
		 * d function not return a value but not accept a parameter
		 * 
		 */
		FunctionsInJava obj1 = new FunctionsInJava();
		int res = obj1.add(20, 20);
		System.out.println ("output is : " +res);
		
		FunctionsInJava obj2 = new FunctionsInJava();
		int rej = obj2.mud();
		System.out.println ("output is : " +rej);
		
		FunctionsInJava obj3 = new FunctionsInJava();
		obj3.mul(2, 4);
		
		FunctionsInJava obj4 = new FunctionsInJava();
		obj4.mux();
		
	}
}
