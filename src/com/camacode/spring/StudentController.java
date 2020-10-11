package com.camacode.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	public String showStudentForm(Model model) {
		
		//create a student object 
		Student theStudent = new Student(); 
		//add student object to the model 
		model.addAttribute("student",theStudent);//name,value
		
		return "studentForm";
	}
	
	
}
