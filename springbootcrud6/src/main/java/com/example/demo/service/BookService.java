package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public Book saveAllBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	public String deleteBook(Book book) {
		bookRepository.delete(book);
		return "book deleted" + book;
	}

	public Book updateAllBook(Book book) {
		return bookRepository.save(book);
	}
}
