package com.functionalinterface;

@FunctionalInterface
interface Interface2 {
	public void display() ;
}

interface Interface3 {
	public int String (String s) ;
}

interface Interface4 {
	public int add (int a, int b);
}

public class FunctionalInterfaceInJava1 {
	public static void main(String[] args) {
		Interface2 i = () -> System.out.println("Hello world");
		i.display();
		
		Interface3 i3 = s -> s.length();
		int r1 = i3.String("hello world");
		System.out.println(r1);
		
		Interface4 i4 = (a, b) ->  a + b;
		int r2 = i4.add(5, 95);
		System.out.println(r2);
	}
}
