package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.food.models.Student;

@Controller
public class SignUpController {


	@RequestMapping(value="/")
	public ModelAndView sayHello1(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return new ModelAndView("index", "command", new Student());
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("SpringWeb") Student student,

			ModelMap model) {
		model.addAttribute("name", student.getName());

		return new ModelAndView("hello", "command", student);
	}

}
