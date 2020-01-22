<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="/resources/styles/bootstrap.css"></c:url>' rel="stylesheet">
<title>Upload Ebook</title>
</head>
<body>
<div class="container">

  <h2 class="col-sm-offset-4" >Upload Ebook </h2>
  <form class="form-horizontal" action="uploadFile" method="POST" enctype="multipart/form-data">
    <div class="form-group">
      <label class="control-label col-sm-4" for="upload">Select File:</label>
      <div class="col-sm-4"> 
        <input type="file" class="form-control" id="upload"  name="fileUpload" required="required">
      </div>
    </div> 
    <div class="form-group">        
      <div class="col-sm-offset-4 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>
</body>
</html>