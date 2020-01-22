package com.app.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Result;
import com.app.entity.Student;
import com.app.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/loginform")
	public String getLoginForm() {
		return "studentLogin";	
	}
	
	@RequestMapping("/login")
	public String validateStudent(@ModelAttribute Student s,HttpSession session,Model model)
	{
		Student student=studentService.validateStudent(s);
		String message="Incorrect Email ID or Password!!! Try Again";
		
		if(student==null)
		{
			model.addAttribute("message", message);
			return "studentLogin";
		}
		
		session.setAttribute("student", student);
		return "studentLoginSuccess";
	}
	
	@RequestMapping("/showResultsForm")
	public String showResultsForm()
	{
		return "showResultsForm";
	}
	
	@RequestMapping("/showResult")
	public String showResult(@RequestParam("semId") int semId,Model model,HttpSession session)
	{
		Student student = (Student) session.getAttribute("student");
		List<Result> result = studentService.getResult(student.getStudentId(), semId);
		int size=result.size();
		if(size==0)
		{
			String message="You have not appered for semester"+semId;
			model.addAttribute("message", message);
			return "showResultsForm";
		}
		model.addAttribute("results", result);
		return "showResult";
	}
	
	@RequestMapping("/studentLoginSuccess")
	public String studentLoginSuccess()
	{
		return "studentLoginSuccess";
	}
}
