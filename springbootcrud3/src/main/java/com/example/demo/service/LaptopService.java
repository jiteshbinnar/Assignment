package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LaptopRepository;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Laptop;



@Service
public class LaptopService {
@Autowired
	private LaptopRepository laptopRepository;
	
	public Laptop saveLaptop(Laptop laptop) 
	{
		return laptopRepository.save(laptop);
	}

	public List<Laptop> getAllLaptop()
	{
		return laptopRepository.findAll();
	}

	public String deleteLaptop(Laptop laptop) {
		laptopRepository.delete(laptop);
		return "deleted Successfully"+laptop;
	}

	public Laptop updateLaptop(Laptop laptop){
	Laptop existingLaptop=laptopRepository.findById(laptop.getLid()).orElse(null);
		return laptopRepository.save(existingLaptop);
	}

}
