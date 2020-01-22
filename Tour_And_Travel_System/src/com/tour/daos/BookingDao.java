package com.tour.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tour.entities.Category;
import com.tour.entities.PackageBooking;

@Repository
public class BookingDao {

	@Autowired
	private SessionFactory factory;
	@Transactional
	public void save(PackageBooking booking ) {
		Session session =factory.getCurrentSession();
		session.save(booking);
	}
	@Transactional
	public List<PackageBooking> fetchbookingrequest(String bookingrequest, String payment) {
		
		Session session =factory.getCurrentSession();
		 Criteria cr=session.createCriteria(PackageBooking.class);
	     cr.add(Restrictions.eq("bookingstatus",bookingrequest)).add(Restrictions.eq("paymentstatus", payment));
		
		return cr.list();	
	}
	@Transactional
	public void updatebookingstatus(int id, String string) {
		Session session =factory.getCurrentSession();
		String sql = " UPDATE packagebooking SET bookingstatus=:bookingstatus WHERE bookingid=:bookingid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("bookingid",id);
		query.setParameter("bookingstatus",string);
		query.executeUpdate();
	}
	@Transactional
	public void updatepayentstatus(int id, String string) {
		
		Session session =factory.getCurrentSession();
		String sql = " UPDATE packagebooking SET paymentstatus=:paymentstatus,bookingstatus=:bookingstatus WHERE bookingid=:bookingid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("bookingid",id);
		query.setParameter("bookingstatus",string);
		query.setParameter("paymentstatus",string);
		query.executeUpdate();
		
	}
	@Transactional
	public List<PackageBooking> fetchbookingrequest() {
		 Session session =factory.getCurrentSession();
		  Criteria cr=session.createCriteria(PackageBooking.class);
		  return cr.list();	
	}
	
	
	
}
