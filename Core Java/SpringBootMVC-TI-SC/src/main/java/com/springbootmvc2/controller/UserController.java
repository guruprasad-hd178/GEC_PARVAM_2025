package com.springbootmvc2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.springbootmvc2.dto.UserDTO;
import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.UserRepository;
import com.springbootmvc2.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @GetMapping({"", "/"})
    public String home(Model model) {
        List<User> all = repository.findAll();
        model.addAttribute("users", all);
        return "home";
    }

    @GetMapping("/login")
    public String login() 
    {
        return "login"; // This should be the name of your Thymeleaf template: login.html
    }
    
    @GetMapping("/add-user")
    public String addUser(Model model) {
        UserDTO dto = new UserDTO();
        model.addAttribute("userDTO", dto);
        return "add_user";
    }

    @PostMapping("/add-user")
	public String addUser(@Valid @ModelAttribute UserDTO userDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "add_user";
		}
		service.storeUser(userDTO);
		return "redirect:/";
	}

    // --- EDIT FUNCTIONALITY ---

    @GetMapping("/edit-user/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        Optional<User> userOptional = repository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            UserDTO dto = new UserDTO();
            dto.setId(user.getId()); // ensure id is set
            dto.setName(user.getName());
            dto.setEmail(user.getEmail());
            dto.setPassword(user.getPassword());
            model.addAttribute("userDTO", dto);
            return "edit_user";
        } else {
            return "redirect:/"; // or an error page
        }
    }


    @PostMapping("/edit-user")
    public String updateUser(@Valid @ModelAttribute UserDTO userDTO, BindingResult result) {
    	if (result.hasErrors())
    	{
    		return "edit_user";
    	}
        service.updateUser(userDTO);
        return "redirect:/";
    }


    // --- DELETE FUNCTIONALITY ---

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
    
    
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
