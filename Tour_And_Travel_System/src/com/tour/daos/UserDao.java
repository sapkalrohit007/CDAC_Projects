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
import com.tour.entities.User;
@Repository
public class UserDao {
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public User find(String email, String password) {
		Session session = factory.getCurrentSession();
		Criteria cr =session.createCriteria(User.class);
		cr.add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password));
		
		return  (User) cr.uniqueResult();
	}
	@Transactional
	public User getuser(int id) {
		Session session = factory.getCurrentSession();
		
		return (User) session.get(User.class,id);
	}
//	insert the new user
	@Transactional
	public void save(User signup) {
		Session session =factory.getCurrentSession();
		session.save(signup);
	}
	@Transactional
	public List<User> fetchuser() {
		
		 Session session =factory.getCurrentSession();
		  Criteria cr=session.createCriteria(User.class);
		  return cr.list();
	}
	@Transactional
	public int userdelete(int id) {
		Session session =factory.getCurrentSession();
		String sql = "delete from usertable where userid=:userid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("userid",id);
		
		return query.executeUpdate();
	}
	@Transactional
	public User findUser(String email) {
		Session session = factory.getCurrentSession();
		Criteria cr =session.createCriteria(User.class);
		cr.add(Restrictions.eq("email", email));
		System.out.println("inside");
		return  (User) cr.uniqueResult();
	}
	@Transactional
	public int updateuser(User updateuser) {
		
		Session session = factory.getCurrentSession();
	     session.update(updateuser);;
		return 1;
	}
}
