<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>

	<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css">
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
		
		aside ul li { text-align:center; margin-bottom:10px; }
		aside ul li a { display:block; width:100%; padding:10px 0;}
		aside ul li a:hover { background:#eee; }
		
	</style>
	
	
	<style>
	.inputArea { margin:10px 0; }
	select { width:100px; }
	label { display:inline-block; width:300dpx; padding:5px; }
	label[for='gdsDes'] { display:block; }
	input { width:150px; }
	textarea#gdsDes { width:400px; height:180px; }
	</style>
	
</head>
<body>
<div id="root">
<header id="header">
	<div id="header_box">
		<h2 style="border-bottom: 3px solid #fbb710">상품 등록</h2>
	</div>
</header>
	
	<form>
	<div class="inputArea">
		<label for="passwordCheck">현재 비밀번호</label>
		<input type="password" id="passwordCheck" name="passwordCheck" />
	</div>
	</form>
	<form class="newPW" name="newPW" id="newPW" role="form" method="post" autocomplete="off" action="newPassword">
	<c:choose>
		<c:when test="${sessionScope.user_pw == param.passwordCheck}">
	    	<input type="password" class="input" name="password" id="user_pw" autocomplete="off" placeholder="비밀번호" required="required">
			<input type="password" class="input" id="verifyPw" autocomplete="off" placeholder="비밀번호 확인" required="required">
    		<input type="button" class="button" value="확인" onclick="newPassword()">  
          </c:when>
           
    </c:choose>
	</form>
		<a href="${pageContext.request.contextPath}/member/mypage">취소</a>
</div>
</body>
<script>
function newPassword(){
	if($("#user_pw").val() != $("#verifyPw").val()){
		alert("비밀번호가 일치하지 않습니다.")
		$("#pwCheck").focus();
	}else{
		$("#newPW").submit();	
	}	
		
}


</script>