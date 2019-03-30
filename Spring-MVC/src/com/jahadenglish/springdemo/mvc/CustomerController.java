package com.jahadenglish.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder...to convert or trim input strings/
	//remove leading and trailing whitespace
	//resolve issue for out validation
	//will be called for every string web input that comes into controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//trims whitespace before and after input if all whitespace trims down to null
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//gives new object to the model for data binding with getters and setters
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	//@Valid references the validation annotations in the customer class
	//@modelAttribute binds out customer object in the model to this customer object here
	//Binding result is the results of out validation MUST COME AFTER THE MODEL ATTRIBUTE NOT BEFORE
	@RequestMapping("/processForm")
	public String processForm( @Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		
		//check binding result if it has errors go back to beginning else confirmation page
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}
	
}