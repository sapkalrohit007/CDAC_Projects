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
<div class="container">

  <h2 class="col-sm-offset-4" >DELETION FORM </h2>
  <form class="form-horizontal" action="deleteStudent" method="POST">
    <div class="form-group">
      <label class="control-label col-sm-4" for="sid">Enter student ID to be deleted:</label>
      <div class="col-sm-4">      
        <input type="number" class="form-control" id="sid" placeholder="Student Id" name="studentId" required="required">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>
<br>
<div class="container">
	<h4 class="col-sm-offset-4">${requestScope.message}</h4>
</div>
	<br>
<div class="container">
<a href="adminLogin" class="col-sm-offset-4">click here to go back</a>
</div>
</body>
</html>