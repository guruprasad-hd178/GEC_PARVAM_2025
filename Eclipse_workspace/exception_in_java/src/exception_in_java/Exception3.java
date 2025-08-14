package exception_in_java;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		
		try {
			int res = a/b;
			String str = null;
			str.toString();
			System.out.println("Result : " +res);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(a+ " " +b);
		
	}
}
