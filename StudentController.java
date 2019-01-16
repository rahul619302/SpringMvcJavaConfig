package com.lti.spring.java.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.spring.java.config.pojo.Student;

@Controller
public class StudentController {

	@RequestMapping("/index")
	public String hello() {
		System.out.println("Hello From Controller");
		return "index";
	}

	@RequestMapping("/student")
	public String student(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("message", "Hello Student!");
		return "add_student";
	}

	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute Student student, Model model) {
		student.setName(student.getName().toUpperCase());
		Student student1 = new Student();
		student1.setRoll(2);
		student1.setName("Rohan Singh");
		model.addAttribute("student1", student1);
		return "add_student_success";
	}

}
