package com.app.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Department;

@Repository
public class DepartmentDao 
{
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public int insertDepartment(Department department)
	{
		Session session = factory.getCurrentSession();
		try 
		{
			session.save(department);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	@Transactional
	public void deleteDepartment(Department department)
	{
		Session session = factory.getCurrentSession();
		session.delete(department);		
	}
	
	@Transactional
	public List<Department> getAllDepartments()
	{
		System.out.println("inside department dao");
		String hql = "select d from Department d";
		Session session =factory.getCurrentSession();
		Query<Department> query = session.createQuery(hql,Department.class);
		List<Department> list =(List<Department>)query.getResultList();
	   	return list;
	}
}
