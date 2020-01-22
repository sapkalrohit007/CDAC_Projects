<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    background-image: url('../resources/images/adminfun.jpg');;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
    color: white;
}
</style>
</head>
<body>
<h1>${requestScope.message}</h1>
<div class="container col-lg-6 col-md-offset-3">
<div class="list-group">
<a href="departmentRegisterationForm" class="list-group-item">Add New Department</a>
<a href="studentRegisterationForm" class="list-group-item">Add New Student</a>
<a href="facultyRegisterationForm" class="list-group-item">Add New Faculty</a>
<a href="subjectRegisterationForm" class="list-group-item">Add New Subject</a>
<a href="newsAdditionForm" class="list-group-item">Add New news</a>
<a href="studentDeletionForm" class="list-group-item">Delete Student</a>
<a href="departmentDeletionForm" class="list-group-item">Delete Department</a>
<a href="facultyDeletionForm" class="list-group-item">Delete Faculty</a>
<a href="subjectDeletionForm" class="list-group-item">Delete Subject</a>

</div>
</div>
</body>
</html>