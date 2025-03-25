package exceptionInJava;

public class ExceptionInJava1 {
	public static void main(String[] args) {
		/*
		 * unchecked exception (run time)
		 */
		
		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("hello world");
		}
	}
}
