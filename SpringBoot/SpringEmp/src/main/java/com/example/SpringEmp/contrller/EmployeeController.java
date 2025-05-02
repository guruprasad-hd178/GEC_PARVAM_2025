package com.example.SpringEmp.contrller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.SpringEmp.dto.EmployeeDTO;
import com.example.SpringEmp.models.EmployeeModel;
import com.example.SpringEmp.repository.EmployeeRepository;
import com.example.SpringEmp.service.EmployeeService;

import jakarta.validation.Valid;






@Controller 
public class EmployeeController {
	
	private final EmployeeService employeeService;
	private final EmployeeRepository employeeRepository;
	
	public EmployeeController(EmployeeService employeeService, EmployeeRepository employeeRepository) {
		super();
		this.employeeService = employeeService;
		this.employeeRepository = employeeRepository;
	}


	@GetMapping({"","/"})
	public String getAllEmployee(Model model)
	{
		List <EmployeeModel> employee = employeeService.getAllEmployee();
		model.addAttribute("employee", employee);
		return "employees";
	}
	
	@GetMapping("/add-employee")
	public String addEmployee(Model model)
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		model.addAttribute("employeeDTO", employeeDTO);
		return "add-employee";
	}
	
	@PostMapping("/add-employee")
	public String saveEmployee(@Valid @ModelAttribute EmployeeDTO employeeDTO,BindingResult result,Model model, RedirectAttributes attributes )
	{
		EmployeeModel employee = employeeRepository.findByEmail(employeeDTO.getEmail());
		if (employee != null) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}
		if (employeeDTO.getImage().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "image", "Image is required"));

		}
		if (result.hasErrors()) {
			return "add-employee";
		}
		employeeService.saveEmployee(employeeDTO);
		return "redirect:/";
	}
	
	@GetMapping("/edit-employee")
	public String getEmployee (@RequestParam Long id, Model model)
	{
		EmployeeModel employee = employeeService.getEmployee(id);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setfName(employee.getfName());
		employeeDTO.setlName(employee.getlName());
		employeeDTO.setEmail(employee.getEmail());
		employeeDTO.setPhone(employee.getPhone());
		employeeDTO.setAddress(employee.getAddress());
		model.addAttribute("employeeDTO",employeeDTO); //form fields
		model.addAttribute("employee",employee);
		return "edit-employee";
	}
	
	@PostMapping("/edit-employee")
	public String updateStudent(@ModelAttribute EmployeeDTO employeeDTO, @RequestParam Long  id,BindingResult result,  Model model, RedirectAttributes attributes)
	{
		EmployeeModel employee =  employeeRepository.findByEmail(employeeDTO.getEmail());
		if (employee != null && employee.getId() != id) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}
		
		if (result.hasErrors()) {
			EmployeeModel student = employeeRepository.findById(id).get();
			model.addAttribute("student", student);
			return "edit-employee";
		}
		employeeService.updateEmployee(employeeDTO,id);
		return "redirect:/";
	}
	
	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam Long id)
	{
		employeeService.deleteEmployee(id);
		return "redirect:/";

	}
}
