package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String Cname;
private String cAddress;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="Customer_Id",referencedColumnName = "id")
private List<Order> order=new ArrayList<>();

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getcAddress() {
	return cAddress;
}
public void setcAddress(String cAddress) {
	this.cAddress = cAddress;
}

public List<Order> getOrder() {
	return order;
}
public void setOrder(List<Order> order) {
	this.order = order;
}

@Override
public int hashCode() {
	return Objects.hash(Cname, cAddress, id, order);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(Cname, other.Cname) && Objects.equals(cAddress, other.cAddress) && id == other.id
			&& Objects.equals(order, other.order);
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [id=" + id + ", Cname=" + Cname + ", cAddress=" + cAddress + ", order=" + order + "]";
}



}
