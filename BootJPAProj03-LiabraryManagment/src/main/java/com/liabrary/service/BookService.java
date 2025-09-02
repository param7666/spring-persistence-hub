package com.liabrary.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liabrary.model.Book;
import com.liabrary.repository.IBookRepo;
@Service
public class BookService implements IBookService{

	@Autowired
	private IBookRepo repo;
	
	
	@Override
	public void addBook(Book book) {
		repo.save(book);
		
	}

	@Override
	public Iterable<Book> getAllBooks() {
		Iterable<Book> list=repo.findAll();
		return list;
	}

	@Override
	public Optional<Book> findBookById(int id) {
		Optional<Book> bookById=repo.findById(id);
		return bookById;
	}

	@Override
	public void deleteBookById(int id) {
		repo.deleteById(id);
		
	}

}
