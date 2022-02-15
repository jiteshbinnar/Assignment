package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{
	
	private static final long serialVersionId=6900026827149637010L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String street, city, pin;
	public long getAddressId() {
		return addressId;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public static long getSerialversionid() {
		return serialVersionId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressId, city, pin, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addressId == other.addressId && Objects.equals(city, other.city) && Objects.equals(pin, other.pin)
				&& Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

}
