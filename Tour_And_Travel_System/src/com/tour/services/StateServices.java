package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.CategoryDao;
import com.tour.daos.StateDao;
import com.tour.entities.Category;
import com.tour.entities.State;

@Service
public class StateServices {
	@Autowired
	private StateDao statedao;
	
	public boolean addstate(State state) {
			
			statedao.save(state);;
	         return true;		
		}
   public void deletestate(State state){
		
		statedao.removestate(state);;
		
	}
   public List<State> fetchstate() {
		return statedao.fetchstateinfo();
	}
	public State getstate(String statename) {
		return statedao.getstate(statename) ;
		
	}
}
