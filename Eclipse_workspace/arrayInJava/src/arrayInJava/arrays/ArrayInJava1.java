package arrayInJava.arrays;
import java.util.*;

public class ArrayInJava1 {
	public static void main(String[] args) {
		/*
		 * 2D array
		 * 
		 * 
		 */
		Scanner sc = new Scanner (System.in);
		
		int [][] arr = new int [2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		
//		System.out.print("Enter aray sizes m and n : ");
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		int [][] arr = new int [m][n];
//		
//		System.out.print("Enter array elements : ");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println(" ");
//		}
		
		
		
		sc.close();
	}
}
