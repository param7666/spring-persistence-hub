package com.liabrary.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.liabrary.model.Book;
import com.liabrary.service.IBookService;
@Controller
public class BookController {
	
	@Autowired
	private IBookService ser;
	
	public void addBooks(Book b) {
		ser.addBook(b);
	}
	
	public Iterable<Book> retriveAllBook() {
		Iterable<Book> listOfBook=ser.getAllBooks();
		return listOfBook;
	}
	
	public Optional<Book> getBookById(int id) {
		Optional<Book> bk=ser.findBookById(id);
		return bk;
	}
	public void deleteBookById(int id) {
		ser.deleteBookById(id);
	}
}
