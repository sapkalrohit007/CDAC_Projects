package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.UserDao;
import com.tour.entities.User;
@Service
public class UserServices {
	@Autowired
	private UserDao logindao;
	
	public User validate(User login) {
		User dbuser = logindao.find(login.getEmail(),login.getPassword());
		System.out.println("insied");
		System.out.println(login.getPassword());
		
		return dbuser;
		
			
	}
	public boolean usersignup(User signup) {
		
		logindao.save(signup);
         return true;		
	}
	public List<User> fetchuser() {
		
		return logindao.fetchuser();
	}
	public int userdelete(int id) {
		
		return logindao.userdelete(id);
	}
	public User getuser(int userid) {
		
		return logindao.getuser(userid);
	}
	public User findUser(String email) {
		
		return logindao.findUser(email);
	}
	public int updateuser(User updateuser) {
		
		return logindao.updateuser(updateuser);
	}

}
