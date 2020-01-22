package com.tour.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	@Id
	@GeneratedValue
	@Column
	private int userid; 
	
	private String email ; 	
	private  String firstname ;
	private  String	lastname ;
	private  String	mobile ;
	private  Date birthdate ;	
	private  String usertype ;
	
	private  String	password ;	
	private  char gender ;
	
	
	
	
	
	public User() {
		
	}


	public User(int userid, String email, String firstname, String lastname, String password, char gender,
			String mobile, Date birthdate, String usertype) {
		
		this.userid = userid;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
		this.birthdate = birthdate;
		this.usertype = usertype;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	@Override
	public String toString() {
		return String.format(
				"User [userid=%s, email=%s, firstname=%s, lastname=%s, mobile=%s, birthdate=%s, usertype=%s, password=%s, gender=%s]",
				userid, email, firstname, lastname, mobile, birthdate, usertype, password, gender);
	}
   

	


	
	
}
