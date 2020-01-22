
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
 
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<div class="navbar-wrapper">
    <div class="container">
		<%@include file="index.jsp" %>
    </div>
</div>

<div class="jumbotron text-xs-center">
  <h1 class="col-sm-offset-4" >Thank You!</h1>
   <p class="col-sm-offset-4">
    Your Payment is Succesfull !
  </p>
  <p class="col-sm-offset-4"><strong>Please check your email</strong> for further instructions</p>
  <hr>
  <p class="col-sm-offset-4">
    Having trouble? <a href="">Contact us</a>
  </p>
  <p class="col-sm-offset-4">
    <a class="btn btn-primary btn-sm" href="#" role="button">Continue to homepage</a>
  </p>
</div>

</body>
</html>