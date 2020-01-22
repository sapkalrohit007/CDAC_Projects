package com.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.entity.Result;

@Repository
public class ResultDao 
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public Serializable addResult(Result result)
	{
		Session session = factory.getCurrentSession();
		Serializable result1=0;
		try 
		{
			result1 = session.save(result);
		} 
		catch (Exception e)
		{
			return result1;
		}
		return result1;
	}
	
	@Transactional
	public Result searchResult(Result result)
	{
		System.out.println("inside search block");
		System.out.println(result);
		String hql="select r from Result r where r.student.studentId=:txt_studentId and r.subject.subId=:txt_subId";
		Session session=factory.getCurrentSession();
		Query<Result> query = session.createQuery(hql,Result.class);
		query.setParameter("txt_studentId", result.getStudent().getStudentId());
		query.setParameter("txt_subId", result.getSubject().getSubId());
		try 
		{
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Transactional
	public void updateResult(Result result)
	{
		Session session=factory.getCurrentSession();
		/*session.update(result);*/
		System.out.println("inside update block");
		System.out.println(result);
		Result res = session.load(Result.class, result.getResultId());
		System.out.println(res);
		res.setMarks(result.getMarks());
		session.merge(res);
	}
}
