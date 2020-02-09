package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginMaintAction {
	
	@RequestMapping("/login")
	public String loadLoginPage()
	{
		return "UserLogin";
	}
	
	
	

}
