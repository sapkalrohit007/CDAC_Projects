<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>Tour and Travel</title><!--mobile apps-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <meta name="keywords" content="Vacation Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
 -->
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--mobile apps-->
<!--Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet" href="css/lightbox.css">
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<!-- //Custom Theme files -->
<!-- js -->

<script src="js/jquery-1.11.1.min.js"></script> 
<!-- //js -->
<!--web-fonts-->
<!--//web-fonts-->
<script type="text/javascript" <%@include file ="js/jquery.min.js" %>></script>
  <script src="js/bootstrap.js"></script>
 <style>
  
.search {
    margin-top: -25%;
}
.search .form-section{
	background:rgba(0,0,0,0.6);
	border: 2px solid #414141;
	border-radius: 5px;
	padding: 10px;
}
  </style>
</head>
<body >

<div class="navbar-wrapper">
    <div class="container">
		<%@include file="index.jsp" %>
		
		
    </div>
</div>

 <div class="row text-center">
   <div class="col-md-10 col-md-offset-1">
   <c:forEach var="packages" items="${packagelist}">
  <div class="col-sm-4">
 
    <div class="thumbnail">
    <p><strong>${packages.packagename}</strong></p>
		<img src="images/${packages.image1}"/>
	 
      
      <p>Prices Starting:Rs.${packages.price} </p>
      
      <h5><a href="packages?action=${packages.packageid}">More Details</a></h5>
     
    </div>
  </div>
  </c:forEach>
  
</div>
	
	 </div>
</body>
</html>