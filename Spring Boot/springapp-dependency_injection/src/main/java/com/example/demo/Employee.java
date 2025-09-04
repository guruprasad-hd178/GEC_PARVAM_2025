package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	@Qualifier("address2")
	@Autowired
	private Address addressOne;

	public Employee() {
		System.out.println("Employee object created");
	}
}
