package com.springbootmvc2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {
    private Long id; // Add this field
    @NotBlank(message = "name is reqiured")
	private String name;
    @NotBlank(message = "email is reqiured")
    @Email
	private String email;
    @NotBlank(message = "password is reqiured")
	private String password;
	
	public UserDTO(Long id, String name, String email, String password) {
		super();
		this.setId(id);
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public UserDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
