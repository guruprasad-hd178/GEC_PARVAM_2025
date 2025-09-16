package com.springbootmvc2.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springbootmvc2.model.User;


public class CustomUserDetail implements UserDetails{

	private User user;
	
	@Autowired
	public CustomUserDetail(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    String role = user.getRole();
	    if (role == null || role.isBlank()) {
	        role = "ROLE_USER"; // default role
	    }
	    return List.of(new SimpleGrantedAuthority(role));
	}


	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmail();
	}
	
}
