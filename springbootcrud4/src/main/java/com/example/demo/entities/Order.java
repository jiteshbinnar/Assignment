package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String shipmentAddress;
private int price;
@OneToOne(cascade = CascadeType.ALL)
private OrderItem item;

@ManyToOne(cascade = CascadeType.ALL)
private Customer customer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getShipmentAddress() {
	return shipmentAddress;
}
public void setShipmentAddress(String shipmentAddress) {
	this.shipmentAddress = shipmentAddress;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Order [id=" + id + ", shipmentAddress=" + shipmentAddress + ", price=" + price + "]";
}


}
