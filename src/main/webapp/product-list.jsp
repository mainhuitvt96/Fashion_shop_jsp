
<%@page buffer="8192kb" autoFlush="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="features_items"><!--features_items-->
  <h2 class="title text-center">Features Items</h2>
  <c:forEach items="${listP}" var="o">
    <div class="col-sm-4">
      <div class="product-image-wrapper">
        <div class="single-products">
          <div class="productinfo text-center">
            <img src="${o.image}" alt="${o.image}" />
            <h2>${o.price}</h2>
            <p>${o.name}</p>
            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
          </div>
          <div class="product-overlay">
            <div class="overlay-content">
              <h2>${o.price}</h2>
              <p><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></p>
              <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
            </div>
          </div>
        </div>
        <div class="choose">
          <ul class="nav nav-pills nav-justified">
            <li><a href=""><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
            <li><a href=""><i class="fa fa-plus-square"></i>Add to compare</a></li>
          </ul>
        </div>
      </div>
    </div>
  </c:forEach>


  <ul class="pagination">
    <li class="active"><a href="">1</a></li>
    <li><a href="">2</a></li>
    <li><a href="">3</a></li>
    <li><a href="">&raquo;</a></li>
  </ul>
</div><!--features_items-->