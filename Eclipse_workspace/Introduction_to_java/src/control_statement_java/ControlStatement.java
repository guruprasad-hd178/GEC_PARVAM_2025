package control_statement_java;

public class ControlStatement {
	public static void main( String[] args) {
		/*
		 * if , if else , else if and switch statement
		 * 
		 * if(condition){
		 * }
		 * 
		 * if (condition){
		 * }
		 * else{
		 * }
		 * 
		 * if (condition){
		 * }
		 * else if (codition){
		 * }
		 * else if (condition){
		 * }
		 * else{
		 * }
		 * 
		 * 
		 * switch (condition){
		 * 		case : code
		 * 		break
		 * 
		 * 		default
		 * }
		 * 
		 */
		int age = 6;
		
		
		if ( age > 18 )
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
		
		int num = 76;
		
		if( num > 100 )
		{
			System.out.println("Greatest");
		}
		else if( num > 50 )
		{
			System.out.println("Greater");
		}
		else 
		{
			System.out.println("Great");
		}
		
		int n = 7;
		
		switch (n)
		{
			case 1 : System.out.println("Monday");
					break;
					
			case 2 : System.out.println("Tueday");
			break;
			
			case 3 : System.out.println("Wednesday");
			break;
			
			case 4 : System.out.println("Thursday");
			break;
			
			case 5 : System.out.println("Friday");
			break;
			
			case 6 : System.out.println("Saturday");
			break;
			
			case 7 : System.out.println("Sunday");
			break;
			
			default : System.out.println("not a day");
			break;
		}
	}
}
