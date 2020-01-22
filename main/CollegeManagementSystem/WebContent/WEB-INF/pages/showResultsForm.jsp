<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title></title>
</head>
<body>
<div class="container">
 <h4>${requestScope.message}</h4>
  <div class="container col-lg-6 col-md-offset-3">
  <h2 class="col-sm-offset-4" >Upload Marks </h2>
  <form  action="showResult" method="POST">
	
  	 <label>Select Semester:</label>
  	 <select class="form-control" name="semId" required="required">
    	<optgroup label="Semester">
				<option value="1">First Semester</option>
					<option value="2">Second Semester</option>
					<option value="3">Third Semester</option>
					<option value="4">Fourth Semester</option>
					<option value="5">Fifth Semester</option>
					<option value="6">Sixth Semester</option>
					<option value="7">Seventh Semester</option>
					<option value="8">Eighth Semester</option>
    </optgroup>
   </select>
   <br>
  
   <button type="submit" class="btn btn-success">Go</button>
  </form>
</div>
</div>
<div class="container">
<br>
<a href="studentLoginSuccess" class="col-sm-offset-4">click here to go back</a>
</div>
</body>
</html>