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
  <title>Product Details | E-Shopper</title>
<%--  <link href="css/bootstrap.min.css" rel="stylesheet">--%>
<%--  <link href="css/font-awesome.min.css" rel="stylesheet">--%>
<%--  <link href="css/prettyPhoto.css" rel="stylesheet">--%>
<%--  <link href="css/price-range.css" rel="stylesheet">--%>
<%--  <link href="css/animate.css" rel="stylesheet">--%>
<%--  <link href="css/main_css.css" rel="stylesheet">--%>
<%--  <link href="css/responsive.css" rel="stylesheet">--%>
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

<section>
  <div class="container">
    <div class="row">
      <div class="col-sm-3">
        <div class="left-sidebar">
          <h2>Category</h2>
          <div class="panel-group category-products" id="accordian"><!--category-productsr-->
            <c:forEach items="${listC}" var="o">
              <div class="panel panel-default">
                <div class="panel-heading">
                  <h4 class="panel-title list-group-item "><a href="category?cid=${o.id}">${o.name}</a></h4>
                </div>
              </div>
            </c:forEach>

          </div><!--/category-productsr-->

          <div class="brands_products"><!--brands_products-->
            <h2>Brands</h2>
            <div class="brands-name">
              <ul class="nav nav-pills nav-stacked">
                <li><a href=""> <span class="pull-right">(50)</span>Acne</a></li>
                <li><a href=""> <span class="pull-right">(56)</span>Grüne Erde</a></li>
                <li><a href=""> <span class="pull-right">(27)</span>Albiro</a></li>
                <li><a href=""> <span class="pull-right">(32)</span>Ronhill</a></li>
                <li><a href=""> <span class="pull-right">(5)</span>Oddmolly</a></li>
                <li><a href=""> <span class="pull-right">(9)</span>Boudestijn</a></li>
                <li><a href=""> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
              </ul>
            </div>
          </div><!--/brands_products-->

        </div>
      </div>

      <div class="col-sm-9 padding-right">
        <div class="product-details"><!--product-details-->
          <div class="col-sm-5">
            <div class="view-product">
              <img src="${detail.image}" alt="" />
            </div>
            <div id="similar-product" class="carousel slide" data-ride="carousel">

              <!-- Wrapper for slides -->
              <div class="carousel-inner">
                <div class="item active">
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/167895997623887cdc76ccd123b6a8523464289b64_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/167895997623887cdc76ccd123b6a8523464289b64_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                </div>
                <div class="item">
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                </div>
                <div class="item">
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                  <a href=""><img src="https://img.ltwebstatic.com/images3_pi/2023/03/16/1678959958a8835be2a98b8bc1a64de079e554be07_thumbnail_220x293_thumbnail_80x.webp" alt=""></a>
                </div>

              </div>

              <!-- Controls -->
              <a class="left item-control" href="#similar-product" data-slide="prev">
                <i class="fa fa-angle-left"></i>
              </a>
              <a class="right item-control" href="#similar-product" data-slide="next">
                <i class="fa fa-angle-right"></i>
              </a>
            </div>

          </div>
          <div class="col-sm-7">
            <div class="product-information"><!--/product-information-->
              <img src="images/product-details/new.jpg" class="newarrival" alt="" />
              <h2>${detail.name}</h2>
              <img src="images/product-details/rating.png" alt="" />
              <span>
									<span>${detail.price}</span>
									<label>Số lượng mua:</label>
									<input type="text" value="3" />
									<button type="button" class="btn btn-fefault cart">
										<i class="fa fa-shopping-cart"></i>
										Add to cart
									</button>
								</span>
              <p><b>Trạng thái:</b> ${detail.availability}</p>
              <p><b>Lượng hàng trong kho:</b> ${detail.quantity}</p>
              <p><b>Thương hiệu:</b> ${detail.brand}</p>
              <p><b>Mô tả:</b> ${detail.description}</p>
            </div><!--/product-information-->
          </div>
        </div><!--/product-details-->

      </div>
    </div>
  </div>
</section>

<jsp:include page="footer.jsp"></jsp:include>


<script src="js/jquery.js"></script>
<script src="js/price-range.js"></script>
<script src="js/jquery.scrollUp.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/main.js"></script>
</body>
</html>