package com.springbootmvc2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootmvc2.dto.StudentDTO;
import com.springbootmvc2.dto.UserDTO;
import com.springbootmvc2.model.Student;
import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.StudentRepository;
import com.springbootmvc2.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
    public String home(Model model) {
        List<Student> all = repository.findAll();
        model.addAttribute("students", all);
        return "students";
    }
	
	@GetMapping("/add-student")
    public String addUser(Model model) {
        StudentDTO dto = new StudentDTO();
        model.addAttribute("studentDTO", dto);
        return "add_student";
    }

    @PostMapping("/add-student")
	public String addUser(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "add_student";
		}
		service.storeStudent(studentDTO);
		return "redirect:/";
	}

    // --- EDIT FUNCTIONALITY ---

    @GetMapping("/edit-student/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        Optional<Student> userOptional = repository.findById(id);
        if (userOptional.isPresent()) {
        	Student student = userOptional.get();
            StudentDTO dto = new StudentDTO();
            dto.setId(student.getId()); // ensure id is set
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            model.addAttribute("studentDTO", dto);
            return "edit_student";
        } else {
            return "redirect:/students"; // or an error page
        }
    }


    @PostMapping("/edit-student")
    public String updateUser(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result) {
    	if (result.hasErrors())
    	{
    		return "edit_student";
    	}
        service.updateStudent(studentDTO);
        return "redirect:/students";
    }


    // --- DELETE FUNCTIONALITY ---

    @GetMapping("/delete-student/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/students";
    }
}
