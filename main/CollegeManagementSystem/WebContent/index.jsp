<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<link href='<c:url value="/resources/styles/styles.css"></c:url>' rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
	padding: 0;
    margin: 0;
    background-image: url('resources/images/college.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
}
</style>
</head>
<body>

<ul class="nav nav-tabs" >
  <li><a href="home/getNews">News</a></li>
   <li><a href="home/aboutUs">About Us</a></li>
  <li><a href="student/loginform">      Student Login</a></li>
  <li><a href="faculty/loginform">      Faculty Login</a></li>
  <li><a href="admin/loginform">        Admin Login</a></li>
</ul>
</body>
</html>