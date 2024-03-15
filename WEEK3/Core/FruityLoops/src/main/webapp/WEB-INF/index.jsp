<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Store</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>

<table>
	<tr>
		<th>Name</th>
		<th>Price</th>
	</tr>
 	<c:forEach var="onefruit" items="${fruityloops}">
		<tr>
			<td>${onefruit.name}</td>
			<td>${onefruit.price}</td>
		</tr>
	</c:forEach>
</table>


    
</body>
</html>