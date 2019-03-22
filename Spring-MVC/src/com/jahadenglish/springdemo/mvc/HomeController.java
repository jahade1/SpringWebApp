package com.jahadenglish.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	//attach request mapping handles all http request
	@RequestMapping("/")
	//define controller method
	public String showPage() {
		return "main-menu";
	}
}
