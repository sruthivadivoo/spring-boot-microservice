 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>  
<script src="js/angularscript.js"></script>
<link rel="icon" type="image/jpg" href="images/policy.jpg">
  <link rel="stylesheet" href="css/style.css">
<title>Customer Persnoal Information</title>
</head>
<body ng-app="">
<img src="images/policy.jpg" alt="policy" style="width:20%">
<form action="getcustInfo" name="home">
<p><label for="fname">Enter Customer No</label><br></p>
<input type="text" name="custNo" ng-model="custNo" required>
<span ng-show="home.custNo.$invalid">Customer number cannot be empty.</span>
<br><br>
<br>
<input type="submit"><br>
</form>
</body>
</html>