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
  <h2 class="col-sm-offset-4" >DELETE STATEINFO </h2>
  <form class="form-horizontal" action="removestate" method="POST" >
    <div class="form-group">
      <label class="control-label col-sm-4">State Id</label>
      <div class="col-sm-4">
        <input type="number" class="form-control" id="state" placeholder="Enter State Id" name="stateid">
      </div>
    </div>             
    
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
   </form>
   
   <div class="container">
     <h2 class="col-sm-offset-4" >STATE LIST </h2>
    <div class=col-sm-offset-2>
    <div class ="col-sm-8">
   <table class="table table-bordered">
    <thead>
      <tr>
        <th>State ID</th>
        
        
        <th>State Name</th>
        
      </tr>
    </thead>
    <tbody>
      <c:forEach var="state" items="${stateinfo}">    
      <tr>
      
      
        <td> <c:out value="${state.stateid}"  /></td>
        
        <td><c:out value ="${state.statename}"/></td>
        
        
        
       	
      	</tr>
      	</c:forEach>
    	</tbody>
  		</table>
	  </div>
  	</div>

</div>
<footer class="container-fluid text-center">
  <p>Copyright © 2016 Friends Tour And Travel, India. All rights reserved</p>
</footer>

</body>
</html>