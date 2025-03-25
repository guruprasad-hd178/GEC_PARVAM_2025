package final_this_super;

final class Animal{
	public void eat() {
		System.out.println("eat");
	}
}

//class Dog extends Animal {
//	
//}

public class FinalnJava {
	public static void main(String[] args) {
		/*
		 * final -> we cant change the value
		 * variables, method, class
		 * variables - the value cannot be changed
		 * method - we cannot override
		 * class - we cannot extend that class
		 */
		
		final double pi = 3.14;
		System.out.println(pi);
//		pi = 4.14;
		
		Animal animal = new Animal();

//		Animal animal = new Animal() {
//			
//			@Override
//			public void eat() {
//				// TODO Auto-generated method stub
//				System.out.println("start ab 2");
//			}
//		};
		animal.eat();
		
	}
}
