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

<%@include file="index.jsp" %>
<div id="main-container-center" class="container my-signin">
    <div class="row">

        <div class="col-md-4 col-md-offset-4 col-bdr-center">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>Create Your Account</h3>
                    
                </div>
                <div class="panel-body">
                    <form name="register-form" id="registration-form" method="P0ST" action="signup" onsubmit="return Validate()">
                        <div class="form-group">
                            <label for="fname">First Name</label>
                            <input type='text' id="fname" name="firstname" placeholder="First Name" class="form-control required_field" value="" size="50" data-errormsg="*Please enter first name"/>
                        </div>
                        <div class="form-group">
                            <label for="lname">Last Name</label>
                            <input type="text" class="form-control required_field" placeholder="Last Name"  id="lname" name="lastname"  value="" size="50" data-regtype="validLastName" data-errormsg="*Please enter last name"/>
                        </div>
                         <div class="form-group">
                            <label for="gender">Gender</label>
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
                            <label for="offers">
                                <input type="checkbox" value="true" class="check" name="offers"  id="offers" checked="true" onclick="offersCheck(this)"/>
                                I would like to be kept informed of special promotions and offers by us.
                            </label>
                        </div>
                        <div class="form-group">
                            <button type="submit" id="btn_register" class="yt-btn btn-blue btn-block simulateSubmit" >Register</button>
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
  <script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("cpassword").value;
        var firstname= document.getElementById("fname").value;
        var lastname= document.getElementById("lname").value
    	var email = document.getElementById('pemail').value;
        var mobile = document.getElementById('mobile').value;
        var birthdate = document.getElementById('birthdate').value;
        var passwordlength = password.length; 
      
      
     
    
      

        if(allLetterf(firstname))  
        {  
         	if(allLetterl(lastname))  
         	{   
          		if(validatedate(birthdate))  
        		{  
        			if(phonenumber(mobile))  
        			{  
        				if(ValidateEmail(email))  
       					 {  
     					   if(passwordvalidation(password))  
        					{  
           					 if( confirmpasswordValidate(password,confirmPassword))
                				{
           					 
                				}
         					}  
        				 }   
        			}  
       		   }   
        	}  
        }  
        
  			return false;

 		}  

    function allLetterf(firstname)  
    {     var letters = /^[A-Za-z]+$/;
     
    	if(firstname.match(letters))  
    	{  
    	return true;  
    	}  
    else  
    {  
    alert('First Name must have alphabet characters only');  
     
    return false;  
    }  
    }  
    function allLetterl(lastname)  
    {     var letters = /^[A-Za-z]+$/;
     
    if(lastname.match(letters))  
    {  
    return true;  
    }  
    else  
    {  
    alert('Last Name must have alphabet characters only');  
     
    return false;  
    }  
    }  
    
    function phonenumber(mobile)  
    {  
    	   var phoneno = /^\+?([0-9]{2})\)?[-. ]?([0-9]{10})$/;  
    	  if((mobile.match(phoneno)))  
    	    {  
    	      return true;  
    	    }  
    	    else  
    	        {  
    	        alert("Mobile Number Is Not Correct"); 
    	       
    	        return false;  
    	        }  
    }  
    
    function validatedate(birthdate)
     { 
    	  var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/; 
       // Match the date format through regular expression 
       if(birthdate.match(dateformat)) {
           return true;;
         } 
       else 
           { 
           alert("Invalid date format!"); 
           
            return false; 
           } 
      } 

    function ValidateEmail(email)  
    {  
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; 
  
	    if(email.match(mailformat))  
	    {  
	   			 return true;  
	    }  
	    else  
	    {  
	    alert("You have entered an invalid email address!");  
	    
	    return false;  
	    }  
    }
 function passwordvalidation(password)  
    {  
	  var passwordpattern= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{4,15}$/ ;
    if (password.match(passwordpattern))  
    {  
     return true;  
      
    } 
    else{
    	 alert("4 to 15 characters which contain at least one lowercase letter, one uppercase letter, one numeric digit, and one special character")       
         
    	 return false;
        } 
   
    }  

 function confirmpasswordValidate(password,confirmPassword) 
 {
      if (password != confirmPassword) 
          {
         alert("Passwords do not match.");
         return false;
         }
     else  
    {  
    alert(' Succesfully Registered !!! Thank you for registration !!  Now You can login !!');  
    	
     return true;  
    }  
  }

 </script>
</body>
</html>

