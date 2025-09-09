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
}
