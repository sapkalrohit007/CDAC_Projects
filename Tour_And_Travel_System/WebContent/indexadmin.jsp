<style>

 body {
    background-image: url("images/admin1.jpg");
    background-color: #cccccc;
    background-size: 100%; 
}
</style>
<nav class="navbar navbar-inverse navbar-static-top cl-effect-20">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TOURS AND TRAVELS</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="index">Webview</a></li>
      <li><a href="adminindex.jsp">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tour Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="cate">Add Category</a></li>
          <li><a href="deletecate"> Delete Category</a></li>
         <li><a href="updatecate"> Update Category</a></li>
        

        </ul>
      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Stateinfo<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="stat">Add Stateinfo</a></li>
          <li><a href="deletestate">Remove Stateinfo</a></li>
         


        </ul>
      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Package <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="package">Add Package</a></li>
          <li><a href="removepack">Remove Package</a></li>
          <li><a href="viewpack">View Packages</a></li>
        </ul>
      </li>
      <li><a href="enquiry">View Enquiry</a></li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View Booking<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="adminindex.jsp">View Booking Request</a></li>
          <li><a href="bookingdetails">Booking Details</a></li>
        </ul>
      </li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">User<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="newusern">Add User</a></li>
          <li><a href="updateu">update User</a></li>
        </ul>
      </li>
     
    </ul>
<ul class="nav navbar-nav navbar-right">
    
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>Hello,${sessionScope.user.firstname}<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="MyPage">View Profile</a></li>
          <li><a href="adminindex.jsp">Administrator</a></li>
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
      </ul>
  </div>
</nav>
