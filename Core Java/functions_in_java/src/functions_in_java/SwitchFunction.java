package functions_in_java;

public class SwitchFunction {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int choice = 2;
		switch(choice) {
			case 1:{
				int res = add(a,b);
				System.out.println("Add: "+res);
				break;
			}
			default:System.out.println("Invalid Choice");
		}
	}
}
