<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Persnoal Information</title>
<link rel="icon" type="image/jpg" href="images/policy.jpg">
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<img src="images/policy.jpg" alt="policy" style="width:20%">
 <p>  Welcome customer </p>
 <ul class="a">
 <li>your customer no is ${cusno} </li>
 <li>policy no is  ${policyNo} </li>
 <li>your policy information is ${policyInfo} </li></ul>

    <%--   <c:forEach var="lists" items="${lists}">
            <li>${lists}</li>
        </c:forEach> --%>
 
</body>
</html>