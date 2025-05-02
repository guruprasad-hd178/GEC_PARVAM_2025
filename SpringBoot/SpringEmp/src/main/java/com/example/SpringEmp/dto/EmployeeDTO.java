package com.example.SpringEmp.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmployeeDTO {

	@NotBlank(message = "Employee first name is required")
	private String fName;
	@NotBlank(message = "Employee last name is required")
	private String lName;
	@NotBlank(message = "Employee email is required")
	@Email
	private String email;
	@NotBlank(message = "Employee phone is required")
	private String phone;
	@NotBlank(message = "Employee address is required")
	private String address;
	
	private MultipartFile image;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}

	
	
	
	
}
