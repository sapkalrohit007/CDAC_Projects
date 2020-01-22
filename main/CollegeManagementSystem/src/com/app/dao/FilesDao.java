package com.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Files;

@Repository
public class FilesDao 
{
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public Serializable uploadFile(Files file)
	{
		Session session = factory.getCurrentSession();
		Serializable result=0;
		try 
		{
			result = session.save(file);
		} 
		catch (Exception e)
		{
			return result;
		}
		return result;
	}
}
