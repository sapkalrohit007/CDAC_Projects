package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Admin;

@Repository
public class AdminDao
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public Admin validateAdmin(Admin admin)
	{
		String hql="select a from Admin a where a.email=:txt_Email and a.password=:txt_Password";
		Session session =factory.getCurrentSession();
		Query<Admin> query = session.createQuery(hql,Admin.class);
		query.setParameter("txt_Email", admin.getEmail());
		query.setParameter("txt_Password",admin.getPassword());
		try 
		{
			Admin a=query.getSingleResult();
			return a;
		}
		catch (Exception e)
		{
			return null;
		}
	}
}
