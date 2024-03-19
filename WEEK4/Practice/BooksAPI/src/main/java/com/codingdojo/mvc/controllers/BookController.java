package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookservice;
	@RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookservice.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
	
	@RequestMapping("/books/{bookId}")
	public String show(Model model,@PathVariable("bookId") long bookId) {
		Book book = bookservice.findBook(bookId);
		model.addAttribute("book", book);
		//System.out.println(bookId);
		//System.out.println(book);
		return "/books/show.jsp";
	}
}
