package strings;

public class Strings2 {
	/*
	String:
	Mutability: String objects are immutable. Once created, their value cannot be changed. Any operation that appears to modify a String actually creates a new String object.
	Thread Safety: Not inherently designed for multi-threaded environments where frequent modifications are needed.
	Performance: Less efficient for frequent modifications or concatenations because each modification results in the creation of a new String object, leading to increased memory allocation and garbage collection overhead.

	StringBuffer:
	Mutability: StringBuffer objects are mutable, meaning their content can be modified after creation without creating new objects.
	Thread Safety: StringBuffer is synchronized and thread-safe. Its methods are designed to be used safely in multi-threaded environments, preventing data inconsistencies when multiple threads access and modify the same StringBuffer instance concurrently.
	Performance: Slower than StringBuilder due to the overhead of synchronization, which ensures thread safety.

	StringBuilder:
	Mutability: StringBuilder objects are also mutable, allowing their content to be modified after creation.
	Thread Safety: StringBuilder is not synchronized and therefore not thread-safe. It is intended for use in single-threaded environments or where external synchronization mechanisms are explicitly handled.
	Performance: Faster than StringBuffer because it does not incur the overhead of synchronization, making it more efficient for string manipulations in single-threaded contexts.

	In summary:
	Use String when you have a fixed string value that will not change.
	Use StringBuilder for efficient string modifications in a single-threaded environment.
	Use StringBuffer when you need thread-safe string modifications in a multi-threaded environment, acknowledging the performance cost associated with synchronization. 
	 */
	public static void main(String[] args) {
		String str1 = "gp";
		str1 = str1.concat("s");
		System.out.println(str1);
		
		String str2 = new String("gp");
		str2 = str2.concat("s");
		System.out.println(str2);
		
		StringBuffer str3 = new StringBuffer("gp");
		str3.append('s');
		System.out.println(str3);
		
	}

}
