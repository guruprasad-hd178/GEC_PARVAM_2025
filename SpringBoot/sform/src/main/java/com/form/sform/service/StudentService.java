package com.form.sform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.form.sform.dto.StudentDTO;
import com.form.sform.models.Students;
import com.form.sform.repository.StudentRepository;

import jakarta.validation.Valid;



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
	

	public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

	public void deleteStudent(long id) {
		Students student = studentRepository.findById(id).get();
		studentRepository.delete(student);
	}

	public StudentDTO editStudent(long id) {
		Students student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		return studentDTO;
	}

	public void updateStudent(@Valid StudentDTO studentDTO, Long id) {
		Students student = studentRepository.findById(id).get();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}
