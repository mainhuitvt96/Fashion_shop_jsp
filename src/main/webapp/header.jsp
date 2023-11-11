<%@page buffer="8192kb" autoFlush="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="header"><!--header-->
  <div class="header_top"><!--header_top-->
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          <div class="contactinfo">
            <ul class="nav nav-pills">
              <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
              <li><a href="#"><i class="fa fa-envelope"></i> info@domain.com</a></li>
            </ul>
          </div>
        </div>
        <div class="col-sm-6">
          <div class="social-icons pull-right">
            <ul class="nav navbar-nav">
              <li><a href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
              <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
              <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div><!--/header_top-->

  <div class="header-middle"><!--header-middle-->
    <div class="container">
      <div class="row">
        <div class="col-sm-4">
          <div class="logo pull-left">
            <img src="https://media.discordapp.net/attachments/1117271203367886871/1117573635931123864/logo.png?width=173&height=48" alt="" />
          </div>
          <div class="btn-group pull-right">
            <div class="btn-group">
              <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                USA
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu">
                <li><a href="#">Canada</a></li>
                <li><a href="#">UK</a></li>
              </ul>
            </div>

            <div class="btn-group">
              <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                DOLLAR
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu">
                <li><a href="#">Canadian Dollar</a></li>
                <li><a href="#">Pound</a></li>
              </ul>
            </div>
          </div>
        </div>
        <div class="col-sm-8">
          <div class="shop-menu pull-right">
            <ul class="nav navbar-nav">
              <li><a href="#"><i class="fa fa-user"></i> Account</a></li>
              <li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li>
              <li><a href="html/checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li>
              <li><a href="html/cart.html"><i class="fa fa-shopping-cart"></i> Cart</a></li>
              <c:if test="${sessionScope.acc != null}">
                <li><a href="logout"><i class="fa fa-outdent"></i> Logout</a></li>
              </c:if>
              <c:if test="${sessionScope.acc == null}">
                <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
              </c:if>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div><!--/header-middle-->

  <div class="header-bottom"><!--header-bottom-->
    <div class="container">
      <div class="row">
        <div class="col-sm-9">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <div class="mainmenu pull-left">
            <ul class="nav navbar-nav collapse navbar-collapse">
              <li><a href="home" class="active">Home</a></li>
              <li class="dropdown"><a href="/product">Shop<i class="fa fa-angle-down"></i></a>
                <ul role="menu" class="sub-menu">
                  <li><a href="product.jsp">Products</a></li>
                  <li><a href="html/checkout.html">Checkout</a></li>
                  <li><a href="html/cart.html">Cart</a></li>
                </ul>
              </li>
              <li class="dropdown"><a href="#">Blog<i class="fa fa-angle-down"></i></a>
                <ul role="menu" class="sub-menu">
                  <li><a href="https://www.elle.vn/the-gioi-thoi-trang/blogger-thoi-trang-chau-a-the-he-moi">Blog List</a></li>
                  <li><a href="https://zofal.vn/blog-thoi-trang/">ZOFAL</a></li>
                </ul>
              </li>
              <c:if test="${sessionScope.acc.roleId == 2}">
                <li><a href="#">Manager Product</a></li>
              </c:if>
              <c:if test="${sessionScope.acc.roleId == 1}">
                <li><a href="manager">Manager Product</a></li>
                <li><a href="#">Manager Account</a></li>
              </c:if>
            </ul>
          </div>
        </div>
        <div class="col-sm-3">
<%--          <div class="search_box pull-right">--%>
<%--            <input name="txt" type="text" placeholder="Search"/>--%>
<%--          </div>--%>
              <form action="search" method="get" class="searchform">
                <input name="txt" value="${txtS}" type="text" placeholder="Search" />
                <button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
              </form>
        </div>
      </div>
    </div>
  </div><!--/header-bottom-->
</header><!--/header-->
