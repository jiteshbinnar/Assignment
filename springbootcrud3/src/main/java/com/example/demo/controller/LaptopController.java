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

import com.example.demo.Repository.LaptopRepository;
import com.example.demo.entities.Laptop;
import com.example.demo.service.LaptopService;
@RestController
@RequestMapping("/lap")
public class LaptopController {

	@Autowired
	private LaptopService laptopService;
	
	@PostMapping("/save")
	public Laptop saveLaptop(@RequestBody Laptop laptop) 
	{
		return laptopService.saveLaptop(laptop);
	}

	@GetMapping("/get")
	public List<Laptop> getAllLaptop()
	{
		return laptopService.getAllLaptop();
	}
    @DeleteMapping("/delete")
	public String deleteLaptop(@RequestBody Laptop laptop) {
	laptopService.deleteLaptop(laptop);
		return "deleted Successfully"+laptop;
	}
    @PutMapping("/update")
	public Laptop updateLaptop(@RequestBody Laptop laptop){
	Laptop existingLaptop=laptopService.updateLaptop(laptop);
		return laptopService.saveLaptop(existingLaptop);
	}
}
