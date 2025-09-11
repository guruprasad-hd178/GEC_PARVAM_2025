package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToMany
	@JoinTable(
	            name = "employee_projects",
	            joinColumns = @JoinColumn(name = "employee_id"),
	            inverseJoinColumns = @JoinColumn(name = "project_id")
	)
	private Set<Projects> projects = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}
	
	
}
