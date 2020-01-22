package com.app.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ResultDao;
import com.app.entity.Result;

@Service
public class ResultService 
{
	
	@Autowired
	ResultDao resultDao;
	
	public Serializable addResult(Result result)
	{
		return resultDao.addResult(result);
	}
	
	public Result searchResult(Result result)
	{
		return resultDao.searchResult(result);
	}
	
	public void updateResult(Result result)
	{
		resultDao.updateResult(result);
	}
}
