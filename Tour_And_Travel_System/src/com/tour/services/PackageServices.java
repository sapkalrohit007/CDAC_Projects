package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.CategoryDao;
import com.tour.daos.PackageDao;
import com.tour.entities.Category;
import com.tour.entities.Packagem;

@Service
public class PackageServices {

	@Autowired
	private PackageDao packagedao;
	
   public boolean addpackage(Packagem Package) {
		
	   packagedao.save(Package);
         return true;		
	}
   public void deletepackage(Packagem Package){
		
	   packagedao.remove(Package);
		
	}
	public List<Packagem> fetchpackage() {
		System.out.println("inside package service");
		return packagedao.getpackage();	
	}
	
	public Packagem fetchpackage(int id) {
		
		return packagedao.fetchpackage(id);
	}
	public List<Packagem> fetchpackagebycatid(int id) {
		
		return packagedao.fetchpackagebycatid(id);
	}
	public List<Packagem> fetchpackagebystateid(int id) {
		return packagedao.fetchpackagebystateid(id);

		//return null;
	}
	public List<Packagem> fetchpackagebycity(String source, String destination) {
			
		return packagedao.fetchpackagebycity(destination);
	}
 
}
