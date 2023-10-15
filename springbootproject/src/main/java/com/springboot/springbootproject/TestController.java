package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody 
//to return text on webpage without any view name
@Controller
public class TestController {

	@RequestMapping(path="/test")
	public String firstHandler() {
		
		return "Hi springboot.";
		
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("This is home page.");
		return "home";
		
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact page.");
		return "contact";
		
	}
}
