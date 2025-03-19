package control_statement_java;
import java.util.*;

public class Switch2 {
	public static void main( String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int n = 1;
		
		switch (n)
		{
			case 1 -> System.out.println("Monday");
					
			case 2 -> System.out.println("Tueday");
			
			case 3 -> System.out.println("Wednesday");
			
			case 4 -> System.out.println("Thursday");
			
			case 5 -> System.out.println("Friday");
			
			case 6 -> System.out.println("Saturday");
			
			case 7 -> System.out.println("Sunday");
			
			default -> System.out.println("not a day");
		}
		
		System.out.println("Enter a number : ");
		int nd = sc.nextInt();
		
		if ( nd > 0 && nd < 6)
		{
			System.out.println("weekdays");
		}
		else if ( nd > 5 && nd < 8)
		{
			System.out.println("weekend");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
		System.out.println("Enter a number : ");
		int ns = sc.nextInt();
		
		switch (ns)
		{
			case 1,2,3,4,5 -> System.out.println("weekday");
			
			case 6,7 -> System.out.println("weekend");
			
			default -> System.out.println("invalid day");
		}
		
		String res = switch (ns)
		{
			case 1,2,3,4,5 -> "weekday";
			
			case 6,7 -> "weekend";
			
			default -> "invalid day";
		};
		
		System.out.println("The result is : " +res);
	}
}
