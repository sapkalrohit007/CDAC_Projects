<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Tour and Travel</title>
  <meta charset="utf-8">
  <b:kickstart title="Tour and Travel"></b:kickstart>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style type="text/css" <%@include file="css/bootstrap.min.css" %>></style> 
  <script type="text/javascript" <%@include file ="js/jquery.min.js" %>></script>
   <script type="text/javascript" <%@include file ="js/bootstrap.min.js" %>></script>
 
</head>
<body >  
<%@include file="indexadmin.jsp" %>

<div class="container">
     <h2 class="col-sm-offset-4" >ALL Booking Details </h2>
     
    <div class=col-sm-offset-0>
    <div class ="col-sm-12">
   <table class="table table-bordered">
    <thead>
      <tr>
        <th>Booking ID</th>
        <th>Package ID</th>
        <th>User Email</th>
        <th>Name Of Passengers</th>
        <th>Mobile No.</th>
        <th>Number of Passenger</th>
        <th>Total Amount</th>
        <th>Departure Date</th>
        <th>Date of Request</th>
        <th>Payment Status</th>
        <th>Booking Status</th>
      </tr>
    </thead>
    
    <tbody>
      <c:forEach var="bookinglist" items="${bookinglist}">    
      <tr>
      
      
        <td> <c:out value="${bookinglist.bookingid }"  /></td>
        <td> <c:out value="${bookinglist.packageid}"  /></td>
        <td> <c:out value="${bookinglist.email }"/></td>
        <td> 
        
      <c:set var ="name" scope="request" value="${bookinglist.nameofpassengers}"></c:set>
        <c:out value="${name}"></c:out>
       
       
       
        </td>
        <td><c:out value ="${bookinglist.mobile}"/></td>
        <td><c:out value ="${bookinglist.numberofpassenger}"/></td>
        <td><c:out value ="${bookinglist.totalpayableprice}"/></td>
        <td><c:out value ="${bookinglist.departuredate}"/></td>
        <td><c:out value ="${bookinglist.dateofrequest}"/></td>
        <td><c:out value ="${bookinglist.paymentstatus}"/></td>
        <td><a href="bookingConfirmed?action=${bookinglist.bookingid }&email=${bookinglist.email }"><c:out value ="${bookinglist.bookingstatus}"/></a></td>
      	</tr>
      	</c:forEach>
    	</tbody>
  		</table>
	  </div>
  

</div>


<footer class="container-fluid text-center">
  <p>Copyright © 2016 Friends Tour And Travel, India. All rights reserved</p>
</footer>

</body>
</html>