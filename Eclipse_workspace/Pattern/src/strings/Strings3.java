package strings;

import java.util.Arrays;

public class Strings3 {
	public static void main(String[] args) {
		/*
		 * Methods in strings
		 * 
		 *  Length/Size:
			Returns the number of characters in the string.
			Example (Java): int length = myString.length();
			
			Accessing Characters:
			Retrieves a character at a specific index.
			Example (Java): char character = myString.charAt(index);
			
			Substring/Slicing:
			Extracts a portion of the string.
			Example (Java): String sub = myString.substring(startIndex, endIndex);
			
			Concatenation:
			Joins two or more strings together.
			Example (Java): String newString = str1.concat(str2);
			
			Searching:
			Finds the index of a character or substring, or checks for its presence.
			Example (Java): int index = myString.indexOf("search_term");
			
			Comparison:
			Compares two strings, often with options for case sensitivity.
			Example (Java): boolean isEqual = str1.equals(str2);
			Example (Java): boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
			
			Case Conversion:
			Converts the string to uppercase or lowercase.
			Example (Java): String upper = myString.toUpperCase();
			
			Replacement:
			Replaces occurrences of a character or substring with another.
			Example (Java): String replaced = myString.replace('oldChar', 'newChar');
			
			Splitting:
			Divides a string into an array or list of substrings based on a delimiter.
			Example (Java): String[] parts = myString.split(",");
			
			Trimming:
			Removes leading and trailing whitespace.
			Example (Java): String trimmed = myString.trim();
			
			intern()
		 */
		
		String str1 = "guru prasad";
		String str2 = new String("guru prasad");
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("==========================");
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(0));
		
		System.out.println("==========================");
		System.out.println(str1.substring(5));
		System.out.println(str2.substring(5));
		
		System.out.println("==========================");
		System.out.println(str1.trim());
		System.out.println(str2.trim());
		
		System.out.println("==========================");
		System.out.println(str1.intern() == str2.intern());

		String str5 = "guru";
		String[] str6 = str5.split("u");
		System.out.println(Arrays.toString(str6));
	}

}
