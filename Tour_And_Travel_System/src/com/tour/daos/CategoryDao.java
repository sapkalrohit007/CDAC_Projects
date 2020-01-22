package com.tour.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tour.entities.Category;
import com.tour.entities.Packagem;
import com.tour.entities.User;

@Repository
public class CategoryDao {
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public List<Category> getcategory() {
		  Session session =factory.getCurrentSession();
		  Criteria cr=session.createCriteria(Category.class);
		  return cr.list();
		
	}
	@Transactional
	public void removecategory(Category category) {
		Session session =factory.getCurrentSession();	
		String sql = "delete from package where categoryid=:categoryid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("categoryid",category.getCategoryid());
		query.executeUpdate();
		session.delete(category.getCategoryname(),category);;
		}
	
	
	
	@Transactional
	public void save(Category category) {
		Session session =factory.getCurrentSession();
		session.save(category);
	}
	@Transactional
	public Category getcategoryid(String categoryname) {
		Session session =factory.getCurrentSession();
		Criteria cr=session.createCriteria(Category.class);
	   
		cr.add(Restrictions.eq("categoryname", categoryname));
		 return  (Category) cr.uniqueResult();
		

	}
	@Transactional
	public void updatecategory(Category category) {
		Session session =factory.getCurrentSession();
		//session.update("categoryname",Category.class);
	   
	}
}
