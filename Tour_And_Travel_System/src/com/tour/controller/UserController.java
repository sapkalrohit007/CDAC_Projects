package com.tour.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tour.entities.Category;
import com.tour.entities.User;
import com.tour.services.CategoryServices;
import com.tour.services.UserServices;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userservices;
	
	
	@RequestMapping("/log")
	public String logincheck() {
		
		return "login";
		
	}
	@RequestMapping("/MyPage")
	public String Userpage() {
		
		return "MyPage";
		
	}
	@RequestMapping("/login")
	public String logincheck(@ModelAttribute User login ,Model model, HttpSession session) {
		String type ="admin";
		String msg="User Name or Password is incorrect. please try again ";
		
		if(login!=null){
			
				User user = userservices.validate(login);
				
				System.out.println("inside cont");
		  if (user==null) {
			  System.out.println("inside null");
			  model.addAttribute("msg", msg);
			   return "login";	   
		  }
		  else if (user!=null && user.getPassword().equals(login.getPassword())) {
			 if (type.equals(user.getUsertype()))
			 {
				 session.setAttribute("user",user);	
			  return "adminindex";
			 }
			 else
			 {
				 session.setAttribute("user",user);
				 return "Webindex";
			 }
		  }
		}
		model.addAttribute("msg", msg);
		return "login";
		
	}
	@RequestMapping("/logout")
	public String logincheck(HttpSession session) {
		session.setAttribute("user",null);
		return "Webindex";
		
	}
	@RequestMapping("signup")
	public String signupcheck(@ModelAttribute User signup ,BindingResult res, HttpSession session) {
		   
	  List<User> dbusers = userservices.fetchuser();
	  for (User user : dbusers) {
		  if(signup.getEmail().equalsIgnoreCase(user.getEmail()))
		  {
			  return "signup";
			  
		  }  
		  else
		  {
			  signup.setUsertype("user");
			   signup.toString();
			boolean success = userservices.usersignup(signup);
			return "login";
		  }
		
	    }
	return "error";
		
    }
	@RequestMapping("/sign")
	public String signup() {
		
		return "signup";
		
	}
	
	@RequestMapping("newusern")
	public String newuser(HttpSession session) {
		
		  
			return "adduser";
	}
	@RequestMapping("newuser")
	public String newuseradd(@ModelAttribute User newuser ,BindingResult res, HttpSession session) {
		
		  
		boolean success = userservices.usersignup(newuser);
		 if (success) {
			 
			return "adduser";
			
		}
		 
		else
			return "error";
	}
	@RequestMapping("updateu")
	public String fetchuser(Model model , HttpSession session) {
		
		  
	   List <User> users = userservices.fetchuser();
	   System.out.println(users);
	   model.addAttribute("users",users);
	return "updateedituser";
		
	}
	
	@RequestMapping("delete")
	public String deleteuser(@RequestParam("action") int id ,Model model, HttpSession session) {
		
		  
		int success = userservices.userdelete(id);
		 if (success!=0) {
			  List <User> users = userservices.fetchuser();
			   model.addAttribute("users",users);
			return "updateedituser";
			
		} 
		else
		return "error";
	}
	@RequestMapping("update")
	public String updateuser(@RequestParam("action") int id ,Model model, HttpSession session) {
		
		  
		 User users = userservices.getuser(id);
		 if (users!=null) {
			
			   model.addAttribute("user",users);
			return "edituserinfo";
			
		} 
		else
		return "error";
	}
	@RequestMapping("updateuser")
	public String updatesaveuser(@ModelAttribute User updateuser ,Model model, HttpSession session) {
		
		  
		System.out.println(updateuser);
		int success = (int) userservices.updateuser(updateuser);
		 if (success!=0) {
			
			 List <User> users = userservices.fetchuser();
			   model.addAttribute("users",users);
			return "updateedituser";
			
		} 
		else
		return "error";
	}
}
