package com.jahadenglish.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	//method to show the form
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create new student object
		Student theStudent = new Student();
		
		//add as a model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	//method for processing the data once submit button is pressed
	
		//@ModelAttribute is used to bind or assign the student object already created in the model to a object here to use
		@RequestMapping("/processForm")
		public String processForm(@ModelAttribute("student") Student theStudent) {
			
			//log the input data
			System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
			System.out.println("Country: " + theStudent.getCountry());
			
			return "student-confirmation";
		}
	//add country into the method
}
