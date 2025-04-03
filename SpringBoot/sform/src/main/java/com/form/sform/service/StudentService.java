package com.form.sform.service;

import org.springframework.stereotype.Service;

import com.form.sform.dto.StudentDTO;
import com.form.sform.models.Students;
import com.form.sform.repository.StudentRepository;



@Service

public class StudentService {
	
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public void saveStudent(StudentDTO studentDTO) {
		Students students = new Students();
		students.setName(studentDTO.getName());
		students.setAge(studentDTO.getAge());
		students.setEmail(studentDTO.getEmail());
		students.setPassword(studentDTO.getPassword());
		studentRepository.save(students);
	}

	

}
