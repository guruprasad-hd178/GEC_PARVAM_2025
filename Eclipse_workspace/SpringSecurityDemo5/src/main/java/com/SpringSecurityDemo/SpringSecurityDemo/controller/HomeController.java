package com.SpringSecurityDemo.SpringSecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SpringSecurityDemo.SpringSecurityDemo.dto.StudentDTO;
import com.SpringSecurityDemo.SpringSecurityDemo.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HomeController {
	
	private StudentService studentService;
	
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("studentDTO",studentDTO);
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute StudentDTO studentDTO, RedirectAttributes redirectAttributes) {
		studentService.storeStudent(studentDTO);
		redirectAttributes.addFlashAttribute("success","student saved successfully");
		return "redirect:/";
	}
	
	@GetMapping("/std-details")
	public String std() {
		return "std-details";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}


