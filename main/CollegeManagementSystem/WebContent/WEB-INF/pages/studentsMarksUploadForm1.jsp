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
 <h4>${requestScope.message}</h4>
  <div class="container col-lg-6 col-md-offset-3">
  <h2 class="col-sm-offset-4" >Upload Marks </h2>
  <form  action="uploadMarks" method="POST">
	
	 <label>Subject:</label>
  	 <select class="form-control" name="subId" required="required">
    	<optgroup label="Subjects">
       		<c:forEach var="subject" items="${sessionScope.subjects}">
				<option value="${subject.getSubId()}">${subject.getSubName()}</option>
		   </c:forEach>
    </optgroup>
   </select>
	
	<br>
	 <div class="form-group">
    	<label for="marks">Marks:</label>
    	<input type="number" class="form-control" id="sid" placeholder="Enter Marks" name="marks" required="required">
  	 </div>  
   <br>
   <button type="submit" class="btn btn-success">Go</button>
  </form>
</div>
</div>
<div class="container">
<a href="studentsMarksUploadForm" class="col-sm-offset-4">click here to add marks of another student</a>
<br>
<a href="facultyLoginSuccess" class="col-sm-offset-4">click here to go back</a>
</div>

</body>
</html>