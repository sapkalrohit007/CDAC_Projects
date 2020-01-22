package com.app.entity;

import java.util.ArrayList;
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
@Table(name="Subjects")
public class Subjects 
{
	private int subId;
	private int semId;
	
	private String subName;
	
	private Department department;
	
	private List<Result>result;
	
	public Subjects() {
		this(0,0,"");
	}

	public Subjects(int semId, int subId, String subName) {
		super();
		this.semId = semId;
		this.subId = subId;
		this.subName = subName;
		this.department=new Department();
		this.result=new ArrayList<>();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	@Column
	public int getSemId() {
		return semId;
	}

	public void setSemId(int semId) {
		this.semId = semId;
	}
	
	@Column
	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptId")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@OneToMany(mappedBy="subject", fetch=FetchType.EAGER, cascade={ CascadeType.REMOVE})
	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Subjects [semId=" + semId + ", subId=" + subId + ", subName=" + subName + "]";
	}
}
