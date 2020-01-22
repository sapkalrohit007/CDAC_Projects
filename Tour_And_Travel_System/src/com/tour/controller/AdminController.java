package com.tour.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tour.entities.Category;
import com.tour.entities.PackageBooking;
import com.tour.entities.Packagem;
import com.tour.entities.State;
import com.tour.entities.User;
import com.tour.models.Bookingmodel;
import com.tour.models.EmailSend;
import com.tour.models.PackageModel;
import com.tour.services.BookingServices;
import com.tour.services.CategoryServices;
import com.tour.services.PackageServices;
import com.tour.services.StateServices;
import com.tour.services.UserServices;

@Controller
public class AdminController {

	@Autowired
	private CategoryServices categoryservices;
	@Autowired
	private StateServices stateservices;
	@Autowired
	private PackageServices packageservice;
	@Autowired
	private BookingServices bookingservice;
	@Autowired
	private UserServices userservices;
	@Autowired
	private EmailSend email1;
	
	@RequestMapping("/index")
	public String firstpageinit(HttpSession session) {
			
		List<Category> categorylist=categoryservices.fetchcategory();
		List<State> statelist=stateservices.fetchstate();
		 session.setAttribute("categorylist", categorylist);
		 session.setAttribute("statelist", statelist);
		return "home";
		
	}
	@RequestMapping("/admin" )
	public String adminhome(Model model,HttpSession session ){
		String bookingrequest="Pending";
		String payment="Comfirmed";
	    List<PackageBooking> bookingrequestlist=bookingservice.fetchbookingrequest(bookingrequest,payment);
	    List<String> name= new ArrayList<>();
	    List<Bookingmodel> bookinglist = new ArrayList<>();
	    
	    for (PackageBooking packageBooking : bookingrequestlist) {
	    	
	    	 Bookingmodel bm =new Bookingmodel();
	    	String str=packageBooking.getNameofpassenger();
	    	 bm.setNameofpassengers(str);
	    	 User user= userservices.getuser(packageBooking.getUserid());
		    	String email =user.getEmail();
	           /*String[] keywords=str.split(",");
	          
		      
		       for (int i = 0; i < keywords.length; i++) {
		    	   
		  		   String s= keywords[i];
		    	   name.add(keywords[i]);
		    	   bm.setNameofpassengers(s);
		    	   
			   }
		      */
		       System.out.println("inlist");
		       System.out.println(name);
		      
		      
		       bm.setBookingid(packageBooking.getBookingid());
		       
		       bm.setDeparturedate(packageBooking.getDeparturedate());
		       bm.setEmail(email);
		       bm.setNumberofpassenger(packageBooking.getNumberofpassenger());
		       bm.setMobile(user.getMobile());
		       bm.setTotalpayableprice(packageBooking.getTotalpayableprice());
		       bm.setPackageid(packageBooking.getPackageid());
		       bm.setPaymentstatus(packageBooking.getPaymentstatus());
		       bm.setBookingstatus(packageBooking.getBookingstatus());
		       bm.setDateofrequest(packageBooking.getDateofrequest());
		       System.out.println(bm);
		       bookinglist.add(bm);	
		      name.clear();
		}
	   
	    model.addAttribute("bookinglist", bookinglist);
		return "admin";
	}
	
	
	@RequestMapping("/bookingdetails" )
	public String bookingdetails(Model model){
		
		List<PackageBooking> bookingrequestlist=bookingservice.fetchbookingrequest();
	
		 List<String> name= new ArrayList<>();
		    List<Bookingmodel> bookinglist = new ArrayList<>();
		    
		    for (PackageBooking packageBooking : bookingrequestlist) {
		    	
		    	 Bookingmodel bm =new Bookingmodel();
		    	String str=packageBooking.getNameofpassenger();
		    	 bm.setNameofpassengers(str);
		    	 User user= userservices.getuser(packageBooking.getUserid());
			    	String email =user.getEmail();
		           /*String[] keywords=str.split(",");
		          
			      
			       for (int i = 0; i < keywords.length; i++) {
			    	   
			  		   String s= keywords[i];
			    	   name.add(keywords[i]);
			    	   bm.setNameofpassengers(s);
			    	   
				   }
			      */
			       System.out.println("inlist");
			       System.out.println(name);
			      
			      
			       bm.setBookingid(packageBooking.getBookingid());
			       
			       bm.setDeparturedate(packageBooking.getDeparturedate());
			       bm.setEmail(email);
			       bm.setNumberofpassenger(packageBooking.getNumberofpassenger());
			       bm.setMobile(user.getMobile());
			       bm.setTotalpayableprice(packageBooking.getTotalpayableprice());
			       bm.setPackageid(packageBooking.getPackageid());
			       bm.setPaymentstatus(packageBooking.getPaymentstatus());
			       bm.setBookingstatus(packageBooking.getBookingstatus());
			       bm.setDateofrequest(packageBooking.getDateofrequest());
			       System.out.println(bm);
			       bookinglist.add(bm);	
			      name.clear();
			}
		   
		    model.addAttribute("bookinglist", bookinglist);
		
		return "bookingdetails";
	}
	@RequestMapping("/bookingConfirmed" )
	public String bookingconfirmation(@RequestParam("action") int id ,@RequestParam("email") String email){
		System.out.println(email);
		
		bookingservice.updatebookingstatus(id,"Comfirmed");
		User dbUser=userservices.findUser(email);
		if(dbUser!=null)
		{		
			System.out.println(dbUser.getFirstname());
			//String bookingid= id;
			//if data is successfully fetched to the database then send mail
			email1.sendMail(dbUser.getFirstname(),email,email);
			
			return "adminindex";
		}
		return "adminindex";
	}
	
	
	
	//Category controller begin
	@RequestMapping("/cate" )
	public String fechcategory( Model model){
		
		List<Category> list=categoryservices.fetchcategory();
		model.addAttribute("categorylist", list);
		return "category";
	}
	@RequestMapping("/category")
  public String insertcategory(@ModelAttribute Category category ,Model model, HttpSession session) {
		 List<Category> list=categoryservices.fetchcategory();
		 for (Category category2 : list) {
			if(category2.getCategoryname().equalsIgnoreCase(category.getCategoryname()))
			{
				model.addAttribute("categorylist", list);
				return "category";
				 
//note add category in session
			}
		}
		categoryservices.addcategory(category);	
		List<Category> list2=categoryservices.fetchcategory();
		model.addAttribute("categorylist", list2);
		return "category";
	}
	@RequestMapping("/deletecate" )
	public String fechcatodeletecategory( Model model){
		
		List<Category> list=categoryservices.fetchcategory();
		
		model.addAttribute("categorylist", list);
		return "removecategory";
	}
	@RequestMapping("/removecategory")
	  public String deletecategory(@ModelAttribute Category category ,Model model, HttpSession session) {
	    
			categoryservices.deletecategory(category);	
			
			 List<Category> list=categoryservices.fetchcategory();
				model.addAttribute("categorylist", list);
			return "removecategory";
		}
	
	@RequestMapping("/updatecate" )
	public String fechcatoupdatecategory( Model model){
		
		List<Category> list=categoryservices.fetchcategory();
		model.addAttribute("categorylist", list);
		return "updatecategory";
	}
	@RequestMapping("/updatecategory")
	  public String updatecategory(@ModelAttribute Category category ,Model model, HttpSession session) {
	    
			categoryservices.updatecategory(category);	
			List<Category> list=categoryservices.fetchcategory();
			model.addAttribute("categorylist", list);
			return "removecategory";
		}
	//Category controller end;

	
	
	//state controller begin	
	
	@RequestMapping("/stat" )
	public String fetchstate(Model model){
		
		List<State> list=stateservices.fetchstate();
		System.out.println(list);
		model.addAttribute("stateinfo", list);
		System.out.println(list);
		return "state";
	}
	@RequestMapping(value="/stateinsert")
  public String insertstate(@ModelAttribute State state ,Model model) {
 	
		 List<State> list=stateservices.fetchstate();
			
		 for (State state2 : list) {
				if(state2.getStatename().equalsIgnoreCase(state.getStatename()))
				{ 
					model.addAttribute("stateinfo", list);
					return "state";
				}
			
		 }	
		 stateservices.addstate(state);	
		 List<State> list1=stateservices.fetchstate();
		 model.addAttribute("stateinfo", list1);
	return "state";	
	}
		
	@RequestMapping("/deletestate" )
	public String fechcatodeletestate(Model model){
		
		List<State> list=stateservices.fetchstate();
		model.addAttribute("stateinfo", list);
		return "removestate";
	}
	@RequestMapping("/removestate")
	  public String deletestate(@ModelAttribute State state ,Model model, HttpSession session) {
	    
			stateservices.deletestate(state);	
			 List<State> list=stateservices.fetchstate();
				model.addAttribute("stateinfo", list);
			return "removestate";
		}

	//state controller end;
	
	
	
	
	
	
	//package controller start;
	
	@RequestMapping("/package" )
	public String fetchstatecategory(Model model ,HttpSession session ){
		List<Category> categorylist=categoryservices.fetchcategory();
		model.addAttribute("categorylist", categorylist);
		List<State> statelist=stateservices.fetchstate();
		System.out.println(categorylist);
		
		model.addAttribute("stateinfo", statelist);
		System.out.println(statelist);
		return "addpackage";
	}
	
	@RequestMapping("/addpackage" )
	public String addpackage(PackageModel packagemodel,Model model){
		System.out.println(packagemodel);
		
		Category categorylist= categoryservices.getcategory(packagemodel.getCategoryname());
		 State statelist= stateservices.getstate(packagemodel.getStatename());
		  
		 Packagem Package=new Packagem();
		 Package.setPackagename(packagemodel.getPackagename());
		 Package.setDays(packagemodel.getDays());
		 Package.setDeparturecity(packagemodel.getDeparturecity());
		 Package.setDestinationcity(packagemodel.getDestinationcity());
		 Package.setPrice(packagemodel.getPrice());
		 Package.setExclusion(packagemodel.getExclusion());
		 Package.setInclusion(packagemodel.getInclusion());
		 Package.setItinerary(packagemodel.getItinerary());
		 Package.setImage1(packagemodel.getImage1());
		 Package.setImage2(packagemodel.getImage2());
		 Package.setImage3(packagemodel.getImage3());
		 Package.setImage4(packagemodel.getImage4());
		 Package.setCatobject(categorylist);
		 Package.setStateobject(statelist);
		// Package.getStateobject().setStateid(stateid);
		 
		 model.addAttribute("stateinfo", statelist);
		 System.out.println("package");
		 System.out.println(Package);
		 packageservice.addpackage(Package);
		 
	/*	System.out.println(categoryid);*/
		System.out.println(packagemodel.getStatename());
		
		return "addpackage";
	}
	
	@RequestMapping("/removepack" )
	public String fetchpackages(Model model ,HttpSession session ){
		List<Packagem> packagelist=packageservice.fetchpackage();
		
		model.addAttribute("packagelist",packagelist);
		return "removepackage";
	}
	@RequestMapping("/removepackage" )
	public String deletepackages(@ModelAttribute Packagem Package ,Model model ,HttpSession session ){
		packageservice.deletepackage(Package);
		List<Packagem> packagelist=packageservice.fetchpackage();
		model.addAttribute("packagelist",packagelist);
		return "removepackage";
	}
	@RequestMapping("/viewpack" )
	public String viewpackages(Model model ,HttpSession session ){
		List<Packagem> packagelist=packageservice.fetchpackage();
		
		model.addAttribute("packagelist",packagelist);
		return "packages";
	}
}
