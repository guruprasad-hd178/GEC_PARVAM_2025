package typeCastingInJava;

public class TypecastingInJava {
	public static void main(String[] args) {
	/*
	 * type casting
	 * ============
	 * conversion of one data type to another
	 * 
	 * 1 implicit
	 * ===============
	 * byte -> short -> long -> float -> double
	 * 
	 * 2 explicit
	 * ===============
	 * double -> float -> long -> short -> byte
	 * 
	 */
		
//		1
		int a = 10;
		long a2 = a;
		
		System.out.println("Int : " +a);
		System.out.println("Long : " +a2);
		
//		2
		long a3 = 10;
		int a4 = (int) a3;
		
		System.out.println("Long : " +a3);
		System.out.println("Int : " +a4);
		
//		3
		long a5 = 10;
		float a6 = a5;
		
		System.out.println("Long : " +a5);
		System.out.println("Float : " +a6);
		
//		4
		float a7 = 10;
		long a8 = (long) a7;
		
		System.out.println("Float : " +a7);
		System.out.println("Long : " +a8);


		
	}
}
