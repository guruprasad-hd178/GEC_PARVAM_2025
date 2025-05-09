package com.SpringSecurityDemo.SpringSecurityDemo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.SpringSecurityDemo.SpringSecurityDemo.dto.StudentDTO;
import com.SpringSecurityDemo.SpringSecurityDemo.models.Student;
import com.SpringSecurityDemo.SpringSecurityDemo.repository.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo studentRepo;
	private PasswordEncoder passwordEncoder;
	private EmailService emailService;
	
	public StudentService(StudentRepo studentRepo, PasswordEncoder passwordEncoder, EmailService emailService) {
		super();
		this.studentRepo = studentRepo;
		this.passwordEncoder = passwordEncoder;
		this.emailService = emailService;
	}

	public void storeStudent (StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		student.setRole("ROLE_USER");
		studentRepo.save(student);
	}
}
