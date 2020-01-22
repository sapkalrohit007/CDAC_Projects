<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Tour and Travel</title>
  <meta charset="utf-8">
  <b:kickstart title="Tour and Travel"></b:kickstart>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style type="text/css" <%@include file="css/bootstrap.min.css" %>></style> 
  <script type="text/javascript" <%@include file ="js/jquery.min.js" %>></script>
   <script type="text/javascript" <%@include file ="js/bootstrap.min.js" %>></script>
  
</head>


<body>

<%@include file="indexadmin.jsp" %>
<div id="main-container-center" class="container my-signin">
    <div class="row">

        <div class="col-md-4 col-md-offset-4 col-bdr-center">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>Add New User </h3>
                    
                </div>
                <div class="panel-body">
                    <form name="register-form" id="registration-form" method="GET" action="newuser">
                        <div class="form-group">
                            <label for="fname">First Name</label>
                            <input type='text' id="fname" name="firstname" placeholder="First Name" class="form-control required_field" value="" data-regtype="validFirstName" data-errormsg="*Please enter first name"/>
                        </div>
                        <div class="form-group">
                            <label for="lname">Last Name</label>
                            <input type="text" class="form-control required_field" placeholder="Last Name"  id="lname" name="lastname"  value="" data-regtype="validLastName" data-errormsg="*Please enter last name"/>
                        </div>
                         <div class="form-group">
                            <label for="lname">Gender</label>
                            <div class="checkbox">   
                           <label> <input type="radio" value="M" name="gender" >Male</label>
                           <label> <input type="radio" name="gender"  value="F" />Female</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="mobile">Birth Date</label>
                            <div class="isd-date-input-section">
                            	
	                            <input id="birthdate" type="date" class="form-control required_field date-field-input" placeholder="dd/mm/yyyy"  name="birthdate"  value="01/01/1947" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                        
                        <select class="form-control" name="usertype">
       					<option value="admin">Admin</option>
                        <option value="user">User</option>
                        <option value="other">Other</option>
                        </select>
                        <div class="form-group">
                            <label for="mobile">Mobile Number</label>
                            <div class="isd-mobile-input-section">
                            	
	                            <input id="mobile" type="tel" class="form-control required_field mobile-field-input" placeholder="Mobile Number"  name="mobile"  value="+91-" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="pemail">Email Address</label>
                            <input id="pemail" type="email" class="form-control required_field" placeholder="Email Address"  name="email" value="" data-regtype="email" data-errormsg="*Please enter email address"/>
                        </div>
                        <div id="validationErrorMessage" class="has-error"><span class="help-block"></span></div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" id="password" class="form-control required_field" placeholder="Password"  name="password" data-errormsg="*Please enter the password" data-regtype="validatePassword"/>
                        </div>
                        <div class="form-group">
                            <label for="cpassword">Confirm Password</label>
                            <input type="password" id="cpassword" class="form-control required_field" placeholder="Confirm Password" name="confirmPassword" data-errormsg="*Please enter the confirm password" data-regtype="loginPasswordMatch"/>
                        </div>
                       
                        <div class="form-group">
                            <button type="submit" id="btn_register" class="yt-btn btn-blue btn-block simulateSubmit" onclick="javascript:_gaq.push(['_trackEvent', 'Sign In / Sign Up', 'Main Sign Up Page', 'Register']);">Register</button>
                        </div>
                         <div class="form-group">
                            <input type="hidden" name="returnUrl" value=></input>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        


    </div>
</div>

<body>
