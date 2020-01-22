package com.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Faculty;

@Repository
public class FacultyDao 
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public Serializable addFaculty(Faculty faculty)
	{
		Session session = factory.getCurrentSession();
		Serializable result=0;
		try 
		{
			result = session.save(faculty);
		} 
		catch (Exception e)
		{
			return result;
		}
		return result;
	}
	@Transactional
	public int deleteFaculty(Faculty faculty) {
		Session session =factory.getCurrentSession();
		
		try 
		{
			session.delete(faculty);
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	@Transactional
	public Faculty validateFaculty(Faculty faculty)
	{
		String hql="from Faculty f where f.email=:txt_Email and f.password=:txt_Password";
		Session session =factory.getCurrentSession();
		 Query<Faculty> query = session.createQuery(hql,Faculty.class);
	
		query.setParameter("txt_Email", faculty.getEmail());
		query.setParameter("txt_Password",faculty.getPassword());
		try
		{
			faculty= query.getSingleResult();
			return faculty;
		} catch (Exception e)
		{
			return null;
		}
		
	}
	
	@Transactional
	public int updateFaculty(Faculty faculty)
	{
		Session session =factory.getCurrentSession();
		try 
		{
			session.update(faculty);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}
	
	@Transactional
	public Faculty searchFaculty(Faculty faculty)
	{
		String hql="from Faculty f where f.facultyId=:txt_facultyId";
		Session session =factory.getCurrentSession();
		Query<Faculty> query = session.createQuery(hql,Faculty.class);
		query.setParameter("txt_facultyId", faculty.getFacultyId());
		try
		{
			faculty= query.getSingleResult();
			return faculty;
		}
		catch (Exception e)
		{
				return null;
		} 
	}
}
