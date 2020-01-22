<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="bj" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Tour and Travel</title>
 
  <bj:kickstart title="Tour and Travel"></bj:kickstart>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style type="text/css" <%@include file="css/bootstrap.min.css" %>></style> 
  <script type="text/javascript" <%@include file ="js/jquery.min.js" %>></script>
     <script type="text/javascript" <%@include file ="js/bootstrap.min.js" %>></script>
   
   
</head>
<body>

<%@include file="indexadmin.jsp" %>
  <div class="container">
  <h2 class="col-sm-offset-0" >ADD PACKAGE </h2>
  <form class="form-horizontal"  action="addpackage" method="POST" >
  <!-- enctype="multipart/form-data" -->
    <div class="form-group">
      <label class="control-label col-sm-2">Package Name</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="package" placeholder="Enter Package Name" name="packagename">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2">Category Name</label>
      <div class="col-sm-4">
       <select class="form-control" name="categoryname">
       
        <c:forEach var="category" items="${categorylist}">
        <option value="${category.categoryname}"><c:out value ="${category.categoryname}"/></option>
         </c:forEach> 
      </select>
      </div>
    </div>
   
   <div class="form-group">
      <label class="control-label col-sm-2">State Name</label>
      <div class="col-sm-4">
       <select class="form-control"  name="statename">
        <c:forEach var="state" items="${stateinfo}">    
        <option value="${state.statename}"><c:out value ="${state.statename}"/></option>
        </c:forEach>
      
      </select>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2">Departure City </label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="departure" placeholder="Enter Departure City  Name" name="departurecity">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2">Destination City </label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="category" placeholder="Enter Destination City Name" name="destinationcity">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2">No.Of Days</label>
      <div class="col-sm-2">
       <select class="form-control" id="sel1" class="days" name="days">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
      </select>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2">Price </label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="price" placeholder="Enter the price" name="price">
      </div>
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Inclusion</label>
	    <div class="col-sm-8">
	    	<textarea class="form-control" rows="5" id="inclusion" name="inclusion"></textarea>
	     </div>
                
    </div>
   <div class="form-group">
	    <label class="control-label col-sm-2">Exclusion</label>
	    <div class="col-sm-8">
	    	<textarea class="form-control" rows="5" id="exclusion" name="exclusion"></textarea>
	     </div>
                
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Itinerary</label>
	    <div class="col-sm-8">
	    	<textarea class="form-control" rows="5" id="itinerary" name="itinerary"></textarea>
	     </div>
                
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Upload Image1</label>
	    <div class="col-sm-4">
	    	<input type="file" name="image1"/> 
	     </div>
                
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Upload Image2</label>
	    <div class="col-sm-4">
	    	<input type="file" name="image2"/> 
	     </div>
                
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Upload Image3</label>
	    <div class="col-sm-4">
	    	<input type="file" name="image3"/> 
	     </div>
                
    </div>
    <div class="form-group">
	    <label class="control-label col-sm-2">Upload Image4</label>
	    <div class="col-sm-4">
	    	<input type="file" name="image4"/> 
	     </div>
                
    </div>
     <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-2">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
    
   </form>
 </div>
<footer class="container-fluid text-center">
  <p>Copyright © 2016 Friends Tour And Travel, India. All rights reserved</p>
</footer>

 <ckeditor:replaceAll basePath="ckeditor/"></ckeditor:replaceAll></body>
</html>