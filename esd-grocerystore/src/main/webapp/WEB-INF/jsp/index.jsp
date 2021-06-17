<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grocery Store</title>
</head>
<body>
<h1>Grocery Store App</h1>

<a href="addProduct">Add Product</a>

<h1>Using POST Method to Save Data to the Database</h1>
		
	      <form action = "/addProduct" method = "POST">
	      <div class="form-group">
	         Product Name: <input type = "text" class="form-control" placeholder="Product Name" name = "productName">
	         <br>
	       
	       <!-- <div class="form-group"> -->
	         Product Descriptopn:  <input type = "text" class="form-control" placeholder="Student Course" name = "productDescription" />
	         <br>
	         Product Price:  <input type = "text" class="form-control" placeholder="Student Course" name = "productPrice" />
	         <br>
	         Product Stock:  <input type = "text" class="form-control" placeholder="Student Course" name = "productStock" />
	         <br>
	         
	         
	         <button type = "submit" class="btn btn-primary" >Click to add</button>
	     </div>
		
		 </form>
		 
<h1>Using Get method to find product by ID</h1>
		<form action="selectProduct" method  = "GET">
		<div class="form-group">
		Product ID: <input type = "text" class ="form-control" placeholder = "Product ID" name = "id">
		<button type = "submit" class = "btn btn-primary">Click to search</button>
		</div>
		
	${productfound}	
	</form>
<br>
<h1>Using Get method to find product by name</h1>
		<form action="searchProduct" method  = "GET">
		<div class="form-group">
		Product Name: <input type = "text" class ="form-control" placeholder = "Product Name" name = "name">
		<button type = "submit" class = "btn btn-primary">Click to search</button>
		</div>
		
	${productfoundbyname}	
	</form>
<br>
<table class ="table">
      <thead>
      
      <tr>
      	<th> Name </th>
      	<th> Description </th>
      	
      </tr>
      </thead>
      <tbody>
      <c:forEach var = "productsfound" items="${productsfound}">
         <tr>
	         <td><c:out value ="${ productsfound.productName}" /> </td>
	         <td> <c:out value ="${ productsfound.productDescription}" /></td>
 		</tr>
      
      </c:forEach>
      </tbody>
      </table>

<a href="updateBook">Update Book</a>
<br>
<a href="deleteBook">Delete Book</a>
<a href="productDetails">Show Products</a>
<form action="productDetails" method = "GET">
<table class ="table">
      <thead>
      
      <tr>
      	<th> Name </th>
      	<th> Description </th>
      	
      </tr>
      </thead>
      <tbody>
      <c:forEach var = "product" items="${products}">
         <tr>
	         <td><c:out value ="${ product.productName}" /> </td>
	         <td> <c:out value ="${ product.productDescription}" /></td>
	         <td><a type="button" class="btn btn-warning" href="/deleteProduct?id=${ product.productId}">Delete ${product.productId}</a></td>
         <td><a type="button" class="btn btn-success" href="/selectProduct?id=${ product.productId}">Select ${product.productId}</a></td>
         </tr>
      
      </c:forEach>
      </tbody>
      </table>
 </form>     
      
</body>
</html>