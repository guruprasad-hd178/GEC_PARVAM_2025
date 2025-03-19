package operators.java;

public class Operators {
	public static void main(String []args) {
		/*
		 * Arithmatic operators 	 + , - , * , / 
		 * Unary operators 		++ , --
		 * Assignment 		-=, += , *= . /= , %=
		 * Relational 		 < , > <= ,>= , != , == 
		 * Logical 			&& , || , ! 
		 * Ternary 			? :
		 * Bitwise 			& , ! , ~ 
		 * shift 			>> , <<
		 * instance			
		 */ 
		
		int a = 6;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
		System.out.println(a++);
		System.out.println(++b);
		
		System.out.println(a += 2);
		System.out.println(b -= 2);
		System.out.println(a *= 2);
		System.out.println(b /= 2);
		
	}
}
