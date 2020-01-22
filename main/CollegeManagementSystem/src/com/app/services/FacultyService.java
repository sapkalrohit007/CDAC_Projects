package com.app.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FacultyDao;
import com.app.entity.Faculty;

@Service
public class FacultyService 
{
	@Autowired
	FacultyDao facultyDao;
	
	public Serializable addFaculty(Faculty faculty)
	{
		return facultyDao.addFaculty(faculty);
	}
	
	public int deleteFaculty(Faculty faculty) {
		return facultyDao.deleteFaculty(faculty);
	}
	
	public Faculty validateFaculty(Faculty faculty)
	{
		return facultyDao.validateFaculty(faculty);
	}
	
	public int updateFaculty(Faculty faculty)
	{
		return facultyDao.updateFaculty(faculty);
	}
	public Faculty searchFaculty(Faculty faculty)
	{
		return facultyDao.searchFaculty(faculty);
	}
}
