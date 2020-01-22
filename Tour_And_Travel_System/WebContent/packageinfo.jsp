
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
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
  }
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<div class="navbar-wrapper">
    <div class="container">
		<%@include file="index.jsp" %>
    </div>
</div>




<div>
	
	<h3 class="text-center slideanim">${packages.packagename}</h3>
	<br/>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-4 col-sm-4">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/${packages.image1}" alt="Chania" width="460" height="345">
      </div>

      <div class="item">
        <img src="images/${packages.image2}" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="images/${packages.image3}" alt="Flower" width="460" height="345">
      </div>

      <div class="item">
        <img src="images/${packages.image4}" alt="Flower" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
 </div>
			<div class="col-lg-6 col-md-4 col-sm-4">
				<div class="about-info">
					<h4 class="slideanim">We're The Best</h4>
					<hr>
					<div><h2>Starting Price : Rs.${packages.price}</h2><h4>(Per Person)</h4>
					<br/>
					    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" >BOOK NOW</button>
					 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    <script type="text/javascript">
    $(document).ready(function() {
        var max_fields      = 10; //maximum input boxes allowed
        var wrapper         = $(".input_fields_wrap"); //Fields wrapper
        var add_button      = $(".add_field_button"); //Add button ID
       
        var x = 1; //initlal text box count
        $(add_button).click(function(e){ //on add input button click
            e.preventDefault();
            if(x < max_fields){ //max input box allowed
                x++; //text box increment
                $(wrapper).append('<div><input type="text" name="nameofpassenger" class="form-control required_field"placeholder=" Full Name"/><a href="#" class="remove_field">Remove</a></div>'); //add input box
            }
        });
       
        $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
            e.preventDefault(); $(this).parent('div').remove(); x--;
        })
    });
    
   
    function validatedate()
    { var date = document.getElementById('date').value;
        var today =new Date();
         alert(today);
         var dd=today.getDate();
         var mm= today.getMonth();
         var yyyy=today.getFullYear();
         var today=dd+'/'+mm+'/'+yyyy;
   	  var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/; 
      // Match the date format through regular expression 
      if(date.match(dateformat)) {
          
          return true;;
        } 
      else 
          { 
          alert("Invalid date format!"); 
          date.focus();
           return false; 
          } 
     } 
    </script>
    <script>
	$(function() {
		$("#datepicker").datepicker({
			minDate : +1,
			maxDate : "+1M "
		});
	});
</script>
    <c:set var ="user" scope="session" value="${sessionScope.user}"></c:set>
      <!-- Modal content-->
    
      <div class="modal-content">
       <c:if test="${user!=null}"> 
        <div class="modal-header">
        
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Booking Details</h4>
        </div>
       <div class="panel-body">
                    <form name="register-form" id="registration-form" method="POST" action="paymentgateway" >
                        <div class="form-group">
                            <label for="fname">Name Of Passenger</label>
                         
                       <div class="input_fields_wrap">
                      <button class="add_field_button">Add More Passenger</button>
                    -   
                     <div><input type='text' id="fname" name="nameofpassenger" placeholder="FullName" class="form-control required_field" value="" size="50" data-errormsg="*Please enter first name"/></div>
                     
                     </div>
                    
                
                        <div class="form-group">
                            <label for="mobile">Departure Date</label>
                            <div class="isd-date-input-section">
                            	
	                            <input id="datepicker" type="date" class="form-control required_field date-field-input" placeholder="dd/mm/yyyy"  name="departuredate"  value="01/01/1947" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                      <div class="form-group">
                            <label for="mobile">No.of Passenger</label> 
                    <select class="form-control" id="sel1" class="days" name="numberofpassenger">
                           <option>1</option>
                                <option>2</option>
                               <option>3</option>
                         <option>4</option>
                           </select>
                         </div>
                          <div class="form-group">
                            <label for="mobile">Select Hotel</label> 
                    <select class="form-control" id="sel1" class="days" name="numberofpassenger">
                           <option>Two Star</option>
                                <option>Three Star</option>
                               <option>Four Star</option>
                         <option>Five Star</option>
                           </select>
                         </div>
   
                        
                        <div class="form-group">
                            <button type="submit" id="btn_register" class="yt-btn btn-blue btn-block simulateSubmit" onclick="return validatedate()">Pay Amount</button>
                        </div>
                        <input type="hidden" name ="packageid" value="${packages.packageid}">
                        <input type="hidden" name ="userid" value="${sessionScope.user.userid}">
                        <input type="hidden" name ="totalpayableprice" value="${packages.price}">
                    </form>
                    </div>
                </div>
               
                
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
       </c:if>
        <c:if test="${user==null}">
         <div class="modal-header">
          <div class="panel-body">
            <h2>Please<a href="log">  Login</a>  </h2>
           
       <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      </div>
         </c:if>
    </div>
  </div>
  
</div>
					
					<br/>
					<h4>From:  ${packages.departurecity} -> ${packages.destinationcity}</h4>
					<br/>
					<h4>Days(${packages.days}) and Nights (${packages.days+1})</h4>
				<ul class="nav navbar-nav">
                <li><a href="#section1"> <h4> Inclusion</h4></a></li>
                <li><a href="#section2"><h4>Exclusion</h4></a></li>
                <li><a href="#section3"><h4>Itinerary</h4></a></li>
          				
          
                </ul>
          
		</div>
			</div>
			
		</div>
	</div>


        
      <br/>
 <div class="col-lg-6 col-md-4 col-sm-4">
			<div id="section1" >
  
                    ${packages.inclusion}
                 </div>
             <div id="section2"  >
  
                    ${packages.exclusion}
             </div>
			
</div>     
<div id="section3" class="col-lg-6 col-md-4 col-sm-4" >
  <h1>Itinerary</h1>
   ${packages.itinerary}
 </div>
	
	
	
<div  class="col-lg-6 col-md-4 col-sm-4">
		
			
			
  <p>Copyright © 2016 Friends Tour And Travel, India. All rights reserved</p>
				<div class="social-icons wow fadeInUp animated" data-wow-delay=".9s">
				<ul>
					<li><a href="#"> </a></li>
					<li><a href="#" class="fb"> </a></li>
					<li><a href="#" class="in"> </a></li>
					<li><a href="#" class="dott"> </a></li>
				</ul>
			</div>
</div>
	
	
	
	
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	
</body>
</html>