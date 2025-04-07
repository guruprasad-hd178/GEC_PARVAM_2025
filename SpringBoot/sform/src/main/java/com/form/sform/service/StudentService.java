package com.form.sform.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.form.sform.SformApplication;
import com.form.sform.dto.StudentDTO;
import com.form.sform.models.Students;
import com.form.sform.repository.StudentRepository;

import jakarta.validation.Valid;


@Service

public class StudentService {

    @SuppressWarnings("unused")
	private final SformApplication sformApplication;
	
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository, SformApplication sformApplication) {
		super();
		this.studentRepository = studentRepository;
		this.sformApplication = sformApplication;
	}

	public void saveStudent(StudentDTO studentDTO) {
		MultipartFile image = studentDTO.getImage();
		Date createdAt = new Date();
		String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
		System.out.println(storeImageName);
		
		try {
			String uploadDir = "public/images/";
			Path uploadPath = Paths.get(uploadDir);
			if (!Files.exists(uploadPath) ) {
				Files.createDirectories(uploadPath);
			}
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream,  Paths.get(uploadDir+storeImageName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		Students students = new Students();
		students.setName(studentDTO.getName());
		students.setAge(studentDTO.getAge());
		students.setEmail(studentDTO.getEmail());
		students.setPassword(studentDTO.getPassword());
		students.setImagePath(storeImageName);
		studentRepository.save(students);
	}
	

	public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

	public void deleteStudent(Long id) {
		Students student = studentRepository.findById(id).get();
		//what is the image path of the student
		String uploadDir = "public/images/";
		Path imagePath = Paths.get(uploadDir+student.getImagePath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			// TODO: handle exception
		}
		studentRepository.delete(student);
	}

	public StudentDTO editStudent(Long id) {
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
		if (!studentDTO.getImage().isEmpty()) {
			Path oldImagePath = Paths.get("public/images/"+student.getImagePath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			MultipartFile image = studentDTO.getImage();
			Date createdAt = new Date();
			String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
			String uploadDir = "public/images/";
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir+storeImageName), StandardCopyOption.REPLACE_EXISTING );
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			student.setImagePath(storeImageName);
		}
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}
