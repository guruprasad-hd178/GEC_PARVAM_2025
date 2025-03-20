package arrayInJava.arrays;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
//		System.out.println("Enter the array length : ");
//		int n = sc.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("Enter array elements : ");
//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.println("Element " +(i+1)+ " : " ); ;
//			arr[i] = sc.nextInt();
//		}
//		
//		for (var i : arr)
//		{
//			System.out.print(i+ " ");
//		}
		
		
		
		

		System.out.println("Enter the array length : ");
		int m = sc.nextInt();
		char [] ar = new char [m];
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Element " +(i+1)+ " : " ); ;
			ar[i] = sc.next().charAt(0);
		}
		
		for (var i : ar)
		{
			System.out.print(i+ " ");
		}
		
		sc.close();
	}
}
