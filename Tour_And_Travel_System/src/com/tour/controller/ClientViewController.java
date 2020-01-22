package com.tour.controller;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.tour.entities.Enquiry;
import com.tour.entities.PackageBooking;
import com.tour.entities.Packagem;
import com.tour.entities.Paymentinfo;
import com.tour.entities.User;
import com.tour.models.ExpirationModel;
import com.tour.services.BookingServices;

import com.tour.services.EnquiryServices;
import com.tour.services.PackageServices;
import com.tour.services.PaymentService;



@Controller
public class ClientViewController {

	
	@Autowired
	private PackageServices packageservice;
	@Autowired
	private BookingServices bookingservice;
	@Autowired
	private EnquiryServices enquiryservice;
	@Autowired
	private PaymentService paymentservice;
	
	@RequestMapping("/enquiry" )
    public String clienthomepage(@ModelAttribute Enquiry enquiry,Model model ,HttpSession session ){
		List<Enquiry> enquirylist=enquiryservice.fetchenquiry();
		model.addAttribute("enquirylist", enquirylist);
       return "enquiry";
		
	}
	
	@RequestMapping("/subenquiry" )
	  public String clientenquiry(@ModelAttribute Enquiry enquiry,Model model  ){
			System.out.println("inside controller");
		    String Status ="Unseen";
		    enquiry.setEnquirystatus(Status);
		    enquiryservice.enquiry(enquiry);

			return "Webindex";
			
		}

	@RequestMapping("/enquiryupdate" )
	  public String enquiryupdate(@RequestParam("action") int id,Model model){	   
		String Status ="Seen";
		enquiryservice.enquiryupdate(id,Status);
		List<Enquiry> enquirylist=enquiryservice.fetchenquiry();
		model.addAttribute("enquirylist", enquirylist);
		return "enquiry";
			
		}
	@RequestMapping("/stateweb" )
	  public String packagesstateinfo(@RequestParam("action") int id,Model model){	
		System.out.println(id);
			List<Packagem> packagelist=packageservice.fetchpackagebystateid(id);
			
			model.addAttribute("packagelist",packagelist);
		
				
			return "stateweb";
			
		}
	
	@RequestMapping("/packages" )
	  public String packageinfo(@RequestParam("action") int id,Model model ){	
		
			Packagem packages=packageservice.fetchpackage(id);
			
			model.addAttribute("packages",packages);
		System.out.println(packages);
				
			return "packageinfo";
			
		}
	
	
	
	@RequestMapping("/paymentgateway" )
	  public String bookRequest(PackageBooking book ,HttpSession session){	
		
			
			book.setBookingstatus("Pending");
			book.setPaymentstatus("Pending");
			book.setTotalpayableprice(book.getTotalpayableprice()*book.getNumberofpassenger());
			Date date= new Date(Calendar.getInstance().getTime().getTime());
			book.setDateofrequest(date);
			session.setAttribute("bookingdetails",book);
			System.out.println("booking details");
		    System.out.println(session.getAttribute("bookingdetails"));
			return "paymentgateway";
			
		}
	
	@RequestMapping("/book" )
	  public String paymentRequest(Paymentinfo paymentinfo ,ExpirationModel expiration,HttpSession session){	
		
		PackageBooking book = (PackageBooking) session.getAttribute("bookingdetails");
		System.out.println("inside book");
		System.out.println(expiration);
		
		User user =(User) session.getAttribute("user");
		Integer month =expiration.getMonth();
		String m =month.toString();
		Integer year =expiration.getYear();
		String y =year.toString();
		paymentinfo.setExpiration(m+" / "+y);
	    paymentinfo.setUserid(user.getUserid());
	
		paymentservice.addpayment(paymentinfo);
		
		
		
		try {
            String recipient = "+91"+user.getMobile();
            String message = " Dear Customer, Your payment Received succesfully!!! Tour and travel ! for more info check your mail!! Have a nice day!";
            String username = "admin";
            String password = "vwJw58ve";
            String originator = "+8888539186";

            String requestUrl  = "http://192.168.1.8:9800/sendsms?action=sendmessage&" +
            					 "username=" + URLEncoder.encode(username, "UTF-8") +
            					 "&password=" + URLEncoder.encode(password, "UTF-8") +
            					 "&recipient=" + URLEncoder.encode(recipient, "UTF-8") +
            					 "&messagetype=SMS:TEXT" +
            					 "&messagedata=" + URLEncoder.encode(message, "UTF-8") +
            					 "&originator=" + URLEncoder.encode(originator, "UTF-8") +
            					 "&serviceprovider=HTTPServer1" +
            					 "&responseformat=html";



            URL url = new URL(requestUrl);
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();

            System.out.println(uc.getResponseMessage());

            uc.disconnect();

    } catch(Exception ex) {
            System.out.println(ex.getMessage());

    }
    

		
		
		
		
		
		
		book.setPaymentstatus("Comfirmed");
		bookingservice.book(book);
		
		return "bookingconfirm";
			
}
	@RequestMapping("/search" )
	  public String packagesearch(@RequestParam("source") String source,@RequestParam("destination") String destination,Model model){	
		
			List<Packagem> packagelist=packageservice.fetchpackagebycity(source,destination);
			
			model.addAttribute("packagelist",packagelist);
		
				
			return "searchresult";
			
		}
	
	@RequestMapping("/categoryweb" )
	  public String packagescatinfo(@RequestParam("action") int id,Model model ){	
		
			List<Packagem> packagelist=packageservice.fetchpackagebycatid(id);
			
			model.addAttribute("packagelist",packagelist);
		
				
			return "stateweb";
			
		}
	
	
		
}
