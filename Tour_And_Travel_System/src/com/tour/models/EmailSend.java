package com.tour.models;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import org.springframework.stereotype.Component;

@Component
public class EmailSend {
	
	
	
	public EmailSend() {
		// TODO Auto-generated constructor stub
	}

	public void sendMail(String name,String from ,String  message){
		
		
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		  // Get a Properties object
		     Properties props = System.getProperties();
		     props.setProperty("mail.smtp.host", "smtp.gmail.com");
		     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		     props.setProperty("mail.smtp.socketFactory.fallback", "false");
		     props.setProperty("mail.smtp.port", "465");
		     props.setProperty("mail.smtp.socketFactory.port", "465");
		     props.put("mail.smtp.auth", "true");
		     props.put("mail.debug", "true");
		     props.put("mail.store.protocol", "pop3");
		     props.put("mail.transport.protocol", "smtp");
		     
		     //Set your mail-id  And password
		     final String username = "newton2faraday@gmail.com";//
		     final String password = "newton2faraday";
		     try{
		     Session session = Session.getDefaultInstance(props, 
		                          new Authenticator(){
		                             protected PasswordAuthentication getPasswordAuthentication() {
		                                return new PasswordAuthentication(username, password);
		                             }});

		   // -- Create a new message --
		     Message msg = new MimeMessage(session);

		  // -- Set the FROM and TO fields --
		     msg.setFrom(new InternetAddress("newton2faraday@gmail.com"));
		     msg.setRecipients(Message.RecipientType.TO, 
		                      InternetAddress.parse(from,false));
		     
		     //Add Subject 
		     msg.setSubject("Hello , "+name);
		     msg.setText("Hello "+name+""
		     		+ ""
		     		+ "  Your Booking is successfull : "+message+
		     		""
		     		+ "  Click here For Login  http://localhost:7070/Tour_And_Travel_System/log");
		     msg.setSentDate(new Date());
		     Transport.send(msg);
		     System.out.println("Message sent.");
		  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
		  }  
	}


