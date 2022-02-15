package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int aId;
private String aName;
private String aAddress;

@OneToOne(mappedBy = "author")
private Book book;

public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
public String getaAddress() {
	return aAddress;
}
public void setaAddress(String aAddress) {
	this.aAddress = aAddress;
}


public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Author() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	return Objects.hash(aAddress, aId, aName, book);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Author other = (Author) obj;
	return Objects.equals(aAddress, other.aAddress) && aId == other.aId && Objects.equals(aName, other.aName)
			&& Objects.equals(book, other.book);
}
@Override
public String toString() {
	return "Author [aId=" + aId + ", aName=" + aName + ", aAddress=" + aAddress + ", book=" + book + "]";
}



	
}
