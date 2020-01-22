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
<div class="container col-lg-6 col-md-offset-3">

  <h2 class="col-sm-offset-4" >Add News </h2>
  <form  action="addNews" method="POST">
  

     <div class="form-group">
         <label for="news">Enter News</label>
         <textarea class="form-control" rows="3" cols="5" placeholder="Enter News Here" name="news" id="news" required="required"></textarea>
     </div>
  
   <button type="submit" class="btn btn-success">Register</button>
  </form>
</div>

</body>
</html>