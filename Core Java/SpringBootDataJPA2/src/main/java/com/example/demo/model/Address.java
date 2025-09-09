package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "address_id")
	private Long id;
	private String city;
	private String state;
	private String country;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
}
