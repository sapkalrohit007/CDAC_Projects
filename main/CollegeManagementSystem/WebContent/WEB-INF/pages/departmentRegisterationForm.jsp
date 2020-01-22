<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="container col-lg-6 col-md-offset-3">

  <h2 class="col-sm-offset-4" >Registeration Form </h2>
  <form  action="addDepartment" method="POST">
  
	 <div class="form-group">
    	<label for="deptid">Department ID</label>
    	<input type="number" class="form-control" id="deptid" placeholder="Department ID" name="deptId" required="required">
  	 </div>  
  	 
  	  <div class="form-group">
  	    <label for="dname">Department Name</label>
    	<input type="text" class="form-control" id="dname" placeholder="Department Name" name="deptName" required="required">
      </div>
  
  <br>
   <button type="submit" class="btn btn-success">Register</button>
  </form>
</div>
</body>
</html>