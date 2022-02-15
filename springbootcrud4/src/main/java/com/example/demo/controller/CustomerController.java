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

import com.example.demo.Service.CustomerService;
import com.example.demo.entities.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/")
	public Customer saveAllCustomer(@RequestBody Customer customer)
	{
		return customerService.saveAllCustomer(customer);
		
	}
	@GetMapping("/")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@DeleteMapping("/")
	public String deleteCustomer(@RequestBody Customer customer) {
		customerService.deleteCustomer(customer);
		return "Deleted Successfully"+customer;
		
	}
	@PutMapping("/")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

}
