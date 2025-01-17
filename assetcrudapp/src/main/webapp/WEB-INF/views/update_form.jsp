<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">
	<div class="row">
		<div class="col-md-6 offset-md-3">
		
		<h1 class="text-center mb-3">Change the asset details</h1>
		<form action="${pageContext.request.contextPath }/handle-asset" method="post">
		
		<input type="text" value="${asset.aId}" name="aId" />
			<div class="form-group">
				<label for="name">Asset Name</label> <input type="text"
				class="form-control" id="name" aria-describedby="emailHelp"
				name="name" placeholder="Enter the asset name here"
				value="${asset.name }"
				>
			
			</div>
			<div class="form-group">
			<label for="description">Asset Description</label>
			<textarea class="form-control" name="description" id="description"
				rows="5" placeholder="Enter asset description">${asset.description }
				</textarea>
			
			</div>
		
		<div class="form-group">
			<label for="price">Asset Price</label>
			<input type="text" placeholder="Enter Asset Price"
			name="price"
			class="form-control" id="price">
			
		</div>
		
		<div class="container text-center">
			<a href="${pageContext.request.contextPath }/"
				class="btn btn-outline-danger">Back</a>
				<button type="submit" class="btn btn-warning">Update</button>
		</div>
		
		</form>
		</div>
	</div>

</div>



</body>

</html>