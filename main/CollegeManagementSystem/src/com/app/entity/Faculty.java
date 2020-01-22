package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Faculty")
public class Faculty 
{
	
	private int facultyId;
	private String facultyName;
	private String password;
	private String email;
	private String address;
	private Date birthdate;
	private Department department;
	
	public Faculty() 
	{
		this(0,"","","","",new Date());
	}
	
	public Faculty(int facultyId, String facultyName, String password, String email, String address, Date birthdate) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.department=new Department();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	@Column
	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Column
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptId")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", birthdate=" + birthdate + "]";
	}
	
	
	
	
	
}
