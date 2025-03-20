package arrayInJava.arrays;
import java.util.*;

public class ArrayInJava {
	public static void main(String[] args) {
		/*
		 * Arrays in java
		 * 
		 * if we went to store a multiple values of same datatype
		 * 
		 * how to declare the array
		 * 
		 * <datatype> [] array_name = new <datatype>[size];
		 * 
		 * int [] arr1 = new int [4]
		 * 
		 * 
		 * how to declare and intialize array
		 * 
		 * int [] arr = {1,2,3,4,5}
		 * 
		 * types
		 * 
		 * 1D array -> single row
		 *   int [] arr1 = new int [4]
		 *   
		 * 2D array -> table form
		 *   int [][] arr1 = new int [4][3]; 4*3 --> 12
		 *   
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the array length : ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 10;
//		}
		
//		arr[0] = 30;
//		arr[1] = 30;
//		arr[2] = 30;
//		arr[3] = 30;
//		arr[4] = 30;
//		arr[5] = 30;
		
		for (var i : arr)
		{
			System.out.print(i+ " ");
		}

	}
}
