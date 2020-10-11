package com.camacode.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@RequestMapping("showForm")
	public String showStudentForm(Model model) {
		
		//create a student object 
		Student theStudent = new Student(); 
		//add student object to the model 
		model.addAttribute("student",theStudent);//name,value
		
		
		return "studentForm";
	}
	@RequestMapping("processForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		//log the input data 
		System.out.println("the Student: "+theStudent.getFirstName()+" "+ theStudent.getLastName());
		return "studentConfirmation";
	}
	

}
