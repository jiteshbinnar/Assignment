package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getallCustomer()
	{
		return customerRepository.findAll();
	}
	
    public String deleteCustomer(Customer customer)
    {
    	customerRepository.delete(customer);
    	return "Customer details deleted...!"+customer;
    }
    
    public Customer updateCustomer(Customer customer)
    {
    	return customerRepository.save(customer);
    }
}
