package com.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.BookDAO;
import com.kpapp.entities.Notebook;
import com.service.BookServiceBO;

@Controller
@RequestMapping("/bookpage")
public class BookController {
	
	@Autowired
	private BookServiceBO bookServiceBO;
	
	//@RequestMapping("list")
	@GetMapping("list") //when we use get mapping or postmapping it will consider get or post ,get request only run this method if it is getmapping
	public String loadBookPage(Model theModel)
	{
		List<Notebook> bookdata = bookServiceBO.getAllData();
		theModel.addAttribute("questin",bookdata);
		return "bookPage";
	}
	
	@GetMapping("showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		return "addNewData";
	}
	
	@GetMapping("showDashBoard")
	public String showDashBoard(Model theModel)
	{
		return "Dashboard";
	}

}
