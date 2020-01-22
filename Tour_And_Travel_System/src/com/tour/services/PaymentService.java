package com.tour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.PaymentDao;
import com.tour.entities.Paymentinfo;


@Service
public class PaymentService {

	@Autowired
	PaymentDao paymentdao;
	
	public boolean addpayment(Paymentinfo paymentinfo) {
		
		paymentdao.save(paymentinfo);;
         return true;		
	}
	
}
