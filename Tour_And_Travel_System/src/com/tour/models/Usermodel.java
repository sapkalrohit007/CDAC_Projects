package com.tour.models;

import java.util.Date;

public class Usermodel {

private int	userid;

private String	firstname;
private String	lastname;
private Date	birthdate;
private String	usertype;
private int mobile;
private String	email;

public Usermodel() {
	// TODO Auto-generated constructor stub
}


public Usermodel(int userid, String firstname, String lastname, Date birthdate, String usertype, int mobile,
		String email) {
	
	this.userid = userid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthdate = birthdate;
	this.usertype = usertype;
	this.mobile = mobile;
	this.email = email;
}


public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
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

public int getMobile() {
	return mobile;
}

public void setMobile(int mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return String.format(
			"Usermodel [userid=%s, firstname=%s, lastname=%s, birthdate=%s, usertype=%s, mobile=%s, email=%s]", userid,
			firstname, lastname, birthdate, usertype, mobile, email);
}

}
