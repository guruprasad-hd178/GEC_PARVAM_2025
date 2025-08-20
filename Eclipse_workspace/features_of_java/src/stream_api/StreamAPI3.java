package stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamAPI3 {
	
    public static boolean startsWithA(String s) {
        return s.startsWith("a");
    }
    
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("bdc","abc","abd");
		names.stream().filter(s -> s.startsWith("a")).forEach(c -> System.out.println(c));

//		names.stream().filter(s -> s.startsWith("a")).collect(null);
		
		names.stream().filter(StreamAPI3::startsWithA).forEach(c -> System.out.println(c));

	}
}
