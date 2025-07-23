package com.example.SpringEmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringEmp.models.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

	public EmployeeModel findByEmail(String email);

}