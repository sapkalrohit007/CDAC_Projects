<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Registeration Form</title>
</head>
<body>
<div class="container col-lg-6 col-md-offset-3">

  <h2 class="col-sm-offset-4" >Registeration Form </h2>
  <form  action="addFaculty" method="POST">
  
	 <div class="form-group">
    	<label for="name">Name</label>
    	<input type="text" class="form-control" id="name" placeholder="Name" name="facultyName" required="required">
  	 </div>  
  	 
  	  <div class="form-group">
  	    <label for="exampleInputEmail1">Email ID</label>
    	<input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" name="email" required="required">
      </div>
  
      <div class="form-group">
         <label for="password">Password</label>
         <input type="password" class="form-control" id="password" placeholder="Email" name="password" required="required">
      </div>
  
     <div class="form-group">
         <label for="address">Address</label>
         <textarea class="form-control" rows="3" cols="3" placeholder="Address" name="address" id="address" required="required"></textarea>
     </div>
  
     <div class="form-group">
       <label for="birthdate">Birth Date</label>
       <input type="date" class="form-control" id="birthdate" placeholder="Birth Date" name="birthdate" required="required">
	 </div>
  
	
  	 <label>Department:</label>
  	 <select class="form-control" name="deptId" required="required">
    	<optgroup label="Department">
       		<c:forEach var="department" items="${requestScope.departments}">
				<option value="${department.getDeptId()}">${department.getDeptName()}</option>
		   </c:forEach>
    </optgroup>
   </select>
   <br>
  
   <button type="submit" class="btn btn-success">Register</button>
  </form>
</div>
</body>
</html>