package polymorphism;

class Addition
{
	public void add(int a, int b)
	{
		System.out.println("1st mt : "+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("2nd mt : "+(a+b+c));
	}
}




public class Polymorphism1 {
	
	public static void add(int a, int b)
	{
		System.out.println("1st mt : "+(a+b));
	}
	public static void add(int a, int b, int c)
	{
		System.out.println("2nd mt : "+(a+b+c));
	}
	
	public static void main(String[] args) {
		add(1, 2);
		add(1, 2, 3);		
		
		Addition add = new Addition();
		add.add(1, 2);
		add.add(1, 2, 3);
	}
}
