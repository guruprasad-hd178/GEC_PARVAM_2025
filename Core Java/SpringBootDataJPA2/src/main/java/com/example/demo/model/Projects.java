package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "projects")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "projects_id")
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
