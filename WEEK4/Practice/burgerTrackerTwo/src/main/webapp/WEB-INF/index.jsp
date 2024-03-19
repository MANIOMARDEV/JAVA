<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
    href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Burger Tracker</title>
</head>
<body class="container">
    <h1 class="mt-4">Burger Tracker</h1>
    <table class="table table-strpied table-bordered">
        <thead>
            <tr>
                <th>Burger name</th>
                <th>Restaurant name</th>
                <th>Rating (out of 5)</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="burger" items="${burgers}">
            <tr>
                <td><c:out value="${burger.name}"/></td>
                <td><c:out value="${burger.restaurant}"/></td>
                <td><c:out value="${burger.rating}"/></td>
                <td><a href="/edit/${burger.id}">Edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <h2>Add new Burger</h2>
    <form:form action="/addBurger" mode="post" modelAttribute="burger">
        <div>
            <form:label path="name">Burger Name:</form:label>
            <br>
            <form:errors path="name" class="text-danger"/>
            <form:input path="name" style="width:250px;"/>
        </div>
              <div>
            <form:label path="restaurant">Restaurant Name:</form:label>
            <br>
            <form:errors path="restaurant" class="text-danger"/>
            <form:input path="restaurant" style="width:250px;"/>
        </div>      <div>
            <form:label path="rating">Rating:</form:label>
            <br>
            <form:errors path="rating" class="text-danger"/>
            <form:input path="rating" style="width:250px;"/>
        </div>      <div>
            <form:label path="notes">Notes:</form:label>
            <br>
            <form:errors path="notes" class="text-danger"/>
            <form:textarea path="notes" rows="3" style="width:250px;"/>
        </div>
        <div>
            <input type="submit" value="Submit" class="btn btn-primary"/>
        </div>
    </form:form>
</body>
</html>