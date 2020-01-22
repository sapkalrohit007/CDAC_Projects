<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<link href='<c:url value="/resources/styles/styles.css"></c:url>' rel="stylesheet">
<title>Login Form</title>
<style type="text/css">
*{
	padding: 0;
    margin: 0;
    background-image: url('../resources/images/teacher.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
}
.main{

color: white;
}

</style>
</head>
<body>
<div class="container main">

  <h2 class="col-sm-offset-4" >Login </h2>
  <form class="form-horizontal" action="login" method="POST">
    <div class="form-group">
      <label class="control-label col-sm-4" for="email" >Email:</label>
      <div class="col-sm-4">
      
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required="required">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="pwd">Password:</label>
      <div class="col-sm-4">          
        <input type="password" class="form-control" id="pw" placeholder="Enter password" name="password" required="required">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-4">
        <div class="checkbox">
          <label><input type="checkbox"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-4">
        <div class="checkbox">
          <label style="color:red">${message} </label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-10">
        <button type="submit" class="btn btn-success">Login</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>