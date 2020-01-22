package com.app.controller;


import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Department;
import com.app.entity.Faculty;
import com.app.entity.Files;
import com.app.entity.Result;
import com.app.entity.Student;
import com.app.entity.Subjects;
import com.app.services.FacultyService;
import com.app.services.FilesService;
import com.app.services.ResultService;
import com.app.services.StudentService;
import com.app.services.SubjectsService;

@Controller
@RequestMapping("/faculty")
public class FacultyController 
{
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	SubjectsService subjectsService;
	
	@Autowired
	ResultService resultService;
	
	@Autowired
	FilesService fileService;
	
	@RequestMapping("/loginform")
	public String getLoginForm() {
		return "facultyLogin";	
	}
	

	@RequestMapping("/login")
	public String validateFaculty(@ModelAttribute Faculty f,HttpSession session,Model model)
	{
		Faculty faculty=facultyService.validateFaculty(f);
		String message="Incorrect Email ID or Password!!!Try again";
		
		if(faculty==null)
		{
			model.addAttribute("message", message);
			return "facultyLogin";
		}
		
		session.setAttribute("faculty", faculty);
		return "facultyLoginSuccess";
	}
	
	@RequestMapping("/studentsMarksUploadForm")
	public String studentsMarksUploadForm() {
		return "studentsMarksUploadForm";	
	}
	
	@RequestMapping("/checkStudent")
	public String checkStudent(@ModelAttribute Student student,HttpSession session,Model model,@RequestParam("semId") int semId)
	{
		System.out.println("student before search"+student);
		student=studentService.searchStudent(student);
		System.out.println("student after search"+student);
		String message;
		if(student==null)
		{
			message="You have entered incorrect student Id!!";
			model.addAttribute("message", message);
			return "studentsMarksUploadForm";
		}
		int sdepartmentId=student.getDepartment().getDeptId();
		Faculty	faculty=(Faculty) session.getAttribute("faculty");
		System.out.println("faculty which is in session"+faculty);
		int fdepartmentId=faculty.getDepartment().getDeptId();
		if(sdepartmentId!=fdepartmentId)
		{
			int studentid=student.getStudentId();
			message="student with student id:"+studentid+" does not belong to your department!!";
			model.addAttribute("message", message);
			return "studentsMarksUploadForm";
		}
		session.setAttribute("student", student);
		System.out.println("student kept in session"+student);
		session.setAttribute("semId", semId);
		System.out.println("SemID kept in session"+semId);
		List<Subjects> list = subjectsService.getSubject(fdepartmentId,semId );
		session.setAttribute("subjects", list);
		System.out.println("semid:"+semId);
		System.out.println(list);
		return "studentsMarksUploadForm1";
	}
	
	@RequestMapping("/uploadMarks")
	public String uploadMarks(@ModelAttribute Result result,HttpSession session,@RequestParam("subId") int subId,Model model)
	{
		int marks=result.getMarks();
		System.out.println("inside upload");
		System.out.println("result inside uploadMarks method"+result);
		Student student=(Student) session.getAttribute("student");
		System.out.println("student after getting from session"+student);
		int sid=student.getStudentId();
		System.out.println("student id:"+sid);
		System.out.println("Subject id:"+subId);
		Student s=new Student();
		s.setStudentId(sid);
		result.setStudent(s);
		Subjects subject=new Subjects();
		subject.setSubId(subId);
		result.setSubject(subject);
		System.out.println("result after setting subject id and student id:"+result);
		String messageSuccess="Marks Added Successfully!!";
		String messageFailure="Marks does not added succesfully!! Try Again";
		String messageUpdate="Marks Updated Successfully!!";
		Result result3 = resultService.searchResult(result);
		System.out.println("inside searchReasult");
		System.out.println("result after searching from :"+result3);
		if(result3==null)
		{
		Serializable result1 = resultService.addResult(result);
		int res=(int) result1;
		if(res==0)
		{
			model.addAttribute("message", messageFailure);
			return "studentsMarksUploadForm";
		}
		model.addAttribute("message", messageSuccess);
		return "studentsMarksUploadForm1";
		}
		else
		{
			System.out.println("inside else block");
			result3.setMarks(marks);
			resultService.updateResult(result3);
			model.addAttribute("message", messageUpdate);
			return "studentsMarksUploadForm1";
		}
		
	} 
	
	@RequestMapping("/facultyLoginSuccess")
	public String facultyLoginSuccess()
	{
		return "facultyLoginSuccess";
	}
	
	@RequestMapping("/ebookUploadForm")
	public String ebookUploadForm()
	{
		return "ebookUploadForm";
	}
	
	String saveDirectory="/home/rohit/rohit/Project/main/CollegeManagementSystem/WebContent/resources/files/";
	
	@RequestMapping("/uploadFile")
	public String uploadFile(@RequestParam CommonsMultipartFile fileUpload,HttpSession session,Model model) throws Exception
	{
		if (fileUpload != null) {
                System.out.println("Saving file: " + fileUpload.getOriginalFilename());
                if (!fileUpload.getOriginalFilename().equals("")) 
                {
                		String path = "/resources/files/"+ fileUpload.getOriginalFilename();
	                	System.out.println("Path of Image File is :"+path);
	                	
                    ///aFile.transferTo(new File(saveDirectory + aFile.getOriginalFilename()));
	                fileUpload.transferTo(new File(saveDirectory + fileUpload.getOriginalFilename()));
                    System.out.println("File Saved Successfully ! Now going to insert Path in DB !");
                      Files file=new Files();
                     Faculty faculty=(Faculty) session.getAttribute("faculty");
                     int deptId=faculty.getDepartment().getDeptId();
                      Department department=new Department();
                      department.setDeptId(deptId);
                      file.setDepartment(department);
                      file.setFileName(fileUpload.getOriginalFilename());
                      file.setFilePath(path);
                     Serializable result = fileService.uploadFile(file);
                     int res=(int) result;
             		String message="File Uploaded Successfully";
            		if(res==0)
            		{
            			message="file does not uploaded successfully";
            			model.addAttribute("message", message);
            			return "facultyLoginSuccess";
            		}
            		model.addAttribute("message", message);
            		return "facultyLoginSuccess";
                }
                
                
                Queue<Integer> q = new LinkedList<Integer>();
                
                
            }
		return "";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return "redirect:/index.jsp";
	}
}
