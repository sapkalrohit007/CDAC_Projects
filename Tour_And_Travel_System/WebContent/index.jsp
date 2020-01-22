<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TOUR AND TRAVEL</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="Webindex.jsp">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Tours <span class="caret"></span></a>
        <ul class="dropdown-menu">
        
        
         <c:forEach var="category" items="${categorylist}">
		    
          <li><a href="categoryweb?action=${category.categoryid}">${category.categoryname}</a></li>

         </c:forEach>
         
 
        </ul>
      </li>
    
      <!-- <li><a href="#">Gallery</a></li> -->
      <li><a href="#contact">ContactUs</a></li>
    </ul>
<ul class="nav navbar-nav navbar-right">

<c:set var ="user" scope="session" value="${sessionScope.user}"></c:set>
 <c:if test="${user!=null}">
 <ul class="nav navbar-nav navbar-right">
    
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>Hello,${sessionScope.user.firstname}<span class="caret"></span></a>
          <ul class="dropdown-menu">
          <!-- <li><a href="MyPage">View Profile</a></li>
           <li><a href="adminindex.jsp">Administrator</a></li> -->
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
    </ul>
    </li>
 </ul>
  </c:if>
  <c:if test="${user==null}">
        <li><a href="sign"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="log"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
  </div>
   </c:if>
   <c:if test="admin">
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>Hello,${sessionScope.user.firstname}<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="MyPage">View Profile</a></li>
          <li><a href="adminindex.jsp">Administrator</a></li>
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
      </ul>
  </div>
   </c:if>
   


