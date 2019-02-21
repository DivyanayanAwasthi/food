package com.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.food.models.Student;
import com.service.StudentService;


@Controller
public class SignUpController {
	
	private static final Logger logger = Logger.getLogger(SignUpController.class);	
	
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value="/")
	public ModelAndView sayHello1(ModelMap model) {
		
		logger.info("hello");
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return new ModelAndView("index", "command", new Student());
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student student,

			ModelMap model)  {
		try {
		model.addAttribute("name", student.getName());
		student=studentService.saveOrUpdate(student);
		return new ModelAndView("hello", "command", student);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return new ModelAndView("error", "command", student);
		}
	}

}
