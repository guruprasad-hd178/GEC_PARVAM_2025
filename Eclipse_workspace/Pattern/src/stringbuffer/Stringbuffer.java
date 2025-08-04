package stringbuffer;

public class Stringbuffer {
	public static void main(String[] args) {
		/*
		    append(): Adds the string representation of various data types (e.g., String, int, boolean, char[], Object) to the end of the StringBuffer.
			insert(): Inserts the string representation of various data types at a specified index within the StringBuffer.
			delete(): Removes characters from a specified range of indices within the StringBuffer.
			deleteCharAt(): Removes the character at a specific index.
			replace(): Replaces a portion of the StringBuffer with a new String.
			charAt(): Returns the character at a specified index.
			setCharAt(): Sets the character at a specified index.
			length(): Returns the number of characters in the StringBuffer.
			capacity(): Returns the current capacity of the StringBuffer, which is the total number of characters it can store before needing to reallocate memory.
			ensureCapacity(): Ensures that the StringBuffer has at least the specified minimum capacity. 
			trimToSize(): Reduces the capacity of the StringBuffer to its current length.
			reverse(): Reverses the sequence of characters in the StringBuffer.
			indexOf(): Returns the index of the first occurrence of a specified substring or character. 
			lastIndexOf(): Returns the index of the last occurrence of a specified substring or character.
			substring(): Returns a new String containing a portion of the StringBuffer.
			toString(): Converts the StringBuffer content to a String object.
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("golden public school");
		System.out.println(sb);
		
		sb.append("123456789");
		System.out.println(sb);
		
		sb.insert(20, " ");
		System.out.println(sb);
		
		sb.delete(21, 30);
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.lastIndexOf("p"));
	}

}
