package com.app.entity;

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
@Table(name="Result")
public class Result
{
	private int resultId;
	private int marks;
	private Subjects subject;
	private Student student;
	
	public Result() 
	{
		this(0,0);
	}

	public Result(int resultId, int marks) {
		super();
		this.resultId = resultId;
		this.marks = marks;
		this.student=new Student();
		this.subject=new Subjects();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	@Column
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="subId")
	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="studentId")
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", marks=" + marks + ", subject=" + subject + ", student=" + student
				+ "]";
	}
	
	
	
	
	
}
