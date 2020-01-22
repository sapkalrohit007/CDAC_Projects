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
                    <h3>Update User </h3>
                    
                </div>
                <div class="panel-body">
                    <form name="register-form" id="registration-form" method="GET" action="updateuser">
                        <div class="form-group">
                            <label for="fname">First Name</label>
                            <input type='text' id="fname" name="firstname" placeholder="First Name" class="form-control required_field" value="${user.firstname }" data-regtype="validFirstName" data-errormsg="*Please enter first name"/>
                        </div>
                        <div class="form-group">
                            <label for="lname">Last Name</label>
                            <input type="text" class="form-control required_field" placeholder="Last Name"  id="lname" name="lastname"  value="${user.lastname }" data-regtype="validLastName" data-errormsg="*Please enter last name"/>
                        </div>
                        
                        <div class="form-group">
                            <label for="mobile">Birth Date</label>
                            <div class="isd-date-input-section">
                            	
	                            <input id="birthdate" type="date" class="form-control required_field date-field-input" placeholder="dd/mm/yyyy"  name="birthdate"  value="${user.birthdate}" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="mobile">User Type</label>
                            <div class="isd-date-input-section">
                            	
	                            <input id="usertype" type="text" class="form-control required_field date-field-input"  name="usertype"  value="${user.usertype}" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                       
                        <div class="form-group">
                            <label for="mobile">Mobile Number</label>
                            <div class="isd-mobile-input-section">
                            	
	                            <input id="mobile" type="tel" class="form-control required_field mobile-field-input" placeholder="Mobile Number"  name="mobile"  value="${user.mobile}" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="pemail">Email Address</label>
                            <input id="pemail" type="email" class="form-control required_field" placeholder="Email Address"  name="email" value="${user.email}" data-regtype="email" data-errormsg="*Please enter email address"/>
                        </div>
                        <div id="validationErrorMessage" class="has-error"><span class="help-block"></span></div>
                      
                       
                        <div class="form-group">
                            <button type="submit" id="btn_register" class="yt-btn btn-blue btn-block simulateSubmit" onclick="javascript:_gaq.push(['_trackEvent', 'Sign In / Sign Up', 'Main Sign Up Page', 'Register']);">Register</button>
                        </div>
                         <div class="form-group">
                            <input type="hidden" name="userid" value="${user.userid}"></input>
                              <input type="hidden" name="password" value="${user.password}"></input>
                              <input type="hidden" name="gender" value="${user.gender}"></input>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        


    </div>
</div>

<body>
