package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need acontroller method to show thw initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
//	@RequestMapping("/processFrom")
//	public String processForm() {
//		return "helloworld";
//	}
//	
	// new controller method to read form data
	//add data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		//read the request parameter
		String thename=request.getParameter("student");
		//convert data to all caps
		thename=thename.toUpperCase();
		//create the message 
		//add message to model
		model.addAttribute("message",thename);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("student") String name,Model model) {
		String theName=name.toUpperCase();
		model.addAttribute("message",theName);
		return "helloworld";
	}
}
