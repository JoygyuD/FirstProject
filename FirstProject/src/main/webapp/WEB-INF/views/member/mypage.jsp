<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>
	<meta charset="UTF-8">
	
	<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css">
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
		
	<style>
		body { font-family:'맑은 고딕', verdana; padding:0; margin:0; }
		ul { padding:0; margin:0; list-style:none;  }
	 
		div#root { width:90%; margin:0 auto; }
		
		header#header { font-size:60px; padding:20px 0; }
		header#header h1 a { color:#000; font-weight:bold; }
		
		nav#nav { padding:10px; text-align:right; }
		nav#nav ul li { display:inline-block; margin-left:10px; }
	 
	 	section#container { padding:20px 0; border-top:2px solid #eee; border-bottom:2px solid #eee; }
		section#container::after { content:""; display:block; clear:both; }
		aside { float:left; width:200px; }
		div#container_box { float:right; width:calc(100% - 200px - 20px); }
		
		aside ul li { text-align:center; margin-bottom:10px; width: 600px}
		aside ul li a { display:block; width:100%; padding:10px 0;}
		aside ul li a:hover { background:#eee; }
		
	</style>
	
	
	<style>
	.inputArea { margin:10px 0; }
	select { width:100px; }
	label { display:inline-block; width:100px; padding:5px; }
	label[for='gdsDes'] { display:block; }
	input { width:150px; }
	textarea#gdsDes { width:400px; height:180px; }
	</style>
	
</head>
<body>
<div id="root">
	<header id="header">
		<div id="header_box">
			<h2 style="border-bottom: 3px solid #fbb710">MyPage</h2>
		</div>
	</header>
	
	<nav id="nav">
		<div id="nav_box">
		</div>
	</nav>
	
	<section id="container">
		<aside>
			<ul>
				<li><strong>Email:</strong> ${sessionScope.user_email}</li>
				<li><strong>이름: </strong> ${sessionScope.user_name}</li>
				<li><strong>생성일자: </strong> <fmt:formatDate value="${sessionScope.user_regdate }" pattern="yyyy-MM-dd"/></li>
				<li><a href="${pageContext.request.contextPath}/member/memberModify">비밀번호 수정</a></li>
				<li><a href="${pageContext.request.contextPath}/member/deleteMember" onclick="return confirm('계정을 삭제하시겠습니까?');">계정 삭제</a></li>
				<li><a href="${pageContext.request.contextPath}">Home</a></li>
			</ul>
		</aside>
		
	</section>

</div>

</body>
