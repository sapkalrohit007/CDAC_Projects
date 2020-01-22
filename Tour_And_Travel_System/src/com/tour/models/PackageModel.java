package com.tour.models;

public class PackageModel {

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
		private String  categoryname;
		private String  statename;	
	public PackageModel() {
		// TODO Auto-generated constructor stub
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
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return String.format(
				"PackageModel [packagename=%s, departurecity=%s, destinationcity=%s, days=%s, price=%s, inclusion=%s, exclusion=%s, itinerary=%s, image1=%s, image2=%s, image3=%s, image4=%s, categoryname=%s, statename=%s]",
				packagename, departurecity, destinationcity, days, price, inclusion, exclusion, itinerary, image1,
				image2, image3, image4, categoryname, statename);
	}

	
}
