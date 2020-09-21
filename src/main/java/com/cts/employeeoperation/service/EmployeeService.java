package com.cts.employeeoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employeeoperation.config.EmployeeRepository;
import com.cts.employeeoperation.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public String update(long employeeId, long salary) {
		employeeRepository.updateSalary(employeeId, salary);
		return null;
	}

}
