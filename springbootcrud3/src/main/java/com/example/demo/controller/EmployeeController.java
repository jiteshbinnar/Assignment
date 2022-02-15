package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
@Autowired
	private EmployeeService employeeService;
	
@PostMapping("/save")
public Employee saveEmployee(@RequestBody Employee employee) 
{
	return employeeService.saveEmployee(employee);
}


@GetMapping("/get")
public List<Employee> getAllEmployee()
{
	return employeeService.getAllEmployee();
}

@DeleteMapping("/delete")
public String deleteEmployee(@RequestBody Employee employee) {
	employeeService.deleteEmployee(employee);
	return "deleted Successfully"+employee;
}

@PutMapping("/update")
public Employee udateEmployee(@RequestBody Employee employee) {
	Employee existingEmployee=employeeService.udateEmployee(employee);
	return employeeService.saveEmployee(existingEmployee);
}
}
