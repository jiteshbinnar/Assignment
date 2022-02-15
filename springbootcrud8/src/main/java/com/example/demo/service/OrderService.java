package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
	
	public List<Order> getallOrder()
	{
		return orderRepository.findAll();
	}
	
    public String deleteOrder(Order order)
    {
    	orderRepository.delete(order);
    	return "Customer order deleted...!"+order;
    }
    
    public Order updateOrder(Order order)
    {
    	return orderRepository.save(order);
    }
	
}
