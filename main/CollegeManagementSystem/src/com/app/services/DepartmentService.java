package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DepartmentDao;
import com.app.entity.Department;

@Service
public class DepartmentService 
{
	@Autowired
	DepartmentDao departmentDao;
	
	public int insertDepartment(Department department)
	{
		return departmentDao.insertDepartment(department);
	}
	
	public void deleteDepartment(Department department)
	{
		departmentDao.deleteDepartment(department);
	}
	public List<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
	}
}
