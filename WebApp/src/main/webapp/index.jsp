<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html ng-app="myApp">
  <head>  
    <title>AngularJS $http Example</title>  
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }
 
      .email.ng-valid {
          background-color: lightgreen;
      }
      .email.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .email.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }
 
    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/view/css/app.css' />" rel="stylesheet"></link>
  </head>
 <body  class="ng-cloak">
    <h1>Spring 3.2.3 MVC web service</h1>

     

    <h3>Your message is : ${msg}</h3>
   <%@ include file ="userRegistration.jsp"%>
    
    
    
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='view/js/common/app.js' />"></script>
      <script src="<c:url value='view/js/common/controller.js' />"></script>
      <script src="<c:url value='view/js/common/factory.js' />"></script>
<%--       <script src="<c:url value='/static/js/service/user_service.js' />"></script> --%>
<%--       <script src="<c:url value='/static/js/controller/user_controller.js' />"></script> --%>
 </body>
</html>
