package com.tour.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.tour.entities.Paymentinfo;


@Repository
public class PaymentDao {
	
	@Autowired
	private SessionFactory factory;
	
	
	@Transactional
	public void save(Paymentinfo payment) {
		Session session =factory.getCurrentSession();
		session.save(payment);
	}
	
	
}
