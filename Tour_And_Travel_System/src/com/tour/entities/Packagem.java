package com.tour.entities;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class Packagem {
	@Id
	@Column
	@GeneratedValue
	 private int packageid;
	@Column
	 private String packagename ; 	
	 private String departurecity; 		
	 private String  destinationcity; 	
	 private int days; 	 	
	 private Double price; 	 	
	 private String inclusion;  	
	 private String exclusion  ;	
	 private String itinerary; 	 	
	 private String image1;
	 private String image2;
	 private String  image3 ;	 
	 private String  image4;
	 
	 @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	 @JoinColumn(name="categoryid", updatable=false)
	 private Category catobject;
	 
	 @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	 @JoinColumn(name="stateid", updatable=false)
	 private State stateobject;
	 
	
	 public Packagem(){
		 
	 }
	 
	 
	public Packagem(int packageid, String packagename, String departurecity, String destinationcity, int days,
			Double price, String inclusion, String exclusion, String itinerary, String image1, String image2,
			String image3, String image4, Category catobject, State stateobject) {
		
		this.packageid = packageid;
		this.packagename = packagename;
		this.departurecity = departurecity;
		this.destinationcity = destinationcity;
		this.days = days;
		this.price = price;
		this.inclusion = inclusion;
		this.exclusion = exclusion;
		this.itinerary = itinerary;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.catobject = new Category();
		this.stateobject = new State();
	}


	public int getPackageid() {
		return packageid;
	}


	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}


	public String getPackagename() {
		return packagename;
	}


	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}


	public String getDeparturecity() {
		return departurecity;
	}


	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}


	public String getDestinationcity() {
		return destinationcity;
	}


	public void setDestinationcity(String destinationcity) {
		this.destinationcity = destinationcity;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getInclusion() {
		return inclusion;
	}


	public void setInclusion(String inclusion) {
		this.inclusion = inclusion;
	}


	public String getExclusion() {
		return exclusion;
	}


	public void setExclusion(String exclusion) {
		this.exclusion = exclusion;
	}


	public String getItinerary() {
		return itinerary;
	}


	public void setItinerary(String itinerary) {
		this.itinerary = itinerary;
	}


	public String getImage1() {
		return image1;
	}


	public void setImage1(String image1) {
		this.image1 = image1;
	}


	public String getImage2() {
		return image2;
	}


	public void setImage2(String image2) {
		this.image2 = image2;
	}


	public String getImage3() {
		return image3;
	}


	public void setImage3(String image3) {
		this.image3 = image3;
	}


	public String getImage4() {
		return image4;
	}


	public void setImage4(String image4) {
		this.image4 = image4;
	}


	public Category getCatobject() {
		return catobject;
	}


	public void setCatobject(Category catobject) {
		this.catobject = catobject;
	}


	public State getStateobject() {
		return stateobject;
	}


	public void setStateobject(State stateobject) {
		this.stateobject = stateobject;
	}
    

	


	@Override
	public String toString() {
		return "Packagem [packageid=" + packageid + ", packagename=" + packagename + ", departurecity=" + departurecity
				+ ", destinationcity=" + destinationcity + ", days=" + days + ", price=" + price + ", inclusion="
				+ inclusion + ", exclusion=" + exclusion + ", itinerary=" + itinerary + ", image1=" + image1
				+ ", image2=" + image2 + ", image3=" + image3 + ", image4=" + image4 + "]";
	}


	
	 
	 	 	
 	
	 
	 
 	
}
