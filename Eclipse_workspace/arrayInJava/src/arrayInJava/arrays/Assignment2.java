package arrayInJava.arrays;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

//		System.out.print("Enter array rows and columns : ");
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		
//		int [][] arr = new int [row][col];
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
		
		
		
		System.out.print("Enter array rows and columns : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		char [][] arr = new char [row][col];
		
		System.out.print("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		

		sc.close();
	}
	
}
