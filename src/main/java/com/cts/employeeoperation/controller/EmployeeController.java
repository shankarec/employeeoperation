package com.cts.employeeoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employeeoperation.model.Employee;
import com.cts.employeeoperation.service.EmployeeService;

@RestController
@RequestMapping("employee-API")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getValidPatient() {
		return employeeService.getEmployeeList();
	}

	@PostMapping("/employee-add")
	public String savePatient(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "Employee object Saved";
	}

	@PostMapping("/employee-update")
	public String sender(@RequestParam("employeeId") long employeeId, 
			@RequestParam("salary") long salary) {
		employeeService.update(employeeId, salary);
		return "Employee object Updated";
	}

}
