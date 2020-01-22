<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Registeration Form</title>
</head>
<body>
<div class="container col-lg-6 col-md-offset-3">

  <h2 class="col-sm-offset-4" >Registeration Form </h2>
  <form  action="addSubject" method="POST">
  
	  	<label>Department:</label>
	  	 <select class="form-control" name="deptId" required="required">
	    	<optgroup label="Department">
	       		<c:forEach var="department" items="${requestScope.departments}">
					<option value="${department.getDeptId()}">${department.getDeptName()}</option>
			   </c:forEach>
	    	</optgroup>
	     </select>

		<label>SEMESTER:</label>
		<select class="form-control" name="semId" required="required">
	    	<optgroup label="Semester">
					<option value="1">First Semester</option>
					<option value="2">Second Semester</option>
					<option value="3">Third Semester</option>
					<option value="4">Fourth Semester</option>
					<option value="5">Fifth Semester</option>
					<option value="6">Sixth Semester</option>
					<option value="7">Seventh Semester</option>
					<option value="8">Eighth Semester</option>
	    	</optgroup>
	     </select>
		
		<div class="form-group">
    	<label for="subName">SubjectName</label>
    	<input type="text" class="form-control" id="subName" placeholder="Subject Name" name="subName" required="required">
  	 	</div>	
   <br>
  
   <button type="submit" class="btn btn-success">Register</button>
  </form>
</div>

</body>
</html>