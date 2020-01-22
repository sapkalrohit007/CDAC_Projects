package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tour.daos.EnquiryDao;

import com.tour.entities.Enquiry;

@Service
public class EnquiryServices {

	@Autowired
	private EnquiryDao enquirydao;
	
public boolean enquiry(Enquiry enquiry) {
		
	    enquirydao.save(enquiry);
          return true;		
	}
public List<Enquiry> fetchenquiry() {
	return  enquirydao.getenquiry();
}
public void enquiryupdate(int id, String status) {
	
	 enquirydao.enquiryupdate(id,status);
}
}
