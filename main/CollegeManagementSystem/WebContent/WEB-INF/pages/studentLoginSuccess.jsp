<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<link href='<c:url value="/resources/styles/styles.css"></c:url>' rel="stylesheet">
<title>student</title>
<style type="text/css">
*{
	padding: 0;
    margin: 0;
    background-image: url('../resources/images/studentfun.jpg');;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    color: black;
}
</style>
</head>
<body>
<h1>${requestScope.message}</h1>
<div class="container col-lg-6 col-md-offset-3">
<div class="list-group">
<a href="ebookDownloadForm" class="list-group-item">show Ebooks</a>
<a href="showResultsForm" class="list-group-item">Show Results</a>
</div>
</div>
</body>
</html>