package com.example.SpringEmp.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.SpringEmp.dto.EmployeeDTO;
import com.example.SpringEmp.models.EmployeeModel;
import com.example.SpringEmp.repository.EmployeeRepository;

import jakarta.validation.Valid;

@Service

public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<EmployeeModel> getAllEmployee()
	{
		List<EmployeeModel> employees =  employeeRepository.findAll();
		return employees;
	}

	public void saveEmployee (EmployeeDTO employeeDTO) {
		EmployeeModel employee = new EmployeeModel();
		employee.setfName(employeeDTO.getfName());
		employee.setlName(employeeDTO.getlName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employeeRepository.save(employee);
	}
	
	public EmployeeModel getEmployee(Long id) {
		EmployeeModel employee = employeeRepository.findById(id).get();
		return employee;
	}

	public void updateEmployee(@Valid EmployeeDTO employeeDTO, Long id) {
		EmployeeModel employee = employeeRepository.findById(id).get();
		
		
		employee.setfName(employeeDTO.getfName());
		employee.setlName(employeeDTO.getlName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id)
	{
		employeeRepository.deleteById(id);
	}
	
}



