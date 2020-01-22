package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.CategoryDao;
import com.tour.daos.UserDao;
import com.tour.entities.Category;
import com.tour.entities.User;

@Service
public class CategoryServices {
	@Autowired
	private CategoryDao categorydao;
	
   public boolean addcategory(Category category) {
		
		categorydao.save(category);
         return true;		
	}
   public void deletecategory(Category category){
		
		categorydao.removecategory(category);
		
	}
   public List<Category> fetchcategory() {
		return categorydao.getcategory();
	}
public Category  getcategory(String categoryname) {
	
	
	return categorydao.getcategoryid(categoryname) ;
	
	
}
public void updatecategory(Category category) {
	categorydao.updatecategory(category);
}
	   
	
}


