package com.springboot_ims_app.contoller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {

	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/log")
	public String logAdmin(@RequestParam String username,@RequestParam String password,Model m)
	{
		if(username.equals("ADMIN") && password.equals("ADMIN"))
		return "success";
		else
		{
			m.addAttribute("message", "Invalid Credentials...!!!");
			return "login";
		}
	}
	
}
