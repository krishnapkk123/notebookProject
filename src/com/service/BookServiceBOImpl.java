package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDAO;
import com.kpapp.entities.Notebook;

@Service
public class BookServiceBOImpl implements BookServiceBO {
	
	@Autowired
	private BookDAO bookDAO;

	@Transactional //this automaticall handle begin and commit transaction
	public List<Notebook> getAllData() {
		
		List<Notebook> bookdata = bookDAO.getAllData();
		return bookdata;
	}

}
