package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Department")
public class Department
{
	private int deptId;
	
	private String deptName;
	
	private List<Student> studentList;
	
	private List<Faculty> facultyList;
	
	private List<Subjects> subjectList;
	
	private List<Files> FilesList;
	
	public Department() 
	{
		this(0,"");
	}
	
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.studentList=new ArrayList<>();
		this.facultyList=new ArrayList<>();
		this.subjectList=new ArrayList<>();
		this.FilesList=new ArrayList<>();
	}
	
	@Id
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	@Column
	public String getDeptName() {
		return deptName;
	}
	
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY,cascade={CascadeType.ALL},orphanRemoval=true)
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY, cascade={ CascadeType.REMOVE})
	public List<Faculty> getFacultyList() {
		return facultyList;
	}
	
	public void setFacultyList(List<Faculty> facultyList) {
		this.facultyList = facultyList;
	}
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY, cascade={ CascadeType.REMOVE})
	public List<Subjects> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subjects> subjectList) {
		this.subjectList = subjectList;
	}
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY, cascade={ CascadeType.REMOVE})
	public List<Files> getFilesList() {
		return FilesList;
	}

	public void setFilesList(List<Files> fileList) {
		FilesList = fileList;
	}

	@Override
	public String toString() {
		return "Department [DeptId=" + deptId + ", DeptName=" + deptName + "]";
	}
	
	
}
