package wrapperClasses;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * java is a not a pure oop
		 * =======================
		 * primitive data types
		 * 
		 * primitive data types
		 * ===================
		 * byte, short, int, long, float, double, char, boolean
		 * 
		 * String name = new String("gp");
		 * 
		 * collection
		 * ===========
		 * to store group of individual objects as a single entity
		 * 
		 * 10,20,30,40 -----> int(primitive data type)
		 * 
		 * wrapper classes
		 * ================
		 * byte --> Byte
		 * short --> Short
		 * int --> Integer
		 * long --> Long
		 * float --> Float
		 * double --> Double
		 * char --> Character
		 * boolean --> Boolean
		 * 
		 */
		
//		1 auto boxing --> from primitive to wrapper
		int a = 100;
//		Integer i = a; implicit
		Integer i = Integer.valueOf(a);
		System.out.println("int : " +a);
		System.out.println("Integer : " +i);     
		System.out.println("Integer type : " +i.getClass().getName());
		
		float a2 = 100;
//		Float i2 = a2; implicit
		Float i2 = Float.valueOf(a2);
		System.out.println("float : " +a2);
		System.out.println("Float : " +i2);
		System.out.println("Float type : " +i2.getClass().getName());

//		2 unboxing
		Integer i1 = 10;
//		int a1 = i1;
		int a1 = i1.intValue();
		System.out.println("int : "+a1);
		System.out.println("Integer : "+i1);
		System.out.println("Integer type : " +i1.getClass().getName());
		
		char a3 = 'a';
//		int a1 = i1;
		Character i3 = a3;
		System.out.println("charf : "+a3);
		System.out.println("Character : "+i3);
		System.out.println("Character type : " +i3.getClass().getName());

		
	}
}
