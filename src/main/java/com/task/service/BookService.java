package com.task.service;



import java.util.List;

import com.task.model.Book;

public interface BookService {
	public void save(Book b) ;
	public List<Book> getAllBook();
	public Book getBookById(int id);
	public void deleteById(int id);
}