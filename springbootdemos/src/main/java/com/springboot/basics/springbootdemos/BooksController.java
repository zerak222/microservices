package com.springboot.basics.springbootdemos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(new Book(1, "A", "AAA"));
		listOfBooks.add(new Book(2, "B", "BBB"));
		listOfBooks.add(new Book(3, "C", "CCC"));
		return listOfBooks;
	}
}
