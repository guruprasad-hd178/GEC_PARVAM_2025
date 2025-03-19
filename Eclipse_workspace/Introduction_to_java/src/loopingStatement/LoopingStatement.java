package loopingStatement;

public class LoopingStatement {
	public static void main (String[] args) {
		/*
		 * for loop
		 * while loop
		 * do while loop
		 * 
		 */
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
		
		while (n < 10) {
			System.out.println(n);
			n++;
		}
		
		do {
			n++;
			System.out.println(n);
		}
		while (n < 15);
		
		
//		for each
		int [] arr = {1,2,3,4,5};
		for (int a : arr)
		{
			System.out.println(a);
		}
		
		
	}
}
