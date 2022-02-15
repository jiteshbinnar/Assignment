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

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@GetMapping("/get")
	public List<Customer> getallCustomer()
	{
		return customerService.getallCustomer();
	}
	@DeleteMapping("/delete")
    public String deleteCustomer(@RequestBody Customer customer)
    {
    	customerService.deleteCustomer(customer);
    	return "Customer details deleted...!"+customer;
    }
    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer)
    {
    	return customerService.updateCustomer(customer);
    }
	
}
