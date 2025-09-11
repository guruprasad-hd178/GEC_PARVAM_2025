package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "department_id")
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employees;

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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
