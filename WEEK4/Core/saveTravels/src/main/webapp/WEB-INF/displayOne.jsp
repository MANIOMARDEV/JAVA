<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
    href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-between">
			<h1 class="mt-5">Expense Details</h1>
			<a href="/expenses" class="mt-5">Go Back</a>
		</div>
		<div class="fw-bold m-3">
			<p>Expense Name: <c:out value="${expense.expense}"/></p>
			<p>Expense Description: <c:out value="${expense.description}"/></p>
			<p>Vendor: <c:out value="${expense.vendor}"/></p>
			<p>Amount Spent: <fmt:formatNumber type="currency" value="${expense.amount}"/></p>
		</div>
	</div>
</body>
</html>