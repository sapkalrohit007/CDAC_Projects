package com.tour.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tour.entities.Category;
import com.tour.entities.Enquiry;

@Repository
public class EnquiryDao {
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public List<Enquiry> getenquiry() {
		  Session session =factory.getCurrentSession();
		  Criteria cr=session.createCriteria(Enquiry.class);
		  return cr.list();		
	}
	@Transactional
	public void save(Enquiry enquiry) {
		Session session =factory.getCurrentSession();
		session.save(enquiry);
	}
	@Transactional
	public void enquiryupdate(int id, String status) {
		
		Session session =factory.getCurrentSession();
		String sql = " UPDATE enquiry SET enquirystatus=:enquirystatus WHERE enquiryid=:enquiryid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("enquiryid",id);
		query.setParameter("enquirystatus",status);
		query.executeUpdate();
	}
}
