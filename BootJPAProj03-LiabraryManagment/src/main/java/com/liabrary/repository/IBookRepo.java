package com.liabrary.repository;

import org.springframework.data.repository.CrudRepository;

import com.liabrary.model.Book;

public interface IBookRepo extends CrudRepository<Book, Integer>{

}
