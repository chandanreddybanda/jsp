package com.training.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/")
	public String indexFile() {
		return "index";
	}

	@RequestMapping("/student-app")
	public String indexFileWithStudent() {
		return "index";
	}

}
