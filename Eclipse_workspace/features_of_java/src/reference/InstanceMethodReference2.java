package reference;

import java.util.Arrays;

public class InstanceMethodReference2 {
	public static void main(String[] args) {
		String[] names = {"abc","adc","abd","bcd", " "};
		
//		Arrays.sort(names, (a, b) -> a.compareToIgnoreCase(b));
		
		Arrays.sort(names, String::compareToIgnoreCase);
		
		System.out.println(Arrays.toString(names));
	}
}
