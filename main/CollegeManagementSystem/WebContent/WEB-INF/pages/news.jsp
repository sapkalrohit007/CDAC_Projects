<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/styles.css"></c:url>' rel="stylesheet">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>News</title>
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
<div class="container col-lg-6 col-md-offset-3">
<h4><strong>News</strong></h4>
<c:forEach var="news" items="${requestScope.newsList}">
<div class="list-group list-group-item active">
    <p class="list-group-item-text">${news.getNews()}</p>
</div>
<br>
<br>
</c:forEach>

</div>
</body>
</html>