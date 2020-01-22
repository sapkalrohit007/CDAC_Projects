package com.app.controller;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Admin;
import com.app.entity.Department;
import com.app.entity.Faculty;
import com.app.entity.News;
import com.app.entity.Student;
import com.app.entity.Subjects;
import com.app.services.AdminService;
import com.app.services.DepartmentService;
import com.app.services.FacultyService;
import com.app.services.NewsService;
import com.app.services.StudentService;
import com.app.services.SubjectsService;

@Controller
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	SubjectsService subjectsService;
	
	@Autowired
	NewsService newsService;
	
	@RequestMapping("/loginform")
	public String getLoginForm(Admin a) {
		return "adminLogin";	
		
	}
	@RequestMapping("/login1")	
	public String validateAdmin(@ModelAttribute Admin a,HttpSession session,Model model)
	{
		String message="Incorrect EmailId or Password";
		Admin admin=adminService.validateAdmin(a);
		if (admin==null)
		{
			
			model.addAttribute("message", message);
			return "adminLogin";
		}
		session.setAttribute("admin", admin);
		return "adminLoginSuccess";
	}
	@RequestMapping("/studentRegisterationForm")
	public String studentRegisterationForm(Model model)
	{
		List<Department>departments=departmentService.getAllDepartments();
		System.out.println(departments);
		model.addAttribute("departments", departments);
		return "studentRegisterationForm";
	}
	
	@RequestMapping("/facultyRegisterationForm")
	public String facultyRegisterationForm(Model model)
	{
		List<Department>departments=departmentService.getAllDepartments();
		System.out.println(departments);
		model.addAttribute("departments", departments);
		return "facultyRegisterationForm";
	}
	
	@RequestMapping("/departmentRegisterationForm")
	public String departmentRegisterationForm()
	{
		return "departmentRegisterationForm";
	}
	
	@RequestMapping("/subjectRegisterationForm")
	public String subjectRegisterationForm(Model model)
	{
		List<Department>departments=departmentService.getAllDepartments();
		model.addAttribute("departments", departments);
		return "subjectRegisterationForm";
	}
	
	@RequestMapping("/newsAdditionForm")
	public String newsAdditionForm()
	{
		return "newsAdditionForm";
	}
	
	@RequestMapping("/studentDeletionForm")
	public String studentDeletionForm()
	{
		return "studentDeletionForm";
	}
	
	@RequestMapping("/facultyDeletionForm")
	public String facultyDeletionForm()
	{
		return "facultyDeletionForm";
	}
	
	@RequestMapping("/departmentDeletionForm")
	public String departmentDeletionForm()
	{
		return "departmentDeletionForm";
	}
	
	@RequestMapping("/subjectDeletionForm")
	public String subjectDeletionForm()
	{
		return "subjectDeletionForm";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute Student student,BindingResult result,Model model,@RequestParam("deptId") int deptId,@RequestParam("birthdate") String birthdate)
	{
		System.out.println("birthdate"+birthdate);
		Department department=new Department();
		department.setDeptId(deptId);
		student.setDepartment(department);
		DateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date=formatter.parse(birthdate);
			System.out.println(date);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
				
		
		//student.setBirthdate(formatter.format(date));
		
		String messageSuccess="Student Added Successfully!!";
		String messageFailure="Student is not added succesfully!!";
		Serializable result1 = studentService.addStudent(student);
		
		int res=(int) result1;
		if(res==0)
		{
			model.addAttribute("message", messageFailure);
			return "adminLoginSuccess";
		}
		model.addAttribute("message", messageSuccess);
		return "adminLoginSuccess";
	}
	
	@RequestMapping("/addFaculty")
	public String addFaculty(@ModelAttribute("faculty") Faculty faculty,BindingResult result,Model model,@RequestParam("deptId")int deptId)
	{
		System.out.println("inside add faculty");
		Department department=new Department();
		department.setDeptId(deptId);
		faculty.setDepartment(department);
		String messageSuccess="Faculty Added Successfully!!";
		String messageFailure="Faculty is not added succesfully!!";
		Serializable result1 = facultyService.addFaculty(faculty);
		int res=(int) result1;
		if(res==0)
		{
			model.addAttribute("message", messageFailure);
			return "adminLoginSuccess";
		}
		model.addAttribute("message", messageSuccess);
		return "adminLoginSuccess";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartment(@ModelAttribute Department department,Model model)
	{
		String messageSuccess="Department Added Successfully!!";
		String messageFailure="Department is not added succesfully!!";
		Serializable result = departmentService.insertDepartment(department);
		int res=(int) result;
		if(res==0)
		{
			model.addAttribute("message", messageFailure);
			return "adminLoginSuccess";
		}
		model.addAttribute("message", messageSuccess);
		return "adminLoginSuccess";
	}
	
	@RequestMapping("/addSubject")
	public String addSubject(@ModelAttribute Subjects subject,BindingResult result,Model model,@RequestParam("deptId")int deptId)
	{
		/*System.out.println("inside add object");
		System.out.println(subject);*/
		Department department=new Department();
		department.setDeptId(deptId);
		subject.setDepartment(department);
		String messageSuccess="Subject Added Successfully!!";
		String messageFailure="Subject is not added succesfully!!";
		Serializable result1 = subjectsService.addSubject(subject);
		int res=(int) result1;
		if(res==0)
		{
			model.addAttribute("message", messageFailure);
			return "adminLoginSuccess";
		}
		model.addAttribute("message", messageSuccess);
		return "adminLoginSuccess";
	}
	
	@RequestMapping("/addNews")
	public String addNews(@ModelAttribute News news,Model model)
	{
		String message="News added successfully";
		Serializable result = newsService.addNews(news);
		int res=(int) result;
		
		if(res!=0)
		{
			model.addAttribute("message", message);
			return "adminLoginSuccess";
		}
		message="News does not added successfully";
		model.addAttribute("message", message);
		return "adminLoginSuccess";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@ModelAttribute Student student,Model model)
	{
		int id=student.getStudentId();
		String message="Student with student ID: "+id+" Deleted Successfully!!";
		
		student=studentService.searchStudent(student);
		if(student==null)
		{
			message="Student with student ID: "+id+" is not present";
			model.addAttribute("message", message);
			return "studentDeletionForm";
		}
		studentService.deleteStudent(student);
		model.addAttribute("message", message);
			return "studentDeletionForm";
	}
	
	@RequestMapping("/deleteFaculty")
	public String deleteFaculty(@ModelAttribute Faculty faculty,Model model)
	{
		int id=faculty.getFacultyId();
		String message="Faculty deleted Successfully!!";
		faculty=facultyService.searchFaculty(faculty);
		if(faculty==null)
		{
			message="Faculty with faculty ID:"+id+" is not present";
			model.addAttribute("message", message);
			return "facultyDeletionForm";
		}
		facultyService.deleteFaculty(faculty);
		model.addAttribute("message", message);
			return "facultyDeletionForm";
	}
	
	@RequestMapping("/deleteDepartment")
	public String deleteDepartment(@ModelAttribute Department department,Model model)
	{
		String messageSuccess="Department deleted Successfully!!";
		departmentService.deleteDepartment(department);
	    model.addAttribute("message", messageSuccess);
			return "adminLoginSuccess";
	}
	
	@RequestMapping("/deleteSubject")
	public String deleteSubject(@ModelAttribute Subjects subject,Model model)
	{
		int id=subject.getSubId();
		String message="Subject with subject ID: "+id+" Deleted Successfully!!";
		subject=subjectsService.searchSubject(subject);
		if(subject==null)
		{
			message="Subject with subject ID: "+id+" is not present";
			model.addAttribute("message", message);
			return "subjectDeletionForm";
		}
		subjectsService.deleteSubject(subject);
		model.addAttribute("message", message);
			return "subjectDeletionForm";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin()
	{
		return "adminLoginSuccess";
	}
	
	
}
