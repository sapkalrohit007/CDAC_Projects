package com.tour.models;


import java.util.Date;
import java.util.List;

public class Bookingmodel {
	private int bookingid;
	private  Date departuredate;
	private String nameofpassengers;
	private int	numberofpassenger;
	
	private  String	mobile ;
	private  double totalpayableprice;	
	private  int packageid;
	private  String email;
	private  Date dateofrequest;
	private String paymentstatus;
	private String bookingstatus;
	public Bookingmodel() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Bookingmodel(int bookingid, Date departuredate, String nameofpassengers, int numberofpassenger,
			String mobile, double totalpayableprice, int packageid, String email, Date dateofrequest,
			String paymentstatus, String bookingstatus) {
		super();
		this.bookingid = bookingid;
		this.departuredate = departuredate;
		this.nameofpassengers = nameofpassengers;
		this.numberofpassenger = numberofpassenger;
		this.mobile = mobile;
		this.totalpayableprice = totalpayableprice;
		this.packageid = packageid;
		this.email = email;
		this.dateofrequest = dateofrequest;
		this.paymentstatus = paymentstatus;
		this.bookingstatus = bookingstatus;
	}

	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}
	public String getNameofpassengers() {
		return nameofpassengers;
	}
	public void setNameofpassengers(String nameofpassengers) {
		this.nameofpassengers = nameofpassengers;
	}
	public int getNumberofpassenger() {
		return numberofpassenger;
	}
	public void setNumberofpassenger(int numberofpassenger) {
		this.numberofpassenger = numberofpassenger;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getTotalpayableprice() {
		return totalpayableprice;
	}
	public void setTotalpayableprice(double totalpayableprice) {
		this.totalpayableprice = totalpayableprice;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	
	public Date getDateofrequest() {
		return dateofrequest;
	}
	public void setDateofrequest(Date dateofrequest) {
		this.dateofrequest = dateofrequest;
	}

	@Override
	public String toString() {
		return String.format(
				"Bookingmodel [bookingid=%s, departuredate=%s, nameofpassengers=%s, numberofpassenger=%s, mobile=%s, totalpayableprice=%s, packageid=%s, email=%s, dateofrequest=%s, paymentstatus=%s, bookingstatus=%s]",
				bookingid, departuredate, nameofpassengers, numberofpassenger, mobile, totalpayableprice, packageid,
				email, dateofrequest, paymentstatus, bookingstatus);
	}
	
	
}
