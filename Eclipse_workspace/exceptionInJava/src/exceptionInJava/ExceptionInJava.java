package exceptionInJava;

import java.io.*;

public class ExceptionInJava {
	
//	public static void display() {
//		display();
//	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * exception 
		 * =============
		 * there is a unwanted or unexpected event occur in the program
		 * when ever there is exception the normal flow will stops
		 * 
		 * 2 types
		 * =========
		 * 1 checked exception(compile time) - fileNotFoundException	(2 ways)
		 * 2 unchecked exception(run time) - arrayIndexOutOfBoundException	(1 way)
		 * 
		 * erro
		 * =======
		 * it is aproblem where the programmer cant handle it - stackoverflow error
		 */
//		display();
		
		
		/*
		 * error
		 * 
		 * 
		 * checked exception
		 * 1 try catch
		 * 2 throws
		 * 
		 */
		
		
//		PrintWriter printwriter;
//		try 
//		{
//			printwriter = new PrintWriter("abc.txt");
//			printwriter.println("hello world");
//			System.out.println("Printed");
//			printwriter.close();
//		} 
//		catch (FileNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		PrintWriter printwriter = new PrintWriter("abc.txt");
		printwriter.println("hello world");
		System.out.println("Printed");
		printwriter.close();
		
	}

}
