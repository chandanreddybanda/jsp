package com.training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddStudent {

	@RequestMapping(value = "dataValidate.html", method = RequestMethod.GET)
	public ModelAndView validateAndSave(HttpServletRequest request, HttpServletResponse response) {
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String roll = request.getParameter("rollNumber");
		String course = request.getParameter("course");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");

		if (!roll.isEmpty() && mobile.length() == 3 && !fName.isEmpty()) {
			String msg = "Data Saved";
			Student st = new Student(roll, fName, lName, course, mobile, city);
			DataHolding dt = new DataHolding();
			dt.addToMap(st);
			return new ModelAndView("studentData", "message", msg);
		}

		return new ModelAndView("studentData", "message", "Invalid Roll Number");
	}

	@RequestMapping("/add-student.html")
	public ModelAndView helloWorld() {
		return new ModelAndView("studentData");
	}

}
