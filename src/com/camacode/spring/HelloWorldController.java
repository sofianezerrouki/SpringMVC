package com.camacode.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorldForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDout(HttpServletRequest request,Model model) {
		//read the request parameters
		String nameStudent = request.getParameter("studentName");
		//convert the data to upper case 
		nameStudent = nameStudent.toUpperCase();
		//create the message 
		String msg = "Hi ! "+nameStudent;
		//add the message to the Model 
		model.addAttribute("message",msg);
		
		
		//hello world is the Name of the jsp File 
		return "helloWorld";
	}
}
