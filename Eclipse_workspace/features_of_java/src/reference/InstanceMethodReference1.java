package reference;

import java.util.function.Supplier;

public class InstanceMethodReference1 {
	
	public String getMessage() {
		return "This is instance method";
	}
	
	public static void main(String[] args) {
		InstanceMethodReference1 ir1 = new InstanceMethodReference1();
		Supplier<String> sup1 = () -> ir1.getMessage();
		Supplier<String> sup2 = ir1::getMessage;
		
		System.out.println(sup1.get());
		System.out.println(sup2.get());
	}

}
