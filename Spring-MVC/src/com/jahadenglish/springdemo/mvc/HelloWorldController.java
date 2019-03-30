package com.jahadenglish.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//need a controller method to read form data
	//and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String shoutName(HttpServletRequest request, Model model) {
		
		//read the request from the html form
		String theName = request.getParameter("studentName");
		
		//convert data to all uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
			
		//convert data to all uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey my Name is: " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}


