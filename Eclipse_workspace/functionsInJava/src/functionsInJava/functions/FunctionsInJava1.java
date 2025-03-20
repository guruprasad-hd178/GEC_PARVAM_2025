package functionsInJava.functions;

public class FunctionsInJava1 {
	
	/*
	 * 1 public function 
	 * anywhere
	 */
	public void publicFunction() {
		System.out.println("This is a public function");
	}
	
	/*
	 * 2 private function 
	 * within class
	 */
	private void privateFunction() {
		System.out.println("This is a private function");
	}
	
	/*
	 * 3 default function 
	 * within package
	 */
	void defaultFunction() {
		System.out.println("This is a default function");
	}
	
	/*
	 * 4 protected function 
	 * within package and subclass in other package
	 */
	protected void protectedFunction() {
		System.out.println("This is a protected function");
	}
	
	/*
	 * 5 static fuction 
	 * we can access by using just class name
	 */
	public static void staticFunction() {
		System.out.println("This is a function");
	}
	
	
	
	public static void main(String[] args) {
		FunctionsInJava1 obj = new FunctionsInJava1();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		staticFunction();
	}
}
