package com.app.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FilesDao;
import com.app.entity.Files;

@Service
public class FilesService 
{
	@Autowired
	FilesDao filesDao;
	
	public Serializable uploadFile(Files file)
	{
		return filesDao.uploadFile(file);
	}
}
