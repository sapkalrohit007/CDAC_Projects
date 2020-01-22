package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminDao;
import com.app.entity.Admin;

@Service
public class AdminService 
{
	@Autowired
	AdminDao adminDao;
	
	public Admin validateAdmin(Admin admin)
	{
		return adminDao.validateAdmin(admin);
	}
}
