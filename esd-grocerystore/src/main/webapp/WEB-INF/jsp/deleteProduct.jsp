<%@ include file="layout/header.jsp"%>

<title>Delete Product</title>
</head>
<body>

 <fieldset><legend class = "legend">Delete Product</legend>
       <div style = "font-weight:bold;font-size:101%;">
         <c:out value="Are you sure you want to delete product with Id ${param.id}?"/>
       </div>
       <p><a href="${pageContext.request.contextPath}/productDetails">Cancel</a>&nbsp;&nbsp;|&nbsp;&nbsp;
          <a href="${pageContext.request.contextPath}/reallyDelete?id=${param.id}">Delete the product</a></p>
   </fieldset>
</body>