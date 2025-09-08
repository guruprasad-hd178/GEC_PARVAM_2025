package com.springbootdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootdatajpa.entity.Student;
import com.springbootdatajpa.repository.StudentRepository;

@Component
public class SpringData {

	@Autowired
	StudentRepository repository;
	
	public void addStudent() {
		Student st = new Student("rohan", 21, "d@gmail.com");
		repository.save(st);
	} 
	
	public void getStudent() {
		Student student = repository.findById(1).get();
		System.out.println(student);
	}
}
