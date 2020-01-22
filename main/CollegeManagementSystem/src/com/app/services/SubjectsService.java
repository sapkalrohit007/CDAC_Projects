package com.app.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SubjectsDao;
import com.app.entity.Subjects;

@Service
public class SubjectsService 
{
	@Autowired
	SubjectsDao subjectsDao;
	public Serializable addSubject(Subjects subject)
	{
		return subjectsDao.addSubject(subject);
	}
	
	public int deleteSubject(Subjects subject) 
	{
		return subjectsDao.deleteSubject(subject);
	}
	
	public Subjects searchSubject(Subjects subject)
	{
		return subjectsDao.searchSubject(subject);
	}
	
	public List<Subjects> getSubject(int deptid,int semid)
	{
		return subjectsDao.getSubject(deptid, semid);
	}
}
