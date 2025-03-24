package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.EmployeeDTO;
import models.EmployeeModel;
import service.EmployeeService;


@Controller 
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping({"","/"})
	public String getAllEmployee(Model model)
	{
		List <EmployeeModel> employee = employeeService.getAllEmployee();
		model.addAttribute("employee", employee);
		return "employee";
	}
	
	@GetMapping("/add-student")
	public String addEmployee(Model model)
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		model.addAttribute("employeeDTO", employeeDTO);
		return "add_student";
	}
	
	@PostMapping("/add-student")
	public String saveEmployee(@ModelAttribute EmployeeDTO employeeDTO)
	{
		employeeService.saveEmployee(employeeDTO);
		return "redirect:/";
	}
	
	@GetMapping("/edit-student")
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
	public String updateStudent(@ModelAttribute EmployeeDTO employeeDTO, @RequestParam Long  id)
	{
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
