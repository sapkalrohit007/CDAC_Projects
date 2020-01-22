<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
 
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
<body>
<%@include file="indexadmin.jsp" %>
  <div class="container">
     <h2 class="col-sm-offset-4" >Enquires </h2>
    <div class=col-sm-offset-0>
    <div class ="col-sm-12">
   <table class="table table-bordered">
    <thead>
      <tr>
        <th>Enquiry ID </th>
        <th> Name</th>
        <th>Email</th>
        <th>Mobile NO.</th>
        <th>Message</th>
        <th>Enquiry Status</th>       
      </tr>
    </thead>
    <tbody>
      <c:forEach var="enquiry" items="${enquirylist}">    
      <tr>
      
      
        <td> <c:out value="${enquiry.enquiryid }"  /></td>
        <td> <c:out value="${enquiry.name}"  /></td>
        <td> <c:out value="${enquiry.email}"/></td>
        <td> <c:out value="${enquiry.mobile}"  /></td>
        <td><c:out value ="${enquiry.message}"/></td>
        <td><a href="enquiryupdate?action=${enquiry.enquiryid }"><c:out value ="${enquiry.enquirystatus}"/></a></td>
       
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