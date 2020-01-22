package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="News")
public class News 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int newsId;
	@Column
	private String news;
	public News() {
		this(0,"");
	}
	
	public News(int newsId, String news) {
		super();
		this.newsId = newsId;
		this.news = news;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", news=" + news + "]";
	}
	
	
	
}
