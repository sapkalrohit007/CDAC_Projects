package com.tour.models;

public class NameOfPassenger {

    private String name;	
	public NameOfPassenger() {
		// TODO Auto-generated constructor stub
	}
	public NameOfPassenger(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("NameOfPassenger [name=%s]", name);
	}
}
