package setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetInterface1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(13);
		set.add(null);
		set.add(null);
		set.add(13);
		set.add(12);
		System.out.println(set);
		
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(null);
		num.add(null);
		num.add(2);
		num.add(1);
		System.out.println(num);
		
		Set<Integer> nums = new HashSet<Integer>(num);
		System.out.println(nums);

	}
}
