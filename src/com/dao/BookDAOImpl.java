package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDAO;
import com.kpapp.entities.Notebook;

//this annotation is used for component scan its will help for subclass and automatically scan compononent,it will help jdbc related exception
@Repository
@Component("test")
public class BookDAOImpl implements BookDAO {
	
	//dependecy injection session factory
	@Autowired
	private SessionFactory sessionFactory;

	 
	public List<Notebook> getAllData() {
		//get current hibernate session
		Session  session = sessionFactory.getCurrentSession();
		
		//create query
		
		Query<Notebook> thequery = session.createQuery("from Notebook", Notebook.class);
		//get list the list of qs ans
		
		List<Notebook> listData =	thequery.getResultList();
		
		return listData;
	}

}
