package exception_in_java;

public class Exception4 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
//			System.out.println(10/0);     exception occurs
			System.out.println("Final boss");
		}
		
	}
}
