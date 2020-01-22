package com.tour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.daos.BookingDao;

import com.tour.entities.PackageBooking;


@Service
public class BookingServices {
	
	@Autowired
	private BookingDao bookingdao;
	
   public boolean book(PackageBooking booking) {
		
	   bookingdao.save(booking);
         return true;		
	}

public List<PackageBooking> fetchbookingrequest(String bookingrequest, String payment) {
	
	return bookingdao.fetchbookingrequest(bookingrequest,payment);
}



public void updatebookingstatus(int id, String string) {
	bookingdao.updatebookingstatus(id,string);
	
}

public void updatepayentstatus(int id, String string) {
	bookingdao.updatepayentstatus(id,string);
	
}

public List<PackageBooking> fetchbookingrequest() {
	return bookingdao.fetchbookingrequest();
	
}
}
