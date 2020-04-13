package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model model) {
	//create a student object
	Student st=new Student();
	
	//add student object in the model
	model.addAttribute("student",st);
	//
	return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processFrom( @ModelAttribute("student") Student stu,BindingResult theBindingResult,Model model) {
		
		String fname=stu.getFirstname();
		String lname=stu.getLastname();
		
		return "student-confirmation";
	}
}
