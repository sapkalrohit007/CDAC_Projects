package com.app.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Subjects;

@Repository
public class SubjectsDao 
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public Serializable addSubject(Subjects subject)
	{
		System.out.println("inside subject dao");
		System.out.println(subject);
		Session session = factory.getCurrentSession();
		Serializable result=0;
		try 
		{
			result = session.save(subject);
		} 
		catch (Exception e)
		{
			return result;
		}
		return result;
	}
		
	@Transactional
	public int deleteSubject(Subjects subject) 
	{
		Session session =factory.getCurrentSession();
		
		try 
		{
			session.delete(subject);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	@Transactional
	public Subjects searchSubject(Subjects subject)
	{
		String hql="select s from Subjects s where s.subId=:txt_id";
		Session session=factory.getCurrentSession();
		 Query<Subjects> query = session.createQuery(hql,Subjects.class);
		query.setParameter("txt_id", subject.getSubId());
		try 
		{
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Transactional
	public List<Subjects> getSubject(int deptid,int semid)
	{
		String hql="select s from Subjects s where s.department.deptId=:txt_deptId and s.semId=:txt_semId";
		Session session=factory.getCurrentSession();
		 Query<Subjects> query = session.createQuery(hql,Subjects.class);
		query.setParameter("txt_deptId",deptid);
		query.setParameter("txt_semId",semid);
		try 
		{
			List<Subjects> list = query.getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}
}
