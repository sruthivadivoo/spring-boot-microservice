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
  <link rel="stylesheet" href="css/newCustomer.css">
<title>Customer Persnoal Information</title>
</head>
<body ng-app="">
<!-- <div><img src="images/policy.jpg" alt="policy" style="width:20%"></div> -->
<form name="myForm" #newCust="ng-form" (ngSubmit)="createEmployee()">
<div>
<p><label for="fname">First name:</label></p>
<input type="text" name="firstName" ng-model="firstName" required>
<p><span ng-show="myForm.firstName.$touched && myForm.firstName.$invalid">First name is required.</span></p></div>
<div><p><label for="lname">Last name:</label></p>
<input type="text" name="lastName" ng-model="lastName" required>
<p><span ng-show="myForm.lastName.$touched && myForm.lastName.$invalid">Last name is required.</span></p></div>
<div><p><label for="age">Age:</label></p>
<input 
type="number" 
name="age" 
ng-model="age" 
required
ng-minlength="1">
<p><span ng-show="myForm.age.$touched && myForm.age.$invalid">Age is required.</span></p></div>
<div><p><label for="salary">Salary:</label></p>
<input type="number" name="sal" ng-model="sal" min="10000" required>
<p><span ng-show="myForm.sal.$touched && myForm.sal.$invalid">Salary is required.</span></p></div>
<div><p><label for="mob">Mobile Number:</label></p>
<input 
type="number" 
name="mob" 
ng-model="mob" 
required
ng-minlength="10" 
ng-maxlength="10"
/>
<p><span ng-show="myForm.mob.$touched && myForm.mob.$invalid">Mobile Number is required</span>
<span ng-show="myForm.mob.$error.minlength">Mobile Number must be ten digit</span>
</p></div>
<button ng-disabled="myForm.$invaalid">Submit</button>
</body>
</html>