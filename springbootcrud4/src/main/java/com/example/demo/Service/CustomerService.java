package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveAllCustomer(Customer customer)
	{
		return customerRepository.save(customer);
		
	}
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public String deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
		return "Deleted Successfully"+customer;
		
	}
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
