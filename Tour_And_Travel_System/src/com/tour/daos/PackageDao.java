package com.tour.daos;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tour.entities.Category;
import com.tour.entities.Packagem;
@Repository
public class PackageDao {
	@Autowired
	private SessionFactory factory;
	@Transactional
	public void save(Packagem Package ) {
		Session session =factory.getCurrentSession();
		session.save(Package);
	}
	@Transactional
	public void remove(Packagem Package) {
		Session session =factory.getCurrentSession();
		session.delete(Package.getPackagename(),Package);;
	
	}
	@Transactional
	public List<Packagem>getpackage() {
		
		 Session session =factory.getCurrentSession();
		 Criteria cr=session.createCriteria(Packagem.class);
		
		 return cr.list();
	}
	
	@Transactional
	public List<Packagem> fetchpackagebystateid(int id) {
		
		Session session =factory.getCurrentSession();
			System.out.println("indside");
		
		String hql = "from Packagem where stateobject.stateid =:id";
		Query query = session.createQuery(hql);
		query.setParameter("id",id);
		List<Packagem> listPackages = query.list();
		 
		return listPackages;	
	}
	@Transactional
	public List<Packagem>fetchpackagebycatid(int id) {
		
		Session session =factory.getCurrentSession();
			
		
		String hql = "from Packagem where catobject.categoryid =:id";
		Query query = session.createQuery(hql);
		query.setParameter("id",id);
		List<Packagem> listPackages = query.list();
		 
	
		return listPackages;	
	}
	@Transactional
	public Packagem fetchpackage(int id) {
		Session session =factory.getCurrentSession();
		session.get(Packagem.class,id);
		return (Packagem) session.get(Packagem.class,id);
	}
	@Transactional
	public List<Packagem> fetchpackagebycity(String destination) {
		Session session =factory.getCurrentSession();
		
		Criteria cr=session.createCriteria(Packagem.class);
	   cr.add(Restrictions.eq("destinationcity", destination).ignoreCase());
		//cr.add(Restrictions.eq("destinationcity", destination.toLowerCase()));
		 return   cr.list();
		
	}
	
	

}
