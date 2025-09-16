package com.springbootmvc2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmvc2.dto.StudentDTO;
import com.springbootmvc2.model.Student;
import com.springbootmvc2.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public void storeStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
                
        repository.save(student);
    }

    public void updateStudent(StudentDTO studentDTO) {
        Optional<Student> optional = repository.findById(studentDTO.getId());
        if (optional.isPresent()) {
            Student student = optional.get();
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
                        
            repository.save(student);
        }
    }
}
