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
}
