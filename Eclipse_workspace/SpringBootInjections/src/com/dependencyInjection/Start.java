package com.dependencyInjection;

public class Start {
	public static void main(String[] args) {
		
//		1 constructor injection
//		Address address = new Address("Hassan", "Karnataka");
//		Student student = new Student(1, "Guru", address);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		Address address1 = student.getAddress();
//		System.out.println(address1.getCity());
//		System.out.println(address1.getState());
////		System.out.println(student.getAddress().getCity());
		
		
//		2 setter injection
		Address address2 = new Address();
		address2.setCity("Hassan");
		address2.setState("Karnataka");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Guru");
		student1.setAddress(address2);
		
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		Address address3 = student1.getAddress();
		System.out.println(address3.getCity());
		System.out.println(address3.getState());
//		System.out.println(student1.getAddress().getCity());
	}
}
