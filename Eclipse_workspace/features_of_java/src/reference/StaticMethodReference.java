package reference;

import java.util.function.Consumer;

public class StaticMethodReference {
	
	public static void print (String message) {
		System.out.println("Print message " +message);
	}
	
	public static void main(String[] args) {
//		Consumer<String> con1 = s -> StaticMethodReference.print(s);
//		con1.accept("Hello");
		
//		Consumer<String> con2 = StaticMethodReference::print;
//		con2.accept("Hello");
		
		print("Hi");
	}
}
