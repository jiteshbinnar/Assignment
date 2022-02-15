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

import com.example.demo.entities.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/save")
	public Book saveAllBook(@RequestBody Book book) {
		return bookService.saveAllBook(book);
	}

	@GetMapping("/get")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@DeleteMapping("/delete")
	public String deleteBook(@RequestBody Book book) {
		bookService.deleteBook(book);
		return "book deleted" + book;
	}

	@PutMapping("/update")
	public Book updateAllBook(@RequestBody Book book) {
		return bookService.updateAllBook(book);
	}
}
