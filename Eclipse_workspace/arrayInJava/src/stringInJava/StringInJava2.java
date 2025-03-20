package stringInJava;

public class StringInJava2 {
	public static void main(String[] args) {
		/*
		 * string methods
		 * 
		 * 1 equals
		 * 2 ==
		 * 3 compareTo
		 * 4 contact
		 * 5 touppercase
		 * 6 tolowercase
		 * 7 trim
		 * 8 startswith
		 * 9 endswith
		 * 10 strip
		 * 11 equalsignorcase
		 * 12 isBlank
		 * 
		 */
		
		String str1 = new String ("Hello World");
		String str2 = new String ("hello World");

//		1 equals
		System.out.println("equals : " +str1.equals(str2));
		
//		2 equalignorecase
		System.out.println("equalignorecase : " +str1.equalsIgnoreCase(str2));
		
//		3 ==
		System.out.println(" == : " +str1==str2 );
		
//		4 concat
		System.out.println(str1.concat(" ").concat(str2));
		
//		5 touppercase
		System.out.println(str1.toUpperCase());
		
//		6 tolowercase
		System.out.println(str1.toLowerCase());
		
//		7 trim
		System.out.println(str1.trim());
		
//		8 startswith
		System.out.println(str1.startsWith(str1, 0));
		
//		9 endswith
		System.out.println(str1.endsWith(str2));

//		10 strip
		System.out.println(str1.strip());

//		11 
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
	}
}
