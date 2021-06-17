<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<title>Register User</title>
</head>
<body>

<h1>User Registration</h1>
  <div class="col-md-8">

<a href="registeruser">Add User</a>

 <form action = "/registeruser" method = "POST">
	      <div class="form-group">
	         Customer Name: <input type = "text" class="form-control" placeholder="Customer Name" name = "customerName">
	         <br>
	       
	      
	         Customer Email:  <input type = "text" class="form-control" placeholder="Customer Email" name = "customerEmail" >
	         <br>
	         Customer Password:  <input type = "text" class="form-control" placeholder="Customer Password" name = "customerPassword" >
	         <br>
	         Customer Address:  <input type = "text" class="form-control" placeholder="Customer Address" name = "customerAddress" >
	         <br>
	         
	         
	         <button type = "submit" class="btn btn-primary" >Click to add</button>
	     </div>
		
		 </form>
</div>
</body>
</html>