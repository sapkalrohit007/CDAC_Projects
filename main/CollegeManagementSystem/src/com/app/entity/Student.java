package com.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	
	private int studentId;
	private String studentName;
	private String password;
	private String email;
	private String address;
	private Date birthdate;
	private Department department;
	
	private List<Result> resultList;
	
	public Student() 
	{
		this(0,"","","","",new Date());
	}

	public Student(int studentId, String studentName, String password, String email, String address, Date birthdate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.department=new Department();
		this.resultList=new ArrayList<>();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Column
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	@OneToMany(mappedBy="student", fetch=FetchType.LAZY,cascade={CascadeType.ALL},orphanRemoval=true)
	public List<Result> getResultList() {
		return resultList;
	}

	public void setResultList(List<Result> resultList) {
		this.resultList = resultList;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", birthdate=" + birthdate + "]";
	}	
	
	
	
	
	
	
	
	

}
