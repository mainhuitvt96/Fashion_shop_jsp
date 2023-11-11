
<%@page buffer="8192kb" autoFlush="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
