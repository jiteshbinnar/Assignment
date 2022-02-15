package com.example.demo.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	@GetMapping("/get")
	public List<Order> getallOrder()
	{
		return orderService.getallOrder();
	}
	@DeleteMapping("/delete")
    public String deleteOrder( @RequestBody Order order)
    {
    	orderService.deleteOrder(order);
    	return "Customer order deleted...!"+order;
    }
    
    @PutMapping("/update")
    public Order updateOrder(@RequestBody Order order)
    {
    	return orderService.updateOrder(order);
    }
	
	
}
