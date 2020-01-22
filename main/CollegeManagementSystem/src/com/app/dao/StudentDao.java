package com.app.dao;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Result;
import com.app.entity.Student;

@Repository
public class StudentDao 
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public Serializable addStudent(Student student)
	{
		System.out.println("inside student add dao");
		Session session = factory.getCurrentSession();
		Serializable result=0;
		try 
		{
			result = session.save(student);
		} 
		catch (Exception e)
		{
			return result;
		}
		return result;
	}
	@Transactional
	public int deleteStudent(Student student) {
		Session session =factory.getCurrentSession();
		
		try 
		{
			session.delete(student);
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	@Transactional
	public Student validateStudent(Student student)
	{
		String hql="from Student s where s.email=:txt_Email and s.password=:txt_Password";
		Session session =factory.getCurrentSession();
		Query<Student> query = session.createQuery(hql,Student.class);
	
		query.setParameter("txt_Email", student.getEmail());
		query.setParameter("txt_Password",student.getPassword());
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@Transactional
	public int updateStudent(Student student)
	{
		Session session =factory.getCurrentSession();
		try 
		{
			session.update(student);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}
	
	@Transactional
	public Student searchStudent(Student student)
	{
		String hql="select s from Student s where s.studentId=:txt_id";
		Session session=factory.getCurrentSession();
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("txt_id", student.getStudentId());
		try 
		{
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Transactional
	public List<Result> getResult(int studentId,int semId)
	{
		String hql="select r from Result r where r.student.studentId=:txt_studentId and r.subject.semId=:txt_semId";
		Session session=factory.getCurrentSession();
		Query<Result> query = session.createQuery(hql,Result.class);
		query.setParameter("txt_studentId",studentId);
		query.setParameter("txt_semId",semId);
		try 
		{
			List<Result> list = query.getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}
}
