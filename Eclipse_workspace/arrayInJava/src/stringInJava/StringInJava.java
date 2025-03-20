package stringInJava;

public class StringInJava {
	public static void main(String[] args) {
		/*
		 * strings
		 * 
		 * it is a group of chars
		 * 
		 * ex: table
		 * need to enclose within ""
		 * 
		 * how to declare the string 
		 * 
		 * 1 using string literal
		 * String var_name = "string_name"
		 * 
		 * 2 using new keyword
		 * String var_name = new String("String_name")
		 */
		String str1 = "guru";
		String str2 = new String("guru");
		String str3 = "guru";
		String str4 = new String("guru");

//		System.out.println(str1);
//		System.out.println(str2);
		
		System.out.println(str1.equals(str2));	//check for values	true
		System.out.println(str1 == str2);	//check for references	false

		System.out.println(str1 == str3); //true
		System.out.println(str1.equals(str3));	//true
		System.out.println(str2.equals(str4));	//true
		System.out.println(str2 == str4);	//false



		
	}
}
