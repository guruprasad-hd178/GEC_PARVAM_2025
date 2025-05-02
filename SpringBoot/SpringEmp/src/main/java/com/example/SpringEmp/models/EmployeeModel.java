package com.example.SpringEmp.models;




import jakarta.persistence.*;


@Entity
@Table(name="employee")

public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fName;
	private String lName;
	private String email;
	private String phone;
	private String address;
	
	private String imagePath;

	public EmployeeModel() {
		super();
	}
	public EmployeeModel(Long id, String fName, String lName, String email, String phone, String address,
			String imagePath) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.imagePath = imagePath;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagepath) {
		this.imagePath = imagepath;
	}

	
}
