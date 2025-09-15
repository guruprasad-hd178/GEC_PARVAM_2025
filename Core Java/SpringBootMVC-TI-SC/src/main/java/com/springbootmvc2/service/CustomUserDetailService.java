package com.springbootmvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springbootmvc2.model.User;
import com.springbootmvc2.repository.UserRepository;
import com.springbootsecurity1.service.CustomUserDetail;

@Component
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user2 = repository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("User name not found: "+username));
		return new CustomUserDetail(user2);
	}
}
