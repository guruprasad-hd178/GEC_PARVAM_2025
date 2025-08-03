package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("Array : " +Arrays.toString(arr));
		
		System.out.println("Enter k to rotate array");
		int k = sc.nextInt();
		int n = arr.length;
		k = k % n;
		
		rotateLeft(arr, k);
//		rotateright(arr, k);
		
        System.out.println("Rotated array: " + Arrays.toString(arr));
	}

//	private static void rotateright(int[] arr, int k) 
//	{
//		if (k == 0) return;
//		int n = arr.length;
//
//		reverse(arr, 0, n - 1);
//		reverse(arr, 0, k - 1);
//		reverse(arr, k, n - 1);
//	}

	private static void rotateLeft(int[] arr, int k) 
	{
		if (k == 0) return;
		int n = arr.length;
	
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) 
	{
		while (start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
