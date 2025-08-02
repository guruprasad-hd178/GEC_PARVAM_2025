package numbers;

import java.util.Scanner;

//public class Triangle {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		for (int i = 1; i <= n; i++)
//		{
//			for (int j = 1; j <= i ; j++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//INVERTED TRIANGLE

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}