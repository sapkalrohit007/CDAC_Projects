package com.tour.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="packagebooking")
public class PackageBooking {
	

	@Id
	@Column
	private  int bookingid;
	private  Date departuredate;
	private  Date dateofrequest;
	private int	numberofpassenger;
	private String nameofpassenger;
	private  double totalpayableprice;
	private String paymentstatus;
	private String bookingstatus;
	private  int userid;
	private  int packageid;
	 
	 
	 public PackageBooking() {
		
	}


	


	public PackageBooking(int bookingid, Date departuredate, Date dateofrequest, int numberofpassenger,
			String nameofpassenger, double totalpayableprice, String paymentstatus, String bookingstatus, int userid,
			int packageid) {
		super();
		this.bookingid = bookingid;
		this.departuredate = departuredate;
		this.dateofrequest = dateofrequest;
		this.numberofpassenger = numberofpassenger;
		this.nameofpassenger = nameofpassenger;
		this.totalpayableprice = totalpayableprice;
		this.paymentstatus = paymentstatus;
		this.bookingstatus = bookingstatus;
		this.userid = userid;
		this.packageid = packageid;
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


	public Date getDateofrequest() {
		return dateofrequest;
	}


	public void setDateofrequest(Date dateofrequest) {
		this.dateofrequest = dateofrequest;
	}


	public int getNumberofpassenger() {
		return numberofpassenger;
	}


	public void setNumberofpassenger(int numberofpassenger) {
		this.numberofpassenger = numberofpassenger;
	}


	public double getTotalpayableprice() {
		return totalpayableprice;
	}


	public void setTotalpayableprice(double totalpayableprice) {
		this.totalpayableprice = totalpayableprice;
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


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getPackageid() {
		return packageid;
	}


	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}


	public String getNameofpassenger() {
		return nameofpassenger;
	}


	public void setNameofpassenger(String nameofpassenger) {
		this.nameofpassenger = nameofpassenger;
	}





	@Override
	public String toString() {
		return String.format(
				"PackageBooking [bookingid=%s, departuredate=%s, dateofrequest=%s, numberofpassenger=%s, nameofpassenger=%s, totalpayableprice=%s, paymentstatus=%s, bookingstatus=%s, userid=%s, packageid=%s]",
				bookingid, departuredate, dateofrequest, numberofpassenger, nameofpassenger, totalpayableprice,
				paymentstatus, bookingstatus, userid, packageid);
	}
	

	
}
