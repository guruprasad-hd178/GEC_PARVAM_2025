package com.springbootmvc2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootmvc2.dto.UserDTO;
import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Injecting PasswordEncoder

    public void storeUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setRole("ROLE_USER"); // Set a default role!
        // Encode the password before saving
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        
        repository.save(user);
    }

    public void updateUser(UserDTO userDTO) {
        Optional<User> optional = repository.findById(userDTO.getId());
        if (optional.isPresent()) {
            User user = optional.get();
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setRole("ROLE_USER"); // Set a default role!
            // Encode the password before updating
            user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
            
            repository.save(user);
        }
    }
}

