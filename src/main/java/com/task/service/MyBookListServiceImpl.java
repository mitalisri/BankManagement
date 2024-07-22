package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.MyBookList;
import com.task.repository.MyBookRepository;

@Service
public class MyBookListServiceImpl implements MyBookListService  {

	
	@Autowired
	private MyBookRepository mybook;
	
	
	@Override
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
		
	}

	@Override
	public List<MyBookList> getAllMyBooks() {
		return mybook.findAll();
	}

	@Override
	public void deleteById(int id) {
		mybook.deleteById(id);
	}

}
