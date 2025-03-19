package control_statement_java;

public class Switch3 {
	public static void main (String[] args) {
		Object obj = 5;
		
		switch (obj)
		{
		case String s -> System.out.println("string type");
		case Integer s -> System.out.println("integer type");
		default -> System.out.println("none");
		}
	}
}
