<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Movie list Page</title>
<link type="text/css" rel="stylesheet" href="css/design.css"/>
<script src="js/validation.js"></script>
</head>
<body style="background-color: wheat">
	<div>
	<form action="MovieController" method="post" onsubmit="return validate()">
		Select Movie Name: <select name="movieNames">
			<option value="">Pls Select Movie Name</option>	
			<c:forEach var="movieName" items="${movieNames}">	
				<option value="${movieName}">"${movieName}"</option>
			</c:forEach>
		</select> <BR>
		<input type="submit" value="Search" name="action">
	</form>
	</div>
</body>
</html>