package com.tour.entities;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="paymentinfo")
public class Paymentinfo {
	@Id
	@Column
	private int paymentid;
 	private String firstname;
 	private String	email;
 	private String nameoncard;
 	private int cardnumber;
 	private String expiration;
 	private int cvvnumber;
 	private String paymenttype;
 	private int userid;
 	private String cardtype;
 	
 	public Paymentinfo() {
		// TODO Auto-generated constructor stub
	}

	public Paymentinfo(int paymentid, String firstname, String email, String nameoncard, int cardnumber,
			String expiration, int cvvnumber, String paymenttype, int userid, String cardtype) {
		super();
		this.paymentid = paymentid;
		this.firstname = firstname;
		this.email = email;
		this.nameoncard = nameoncard;
		this.cardnumber = cardnumber;
		this.expiration = expiration;
		this.cvvnumber = cvvnumber;
		this.paymenttype = paymenttype;
		this.userid = userid;
		this.cardtype = cardtype;
	}

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameoncard() {
		return nameoncard;
	}

	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}

	public int getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getCvvnumber() {
		return cvvnumber;
	}

	public void setCvvnumber(int cvvnumber) {
		this.cvvnumber = cvvnumber;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	@Override
	public String toString() {
		return String.format(
				"Paymentinfo [paymentid=%s, firstname=%s, email=%s, nameoncard=%s, cardnumber=%s, expiration=%s, cvvnumber=%s, paymenttype=%s, userid=%s, cardtype=%s]",
				paymentid, firstname, email, nameoncard, cardnumber, expiration, cvvnumber, paymenttype, userid,
				cardtype);
	}

 	
}
