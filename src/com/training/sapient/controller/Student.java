package com.training.sapient.controller;

public class Student {
	private String roll;
	private String fname;
	private String lname;
	private String course;
	private String mobile;
	private String city;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String roll, String fname, String lname, String course, String mobile, String city) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.course = course;
		this.mobile = mobile;
		this.city = city;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
