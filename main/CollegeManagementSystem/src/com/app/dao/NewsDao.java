package com.app.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.News;

@Repository
public class NewsDao 
{
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public Serializable addNews(News news)
	{
		Session session = factory.getCurrentSession();
		try {
			Serializable result = session.save(news);
			return result;
		} catch (Exception e) {
			return 0;
		}	
	}
	
	@Transactional
	public List<News>getNews()
	{
		Session session = factory.getCurrentSession();
	    String hql="select n from News n";
	    Query<News> query = session.createQuery(hql,News.class);
	    List<News> newsList = query.getResultList();
	    return newsList;
	}
}
