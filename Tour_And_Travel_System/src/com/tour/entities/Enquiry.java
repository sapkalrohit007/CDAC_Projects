package com.tour.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {

	  @Id
	  @Column
	  private int  enquiryid;
	  @Column
	  private String name;
	  private String email;
	  private String mobile;
	  private String message; 
	  private  String enquirystatus ;
	  
	  public Enquiry() {
		// TODO Auto-generated constructor stub
	}
	public Enquiry(int enquiryid, String name, String email, String mobile, String message, String enquirystatus) {
	
		this.enquiryid = enquiryid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.message = message;
		this.enquirystatus = enquirystatus;
	}
	public int getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(int enquiryid) {
		this.enquiryid = enquiryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEnquirystatus() {
		return enquirystatus;
	}
	public void setEnquirystatus(String enquirystatus) {
		this.enquirystatus = enquirystatus;
	}
	@Override
	public String toString() {
		return String.format("Enquiry [enquiryid=%s, name=%s, email=%s, mobile=%s, message=%s, enquirystatus=%s]",
				enquiryid, name, email, mobile, message, enquirystatus);
	}
	
	  
}
