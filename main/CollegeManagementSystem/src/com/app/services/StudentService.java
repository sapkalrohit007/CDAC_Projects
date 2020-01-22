package com.app.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.entity.Result;
import com.app.entity.Student;

@Service
public class StudentService 
{
	@Autowired
	StudentDao studentDao;
	
	public Serializable addStudent(Student student)
	{
		return studentDao.addStudent(student);
	}
	
	public int deleteStudent(Student student) 
	{
		return studentDao.deleteStudent(student);
	}
	
	public Student validateStudent(Student student)
	{
		return studentDao.validateStudent(student);
	}
	
	public int updateStudent(Student student)
	{
		return studentDao.updateStudent(student);
	}
	public Student searchStudent(Student student)
	{
		return studentDao.searchStudent(student);
	}
	public List<Result> getResult(int studentId,int semId)
	{
		return studentDao.getResult(studentId, semId);
	}
}
