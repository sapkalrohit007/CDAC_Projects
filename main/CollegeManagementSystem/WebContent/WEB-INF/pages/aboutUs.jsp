<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>About Us</title>
<style type="text/css">
*{
	padding: 0;
    margin: 0;
    background-image: url('resources/images/blue.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
}
</style>
</head>
<body>
<ul class="nav nav-tabs">
  <li><a href="http://localhost:8080/CollegeManagementSystem/home/getNews">News</a></li>
   <li><a href="http://localhost:8080/CollegeManagementSystem/home/aboutUs">About Us</a></li>
  <li><a href="http://localhost:8080/CollegeManagementSystem/student/loginform">      Student Login</a></li>
  <li><a href="http://localhost:8080/CollegeManagementSystem/faculty/loginform">      Faculty Login</a></li>
  <li><a href="http://localhost:8080/CollegeManagementSystem/admin/loginform">        Admin Login</a></li>
</ul>
 <div class="container">
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">1</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">2</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">3</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">4</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">5</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">6</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">7</div>
            <div class="movie col-lg-6 col-md-4 col-sm-3 col-xs-2">8</div>
        </div>
</body>
</html>