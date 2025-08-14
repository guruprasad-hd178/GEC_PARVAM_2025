package exception_in_java;

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String message) {
		super(message + " exception");
	}
}
public class Exception6 {
	
	public static void validateAge(int age) throws InvalidAgeException {
		
		if (age >= 18)
		{
			System.out.println("your age is : "+age);
		}
		else
		{
			throw new InvalidAgeException("your age is invalid");
		}
	}
	
	public static void main(String[] args) {
		try 
		{
			validateAge(0);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
