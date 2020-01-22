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
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<div class="navbar-wrapper">
    <div class="container">
		<%@include file="index.jsp" %>
    </div>
</div>




 <div class="search">
        <div class="container">
          <div class="row">
            <div class="col-md-8 col-md-offset-2">
              <div class="form-section">
                <div class="row">
                    <form role="form" action="search" method="get">
                      <div class="col-md-5">
                        <div class="form-group">
                          <label class="sr-only" for="location">Leaving from</label>
                          <input type="text" class="form-control" id="location" placeholder="Leaving from" name="source">
                        </div>
                      </div>
                      <div class="col-md-5">
                        <div class="form-group">
                          <label class="sr-only" for="location">Going to</label>
                          <input type="text" class="form-control" id="location" placeholder="Going to" name="destination">
                        </div>
                      </div>
                      
                      <div class="col-md-2">
                        <button type="submit" class="btn btn-default btn-primary">Search</button>
                      </div>
                    </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    
   	<!--portfolio-->
	<div id="portfolio" class="portfolio">
		<div class="container">
			<h3 class="title wow fadeInDown animated" data-wow-delay=".5s">Perfect Holiday</h3>
			<div class="sap_tabs">			
				<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list wow fadeInUp animated" data-wow-delay=".7s">
						<li class="resp-tab-item"><span>All</span></li>
						  <li class="resp-tab-item"><span>Tours</span></li>

      
										
					</ul>	
					<div class="clearfix"> </div>	
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content">
							 <c:forEach var="statelist" items="${sessionScope.statelist}">    
							
								<div class="col-md-4 portfolio-grids">
									<a href="stateweb?action=${statelist.stateid}" >
										<img src="images/${statelist.image}" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5><c:out value ="${statelist.statename}"/></h5>
										</div>
									</a>
								</div>
									</c:forEach>
								<div class="clearfix"> </div>	
						</div>	
					</div>
						<div class="tab-1 resp-tab-content">
							 <c:forEach var="categorylist" items="${sessionScope.categorylist}"> 
								<div class="col-md-4 portfolio-grids">
									<a href="categoryweb?action=${categorylist.categoryid}">
										<img src="images/${categorylist.image}"class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>${categorylist.categoryname}</h5>
										</div>
									</a>
								</div>
							 </c:forEach>
							 <div class="clearfix"> </div>
							</div>	
						</div>
						<div class="tab-1 resp-tab-content">
							<div class="tab_img">
								<div class="col-md-8 portfolio-grids portfolio-two">
									<a class="wow zoomIn animated" data-wow-delay=".5s" href="images/g4.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g4.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>10</h5>
										</div>
									</a>
								</div>
								<div class="col-md-4 portfolio-grids">
									<a class="wow zoomIn animated" data-wow-delay=".7s" href="images/g3.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g3.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>Top Vacat</h5>
										</div>
									</a>
								</div>
								<div class="clearfix"> </div>
							</div>	
						</div>
						<div class="tab-1 resp-tab-content">
							<div class="tab_img">
								<div class="col-md-4 portfolio-grids">
									<a class="wow zoomIn animated" data-wow-delay=".5s" href="images/g1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g1.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>Top Vacatio</h5>
										</div>
									</a>
								</div>
								<div class="col-md-8 portfolio-grids portfolio-two">
									<a class="wow zoomIn animated" data-wow-delay=".7s" href="images/g6.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g6.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>Top Vacs</h5>
										</div>
									</a>
								</div>
								<div class="clearfix"> </div>
							</div>	
						</div>
						<div class="tab-1 resp-tab-content">
							<div class="tab_img">
								<div class="col-md-8 portfolio-grids portfolio-three">
									<a class="wow zoomIn animated" data-wow-delay=".5s" href="images/g7.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g7.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>Top celebration</h5>
										</div>
									</a>
								</div>
								<div class="clearfix"> </div>
							</div>	
						</div>
						<div class="tab-1 resp-tab-content">
							<div class="tab_img">
								<div class="col-md-8 portfolio-grids portfolio-three">
									<a class="wow zoomIn animated" data-wow-delay=".5s" href="images/g7.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
										<img src="images/g7.jpg" class="img-responsive zoom-img" alt=""/>
										<div class="b-wrapper">
											<h5>Top celebration</h5>
										</div>
									</a>
								</div>
								<div class="clearfix"> </div>
							</div>	
						</div>
					</div>						
				</div>
			</div>
		</div>
	</div>
	<!--//portfolio-->

	<div class="skills">
		<div class="container">
			<h3 class="title wow fadeInDown animated" data-wow-delay=".5s">Our Features</h3>
			<div class="skills-info">
				<div class="col-md-6 bar-left bar_group">
					<div class='bar_group__bar thin' label='Best Price ' value='150'></div>
					<div class='bar_group__bar thin' label='Enjoyment' value='250'></div>
					<div class='bar_group__bar thin' label='Trust & Safety' value='180'></div>
				</div>
				<div class="col-md-6 bar-right bar_group">
					<div class='bar_group__bar thin' label='Planning Tours' value='250'></div>
					<div class='bar_group__bar thin' label='Good Guidance' value='150'></div>
					<div class='bar_group__bar thin' label='Best Hotels' value='200'></div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//skills-->
	<!--services-->
	
	<!--//services -->
	<!--team-->
	<div class="team" id="team">
		<div class="container">
			<h3 class="title wow fadeInDown animated" data-wow-delay=".5s">Meet Our Team</h3>
			<div class="team-info">
				
				
				<!--//End-slider-script-->
				<div  id="top" class="callbacks_container">
					<ul class="rslides" id="slider4">
						<li>
							<div class="col-md-3 team-grids wow zoomInLeft animated" data-wow-delay=".5s">
								<h5>Mark Sophia</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipi est eligendi scing elit consectetur</p>
								<div class="social-icons">
									<ul>
										<li><a href="#" class="fb"> </a></li>
										<li><a href="#"> </a></li>
										<li><a href="#" class="in"> </a></li>
									</ul>
								</div>
								<div class="team-img">
									<img src="images/t1.jpg" alt="">
								</div>
							</div>
							<div class="col-md-3 team-grids team-mdl wow zoomInLeft animated" data-wow-delay=".9s">
								<h5>Michael amet</h5>
								<p>Consectetur adipi lorem ipsum dolor sit amet, est eligendi scing elit consectetur.</p>
								<div class="social-icons">
									<ul>
										<li><a href="#" class="fb"> </a></li>
										<li><a href="#"> </a></li>
										<li><a href="#" class="in"> </a></li>
									</ul>
								</div>
								<div class="team-img">
									<img src="images/t2.jpg" alt="">
								</div>
							</div>
							<div class="col-md-3 team-grids team-mdl1 wow zoomInRight animated" data-wow-delay=".7s">
								<h5>Daniel Nyari</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipi est eligendi scing elit consectetur.</p>
								<div class="social-icons">
									<ul>
										<li><a href="#" class="fb"> </a></li>
										<li><a href="#"> </a></li>
										<li><a href="#" class="in"> </a></li>
									</ul>
								</div>
								<div class="team-img">
									<img src="images/t3.jpg" alt="">
								</div>
							</div>
							<div class="col-md-3 team-grids wow zoomInRight animated" data-wow-delay=".5s">
								<h5>Alan Joshua</h5>
								<p>Eligendi scing elit lorem ipsum dolor sit amet, consectetur dolore magnam aliquam</p>
								<div class="social-icons">
									<ul>
										<li><a href="#" class="fb"> </a></li>
										<li><a href="#"> </a></li>
										<li><a href="#" class="in"> </a></li>
									</ul>
								</div>
								<div class="team-img">
									<img src="images/t4.jpg" alt="">
								</div>
							</div>
							<div class="clearfix"> </div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!--//team-->

	<!--twitter-->	
	
	<!--contact -->
	<div class="contact" id="contact">
		<div class="container">
			<h3 class="title wow fadeInDown animated" data-wow-delay=".5s">Contact Us</h3>
			<div class="contact-form">
				<p class="wow slideInDown animated" data-wow-delay=".5s">Sed ut turpis elit ullamcorper in auctor non, accumsan vel lacus nulla auctor cursus nunc. Maecenas ultricies dolor in urna tempus, id egestas erat finibus  interdum lectus eget scelerisque.</p>
				<form action="subenquiry" method="get">
					<div class="form-group">
                            <label for="fname">First Name</label>
                            <input type='text' id="fname" name="name" placeholder="First Name" class="form-control required_field" value="" size="50" data-errormsg="*Please enter first name"/>
                        </div>
					<div class="form-group">
                            <label for="pemail">Email Address</label>
                            <input id="pemail" type="email" class="form-control required_field" placeholder="Email Address"  name="email" value="" data-regtype="email" data-errormsg="*Please enter email address"/>
                        </div>
					<div class="form-group">
                            <label for="mobile">Mobile Number</label>
                            <div class="isd-mobile-input-section">
                            	
	                           
	                            <input id="mobile" type="tel" class="form-control required_field mobile-field-input" placeholder="Mobile Number"  name="mobile"  value="+91-" data-regtype="internationalphoneno" data-errormsg="*Please enter valid mobile number" maxlength="17"/>
                            </div>
                        </div>
                        <div class="form-group">
                      <textarea class="wow fadeInDown animated" data-wow-delay=".9s" placeholder="Message" required="" name="message"></textarea>
					     </div>
					<input type="submit" value="SUBMIT" >
				</form>
			</div>
		</div>
	</div>		
	<!--//contact -->
	<!--address-->
	<div class="address wow fadeInDown animated" data-wow-delay=".5s">
		<div class="container">
			<ul>
				<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>Friends Tours and Travels,Nanded CityNanded,Pune ,Maharashtra India</li>
				<li><i class="phon">Call Us :</i>  +91-888 853 9186</li>
				<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="newton2faraday@gmail.com">newton2faraday@gmail.com</a></li>
			</ul>
		</div>
	</div>
	<!--//address-->
	<!--map-->
	<div class="map">
		<ul class="faq">
			<li class="item1 wow fadeInDown animated" data-wow-delay=".5s"><a href="#">Interactive Route Map<span class="glyphicon glyphicon-menu-down"></span></a>
				<ul>
					<li class="subitem1">
						<iframe data-wow-delay=".5s" src="http://www.mapi.ie/create-google-map/map.php?width=100%&amp;height=600&amp;hl=en&amp;q=Nanded%20City%2C%20Nanded%2C%20Pune%2C%20Maharashtra%2C%20India+(Friends%20Tours%20and%20Travels)&amp;ie=UTF8&amp;t=&amp;z=14&amp;iwloc=A&amp;output=embed"></iframe>
					</li>										
				</ul>
			</li>
		</ul>
		
		<!-- script for tabs -->
	</div>
	<!--//map-->
	<!--footer-->
	<div class="footer">
		<div class="container">
			<h3 class="wow zoomIn animated" data-wow-delay=".5s"><a href="index.html">Vacation</a></h3>
			
  <p>Copyright © 2016 Friends Tours And Travels, India. All rights reserved</p>
				<div class="social-icons wow fadeInUp animated" data-wow-delay=".9s">
				<ul>
					<li><a href="#"> </a></li>
					<li><a href="#" class="fb"> </a></li>
					<li><a href="#" class="in"> </a></li>
					<li><a href="#" class="dott"> </a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--//footer-->	
	<script src="js/lightbox-plus-jquery.min.js"> </script>
	<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
				width: 'auto', //auto or any width like 600px
				fit: true   // 100% fit in a container
			});
		});		
	</script>
	<!--script-->
	<!--responsive slider-->
	<script src="js/responsiveslides.min.js"></script>
	<!--//responsive slider-->
	<!-- start-smooth-scrolling-->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>	
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!--//end-smooth-scrolling-->
	<!--bar-js-->
	<script src="js/bars.js"></script>
	<!--bar-js-->
	<!--animate-->
	<script src="js/wow.min.js"></script>
		<script>
			 new WOW().init();
		</script>
	<!--//end-animate-->
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {
		
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	
</body>
</html>