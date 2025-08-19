package functional_interface;

@FunctionalInterface
interface StInterface
{
	public int length(String s);
}

public class StringInterface {
	public static void main(String[] args) {
		StInterface st = s -> s.length();
		int res = st.length("String");
		System.out.println(res);
	}
}
