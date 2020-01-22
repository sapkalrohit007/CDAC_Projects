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
import com.tour.entities.State;
import com.tour.entities.User;

@Repository
public class StateDao  {

	@Autowired
	private SessionFactory factory;
   
	@Transactional
	public List<State> fetchstateinfo() {
			  Session session =factory.getCurrentSession();
			  Criteria cr=session.createCriteria(State.class);
			  return cr.list();
			
		}
//	insert the new state
	@Transactional
	public void save(State state) {
		Session session =factory.getCurrentSession();
		session.save(state);
	}
	@Transactional
	public void removestate(State state) {
		Session session =factory.getCurrentSession();
		String sql = "delete from package where stateid=:stateid";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("stateid",state.getStateid());
		query.executeUpdate();
		session.delete(state.getStatename(),state);;
	}
	@Transactional
	public State getstate(String statename) {
		Session session =factory.getCurrentSession();
		Criteria cr=session.createCriteria(State.class);
	     cr.add(Restrictions.eq("statename",statename));
		 return (State) cr.uniqueResult();
		
	}
	
	
}
