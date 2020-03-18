package com.luv2code.springdemo.mvc;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Customer cust=new Customer();
		model.addAttribute("customer",cust);
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid
			 @ModelAttribute("customer") Customer cust,
			BindingResult theBindingResult,Model model) {
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}else {
		return "customer-confirmation";
	}
	}
		

}
