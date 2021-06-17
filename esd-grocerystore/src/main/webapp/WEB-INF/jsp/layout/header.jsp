<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="java.util.*"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>1-2-3 Grocery</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
 <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-primary">
  <a class="navbar-brand" href="#">Logo</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="<%=request.getContextPath() %>/home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/productDetails">List Products</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/addProduct">Add Product</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/cart">Cart</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/checkout" >Checkout</a>
      </li>
      
      
    </ul>
    <div class="text-success"> ${userName }</div>
 
    <form class="form-inline my-2 my-lg-0" action="/searchProduct" method="POST">
      <input class="form-control mr-sm-2" type="text" name="sName" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
  
</nav>
<div class="jumbotron text-center">
  <h1>Welcome ${userName } to 1-2-3 Online Grocery System.</h1>
  <p>You can do your online shopping here.</p> 
</div>