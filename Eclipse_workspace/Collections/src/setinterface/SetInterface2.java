package setinterface;

import java.util.TreeSet;
import java.util.Set;

public class SetInterface2 {
	public static void main(String[] args) {
		/*
		 * null not accepted 
		 * order is sorted
		 * duplicate not allowed
		 * 
		 */
//		Set<Integer> num = new TreeSet<Integer>();
		TreeSet<Integer> num = new TreeSet<Integer>((t1,t2) -> t2 - t1);

		num.add(11);
//		num.add(null);
		num.add(12);
		num.add(14);
//		num.add(null);
		num.add(11);
		num.add(12);
		num.add(13);
		System.out.println(num);
		
		
	}
}
