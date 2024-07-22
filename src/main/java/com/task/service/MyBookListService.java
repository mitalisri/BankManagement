package com.task.service;



import java.util.List;

import com.task.model.MyBookList;

public interface MyBookListService {
	
	public void saveMyBooks(MyBookList book);
	public List<MyBookList> getAllMyBooks();
	public void deleteById(int id);
}
