package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private int quantity;
private Long price;



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Long getPrice() {
	return price;
}

public void setPrice(Long price) {
	this.price = price;
}



public Order() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Order [id=" + id + ", quantity=" + quantity + ", price=" + price + ", orderItem=" +"]";
}

	
}
