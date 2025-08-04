package strings;

public class Strings1 {
	public static void main(String[] args) {
		String str1 = "gp";
		String str2 = "gp";
		
		String str3 = new String("gp");
		String str4 = new String("gp");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		System.out.println("==================================");
		
		/*
		 * String Comparison
		 * 
		 * 1 == - reference comparison
		 * 2 equals() - value
		 * 3 compareTo - based on bytes
		 * 
		 * 
		 */
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		System.out.println("===================================");
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str4));

	}

}
