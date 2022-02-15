package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entities.Employee;

@Service
public class EmployeeService {
@Autowired
	private EmployeeRepository employeeRepository;


public Employee saveEmployee(Employee employee) 
{
	return employeeRepository.save(employee);
}

public List<Employee> getAllEmployee()
{
	return employeeRepository.findAll();
}

public String deleteEmployee(Employee employee) {
	employeeRepository.delete(employee);
	return "deleted Successfully"+employee;
}

public Employee udateEmployee(Employee employee) {
	Employee existingEmployee=employeeRepository.findById(employee.getEid()).orElse(null);
	return employeeRepository.save(existingEmployee);
}

}
