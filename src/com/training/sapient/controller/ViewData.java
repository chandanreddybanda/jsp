package com.training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewData {
	@RequestMapping(value = "dataView.html", method = RequestMethod.GET)
	public ModelAndView validateAndSave(HttpServletRequest request, HttpServletResponse response) {

		String roll = request.getParameter("rollNumber");
		DataHolding dt = new DataHolding();
 		if (dt.searchForStudent(roll)!=null) {
			String msg = "Exists" + dt.searchForStudent(roll).getFname();
			return new ModelAndView("viewData", "message", msg);
		}

		return new ModelAndView("viewData", "message", "not found");
	}

	@RequestMapping("/view-student.html")
	public ModelAndView helloWorld_1() {
		return new ModelAndView("viewData");
	}
}
