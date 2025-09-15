package com.springbootsecurity1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springbootsecurity1.model.User;
import com.springbootsecurity1.respository.UserRepository;

@Component
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("User name not found: "+username));
		return new CustomUserDetail(user);
	}

}
