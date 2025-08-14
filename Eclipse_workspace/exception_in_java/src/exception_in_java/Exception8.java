package exception_in_java;

public class Exception8 
{
	    public static void main(String[] args) 
	    {
	        try 
	        { // Outer try block
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing array element at index 1: " + numbers[1]);

	            try
	            { // Inner try block
	                int result = 10 / 0; // This will cause an ArithmeticException
	                System.out.println("Result of division: " + result);
	            } 
	            catch (ArithmeticException e) 
	            {
	                System.out.println("Inner Catch: Division by zero error: " + e.getMessage());
	            }
	            
	            finally 
		        {
					System.out.println("Final");
				}

	            System.out.println("Accessing array element at index 5: " + numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
	            
	        } 
	        
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Outer Catch: Array index out of bounds error: " + e.getMessage());
	        } 
	        
	        catch (Exception e) 
	        { // General catch for other exceptions
	            System.out.println("Outer Catch: An unexpected error occurred: " + e.getMessage());
	        } 
	        
	        finally 
	        {
	            System.out.println("Finally block executed.");
	        }
	        
	    }
	}
