package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int bId;
private String bNAme;
private Long bPrice;

@OneToOne(cascade = CascadeType.ALL)
private Author author;

public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getbNAme() {
	return bNAme;
}
public void setbNAme(String bNAme) {
	this.bNAme = bNAme;
}
public Long getbPrice() {
	return bPrice;
}
public void setbPrice(Long bPrice) {
	this.bPrice = bPrice;
}

public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}



@Override
public int hashCode() {
	return Objects.hash(author, bId, bNAme, bPrice);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(author, other.author) && bId == other.bId && Objects.equals(bNAme, other.bNAme)
			&& Objects.equals(bPrice, other.bPrice);
}
@Override
public String toString() {
	return "Book [bId=" + bId + ", bNAme=" + bNAme + ", bPrice=" + bPrice + ", author=" + author + "]";
}

}
