package introduction_to_java.first_program;

import java.util.*;

public class NonPrimitive {
	public static void main(String []args) {
		/*
		 * Array
		 * 
		 * <datatype> [] arrayname = {}
		 * 
		 * String
		 * String name = "";
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
//		int[] array1 = {1,2,3,4,5};
//		System.out.println(array1[0]);`
		
//		String name = "gap";
//		System.out.println(name);
		
//		String n = sc.nextLine();
//		System.out.println(n);
		
		String name = sc.next(), branch = sc.next(), address = sc.next();
		int age = sc.nextInt(), marks = sc.nextInt();
		char gender = sc.next().charAt(0);
		
		System.out.println(" Name : " +name+ "\n Age : "  +age+  "\n Marks : " +marks+ "\n Gender : " +gender+ "\n Branch : " +branch+ "\n Address : " +address );
	}
}
