<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Result</title>
</head>
<body>
<br>
<br>
<div class="container col-lg-6 col-md-offset-3">
<h2>Result</h2>
<table class="table table-bordered">
 <thead>
		 <tr>
		 	<th>
		 		Subject Name
		 	</th>
		 	<th>
		 		Score
		 	</th>
		 </tr>
 </thead>
 <tbody>
		   <c:forEach var="result" items="${requestScope.results}">
				<tr>
					<td>${result.subject.getSubName()}</td>
					<td>${result.getMarks()}</td>
				</tr>
		   </c:forEach>
 </tbody>
</table>
</div>
<a href="studentLoginSuccess" class="col-sm-offset-4">click here to go back</a>
</body>
</html>