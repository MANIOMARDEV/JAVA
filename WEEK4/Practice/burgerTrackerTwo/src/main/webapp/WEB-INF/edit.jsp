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
    <h2>Edit Burger</h2>
    <form:form action="/edit/${burger.id}" mode="put" modelAttribute="burger">
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
        </div>
        <div>
            <form:label path="rating">Rating:</form:label>
            <br>
            <form:errors path="rating" class="text-danger"/>
            <form:input path="rating" style="width:250px;"/>
        </div>
        <div>
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