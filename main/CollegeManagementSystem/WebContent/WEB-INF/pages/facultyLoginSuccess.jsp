<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
*{
	padding: 0;
    margin: 0;
    background-image: url('../resources/images/admin.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
}
</style>
</head>
<body>
<h1>${requestScope.message}</h1>
<div class="container col-lg-6 col-md-offset-3">
<div class="list-group">
<a href="ebookUploadForm" class="list-group-item">Upload Ebook</a>
<a href="studentsMarksUploadForm" class="list-group-item">Upload students marks</a>
</div>
<a href="logout">Logout</a>
</div>
</body>
</html>