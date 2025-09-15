package com.springbootsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	@GetMapping("/contact")
	public String contaat() {
		return "contact";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
