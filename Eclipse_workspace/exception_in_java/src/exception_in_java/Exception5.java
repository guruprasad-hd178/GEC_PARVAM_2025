package exception_in_java;

public class Exception5 {
	
	public static void validateAge (int age)
	{
		if (age >= 18)
		{
			System.out.println("your age is : "+age);
		}
		else
		{
			throw new ArithmeticException("your age is invalid or less than 18");
		}
	}
	
	public static void main(String[] args) {
		try {
			validateAge(10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("program complete");
		}
	}
}
