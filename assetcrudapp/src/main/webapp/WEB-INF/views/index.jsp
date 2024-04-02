

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<html>

<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>

<div class="container mt-3">
	<div class="row">
		<div class="col-md-12">
			<h1 class="text-center mb-3" style="color:#333333;">Welcome to Asset App</h1><br>
			
			<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Asset Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${assets }" var="a">
    <tr>
      <th scope="row">${a.aId }</th>
      <td>${a.name }</td>
      <td>${a.description }</td>
      <td class="font-weight-bold">&#x20B9; ${a.price }</td>
      <td>
      	<a href="delete/${a.aId }"><i class="fa fa-trash" aria-hidden="true"></i></a>
      	&nbsp;&nbsp;&nbsp;&nbsp;
      	<a href="update/${a.aId }"><i class="fas fa-pen-nib" aria-hidden="true"></i></a>
      
      </td>
    </tr>
 </c:forEach>
  </tbody>
</table>
			
		
		<div class="container text-center">
		<a href="add-asset" class="btn btn-outline-success">Add Asset</a>		
		</div>
		
	</div>		
	</div>
</div>
</body>
</html>
