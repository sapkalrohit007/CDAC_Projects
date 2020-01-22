package com.app.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.NewsDao;
import com.app.entity.News;

@Service
public class NewsService 
{
	@Autowired
	NewsDao newsDao;
	
	public Serializable addNews(News news)
	{
		return newsDao.addNews(news);
	}
	
	public List<News>getNews()
	{
		return newsDao.getNews();
	}
}
