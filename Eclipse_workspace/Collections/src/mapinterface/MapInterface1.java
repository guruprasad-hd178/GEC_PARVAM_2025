package mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "a");
		map.put(3, null);
		map.put(null, "a");
		map.put(2, "b");
//		System.out.println(map.containsKey(1));
//		System.out.println(map.get(1));
//		map.remove(2);
		System.out.println(map);
		
		
		System.out.println("using entryset");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> keyValue :entrySet)
		{
			System.out.print(keyValue);
		}
		
		System.out.println();
		System.out.println("using foreach");
		map.forEach((k,v) -> System.out.print (k+"=>"+v));
	}
}
