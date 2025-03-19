package introduction_to_java.first_program;

import java.util.Scanner;

public class UserInputValues {
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		System.out.println("int " +age);
		
		byte g = sc.nextByte();
		System.out.println("byte " +g);
		
		short s = sc.nextShort();
		System.out.println("short " +s);
		
		String a = sc.next();
		System.out.println("string " +a);
		
		char c = sc.next().charAt(0);
		System.out.println("char " +c);
		
		boolean b = sc.nextBoolean();
		System.out.println("boolean " +b);
		
		String n = sc.nextLine();
		System.out.println(n);
		
	}
}
