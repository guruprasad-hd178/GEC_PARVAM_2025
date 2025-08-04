package strings;

public class Constructor_in_strings {
	public static void main(String[] args) {
		/*
		 * String constructors in java
		 * 
		 */
		String str1 = new String();
		System.out.println(str1);
		str1 = "some value";
		System.out.println(str1);
		
		String str2 = new String("gp");
		System.out.println(str2);
		
		char[] arr1 = {'a','b','c','d'};
		String str3 = new String(arr1);
		System.out.println(str3);
		
		byte[] arr2 = {65,66,97,98};
		String str4 = new String(arr2);
		System.out.println(str4);
		
		StringBuffer sb = new StringBuffer("12345");
		String str5 = new String(sb);
		System.out.println(str5);
		
		StringBuilder s = new StringBuilder("s");
		String str6 = new String(s);
		System.out.println(str6);
		
	}
}
