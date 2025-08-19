package functional_interface;

@FunctionalInterface
interface UpInterface {
	public String upper(String s);
}

public class UpperInterface {
	public static void main(String[] args) {
		UpInterface up = s -> s.toUpperCase();
		String res = up.upper("string");
		System.out.println(res);
	}
}