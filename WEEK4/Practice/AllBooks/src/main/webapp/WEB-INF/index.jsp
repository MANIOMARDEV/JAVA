<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
    href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Reading Books</title>
</head>
<body class=container>
    <h1 class="mt-5">All Books</h1>
    <table class="table mt-3">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Tile</th>
                <th scope="col">Language</th>
                <th scope="col">Number of Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
            <tr>
                <td><c:out value="${book.id}"/></td>
                <td><c:out value="${book.title}"/></td>
                <td><c:out value="${book.language}"/></td>
                <td><c:out value="${book.numberOfPages}"/></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>