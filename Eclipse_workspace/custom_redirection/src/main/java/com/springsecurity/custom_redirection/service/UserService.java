package com.springsecurity.custom_redirection.service;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.springsecurity.custom_redirection.dto.UserDTO;
import com.springsecurity.custom_redirection.model.User;
import com.springsecurity.custom_redirection.repository.UserRepository;

public class UserService {
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	

	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void saveUser(UserDTO userDTO) {
		User user = new User();
		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		userRepository.save(user);
	}
}
