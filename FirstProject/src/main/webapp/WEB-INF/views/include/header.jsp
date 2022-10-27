<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>WeWeb</title>

    <!-- Favicon  -->
    <link rel="icon" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/core-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">

</head>
<body>
    <!-- Search Wrapper Area Start -->
    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="${pageContext.request.contextPath}/resources/img/core-img/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="home"><img src="${pageContext.request.contextPath}/resources/img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>

        <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <a href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/resources/img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/product/shop">Shop</a></li>
                </ul>
            </nav>
            <!-- Button Group
            <div class="amado-btn-group mt-30 mb-100">
                <a href="#" class="btn amado-btn mb-15">%Discount%</a>
                <a href="#" class="btn amado-btn active">New this week</a>
            </div> -->
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
				<!-- <a href="javascript:void(0)" onclick="loginSignup();" class="member-nav"><img src="${pageContext.request.contextPath}/resources/img/core-img/member.png" alt=""> Login</a>-->            
                <a href="#" class="search-nav"><img src="${pageContext.request.contextPath}/resources/img/core-img/search.png" alt=""> Search</a>
	            <c:choose>
	         	 	<c:when test="${sessionScope.user_email != null }">
			            <a class="collapse-item" href="${pageContext.request.contextPath}/member/mypage"><img src="${pageContext.request.contextPath}/resources/img/core-img/member.png" alt="">MyPage</a>
		            	<a class="collapse-item" href="${pageContext.request.contextPath}/member/logout"><img src="${pageContext.request.contextPath}/resources/img/core-img/logout.png" alt="">Logout</a>
		            	<a class="cart-nav" href="cart.jsp"><img src="${pageContext.request.contextPath}/resources/img/core-img/cart.png" alt=""> Cart <span>(0)</span></a>
	               		<a class="fav-nav" href="#"><img src="${pageContext.request.contextPath}/resources/img/core-img/favorites.png" alt=""> Favourite</a>
		            </c:when>
		            
		            <c:otherwise>
		            	<a href="${pageContext.request.contextPath}/member/loginSignup" class="member-nav"><img src="${pageContext.request.contextPath}/resources/img/core-img/member.png" alt=""> SignUp &amp; Login</a>
		            </c:otherwise>
	            </c:choose>
	            
	            <c:choose>
	            	<c:when test="${sessionScope.user_grade == 1 }">
	            		<a class="collapse-item" href="${pageContext.request.contextPath}/admin/adminpage"><img src="${pageContext.request.contextPath}/resources/img/core-img/admin.png" alt="">Admin</a>
	            	</c:when>
            	</c:choose>
            </div>
            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        
        </header>
<!-- loginSignup.html script 
<script type=text/javascript>
	function loginSignup(){
		$(login).modal('show')
	}
</script> -->
<!-- modal -->
<%-- <%@include file="../loginSignup.html"%>--%>      