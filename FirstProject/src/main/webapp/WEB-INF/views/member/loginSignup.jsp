<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  
  <title>login</title>
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginSignupstyle.css">
</head>
<body>
<!-- partial:index.partial.html -->
<!-- LOGIN MODULE -->
        <div class="login" id="login">
            <div class="wrap">

                <!-- LOGIN FORM -->
                <div class="user">
                    <!-- ACTIONS
                    <div class="actions">
                        <a class="help" href="#signup-tab-content">Sign Up</a><a class="faq" href="#login-tab-content">Login</a>
                    </div>
                    -->
                    <!-- LOGO 
                    <div class="logo">
                        <a href="#"><img src="http://res.cloudinary.com/dpcloudinary/image/upload/v1506186248/logo.png" alt=""></a>
                    </div>-->
                    <!-- TOGGLE -->
                    <div id="toggle-wrap">
                        <div id="toggle-terms">
                            <div id="cross">
                                <span></span>
                                <span></span>
                            </div>
                        </div>
                    </div>
           
                    <!-- FORM -->
                    <div class="form-wrap">
                        <!-- TABS -->
                    	<div class="tabs">
                            <h3 class="login-tab"><a class="log-in active" href="#login-tab-content"><span>Login</span></a></h3>
                    		<h3 class="signup-tab"><a class="sign-up" href="#signup-tab-content"><span>Sign Up</span></a></h3>
                    	</div>
                        <!-- TABS CONTENT -->
                    	<div class="tabs-content">
                            <!-- TABS CONTENT LOGIN -->
                    		<div id="login-tab-content" class="active">
                    			<form class="login-form" action="Login" method="post">
                    			
                    				<input type="text" class="input" name="email" id="user_login" autocomplete="off" placeholder="Email" required="required">
                    				<input type="password" class="input" name="password" id="user_pass" autocomplete="off" placeholder="Password" required="required">
                    				<input type="checkbox" class="checkbox" checked id="remember_me">
                    				<label for="remember_me">Remember me</label>
                    				<input type="submit" class="button" value="Login">
                    				
                    			</form>
                    		
                    		</div>
                            <!-- TABS CONTENT SIGNUP -->
                    		<div id="signup-tab-content">
                    			<form class="signup-form" action="signUp" method="post">
                    				<input type="email" class="input" name="email" id="user_email" autocomplete="off" placeholder="Email" required="required">
                    				<input type="text" class="input" name="name" id="user_name" autocomplete="off" placeholder="Username" required="required">
                    				<input type="password" class="input" name="password" id="user_pw" autocomplete="off" placeholder="Password" required="required">
                    				<input type="submit" class="button" value="Sign Up">
                    			</form>
                   			</div>
                   		</div>
               		</div>
           		</div>
       		</div>
  		</div>
<!-- partial -->
  	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script><script  src="${pageContext.request.contextPath}/resources/js/loginSignupscript.js"></script>
	<script type="text/javascript">
			$(document).ready(function(){
				var msg = '${msg}';
				if(msg != ''){
					alert(msg);
				}
			});
		</script>
</body>
</html>
