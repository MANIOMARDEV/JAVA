package com.project.allbooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.allbooks.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
}