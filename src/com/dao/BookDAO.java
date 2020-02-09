package com.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kpapp.entities.Notebook;

public interface BookDAO {
	
	public List<Notebook> getAllData();
}
