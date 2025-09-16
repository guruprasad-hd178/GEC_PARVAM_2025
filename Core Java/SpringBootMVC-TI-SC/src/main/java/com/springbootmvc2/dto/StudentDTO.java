package com.springbootmvc2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {
	
    private Long id; // Add this field
    @NotBlank(message = "name is reqiured")
	private String name;
    @NotBlank(message = "email is reqiured")
    @Email
	private String email;
	
	public StudentDTO(Long id, String name, String email) {
		super();
		this.setId(id);
		this.name = name;
		this.email = email;
	}
	
	public StudentDTO() {
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

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", email=" + email + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
