package exception_in_java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception1 {
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		Error
		
		int res = fact(3);
		System.out.println(res);
		
		Exception
		checked
		
		*/
		try {
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.println("hello");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("hello");
		pw.close();
		
	}
	private static int fact (int i)
	{
		return i*fact(i - 1);
	}
}
