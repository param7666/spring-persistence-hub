package com.liabrary.service;

import java.util.Optional;

import com.liabrary.model.Book;

public interface IBookService {
	void addBook(Book book);
	Iterable<Book> getAllBooks();
	Optional<Book> findBookById(int id);
	void deleteBookById(int id);
}
