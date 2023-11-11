
<%@page buffer="8192kb" autoFlush="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Login | E-Shopper</title>
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
  <link rel="shortcut icon" href="images/ico/favicon.ico">
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
  <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
  <style>
    <%@include file="css/main_css.css"%>
    <%@include file="css/bootstrap.min.css"%>
    <%@include file="css/font-awesome.min.css"%>
    <%@include file="css/prettyPhoto.css"%>
    <%@include file="css/price-range.css"%>
    <%@include file="css/animate.css"%>
    <%@include file="css/responsive.css"%>

  </style>
</head><!--/head-->

<body>
<jsp:include page="header.jsp"></jsp:include>
<section id="form"><!--form-->
  <div class="container">
    <div class="row">
      <div class="col-sm-4 col-sm-offset-1">
        <div class="login-form"><!--login form-->
          <h2>Login to your account</h2>
          <form action="login" method="get">
            <%--  xem lại phương thức   method       --%>

              <p class="text-danger">${mess}</p>

            <input name="user" type="text" placeholder="Username" />
            <input name="pass" type="password" placeholder="Password" />
            <span>
								<input type="checkbox" class="checkbox">
								Keep me signed in
							</span>
            <button type="submit" class="btn btn-default">Login</button>
          </form>
        </div><!--/login form-->
      </div>
      <div class="col-sm-1">
        <h2 class="or">OR</h2>
      </div>
      <div class="col-sm-4">
        <div class="signup-form"><!--sign up form-->
          <h2>New User Signup!</h2>
          <form action="signup" method="get">
            <input name="fullname" type="text" placeholder="Fullname"/>
            <input name="email" type="email" placeholder="Email"/>
            <input name="user" type="text" placeholder="Username"/>
            <input name="pass" type="password" placeholder="Password"/>
            <input name="repass" type="password" placeholder="Reapeat Password"/>
            <input name="phone" type="text" placeholder="Phone"/>
            <button type="submit" class="btn btn-default">Signup</button>
          </form>
        </div><!--/sign up form-->
      </div>
    </div>
  </div>
</section><!--/form-->
<jsp:include page="footer.jsp"></jsp:include>
<script src="js/jquery.js"></script>
<script src="js/price-range.js"></script>
<script src="js/jquery.scrollUp.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/main.js"></script>
</body>
</html>