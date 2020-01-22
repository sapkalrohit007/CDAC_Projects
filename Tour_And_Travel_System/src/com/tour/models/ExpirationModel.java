package com.tour.models;

public class ExpirationModel {

	private int month;
	private int year;
	
	public ExpirationModel() {
		// TODO Auto-generated constructor stub
	}

	public ExpirationModel(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("ExpirationModel [month=%s, year=%s]", month, year);
	}
	
	
}
