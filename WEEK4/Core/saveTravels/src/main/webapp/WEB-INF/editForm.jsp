<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
    href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
</head>
<body>
<div class="container">
		<div class="d-flex justify-content-between">
			<h1 class="mt-5">Edit Expense</h1>
			<a href="/expenses" class="mt-5">Go Back</a>
		</div>
		<div class="m-5">
			<form:form action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense" class="form">
				<input type="hidden" name="_method" value="put"/>
				<div class="mb-3">
					<form:label class="form-label" path="expense">Expense Name:</form:label>
					<form:input type="text" path="expense" />
					<form:errors class="text-danger" path="expense"/>
				</div>				
				<div class="mb-3">
					<form:label class="form-label" path="vendor">Vendor:</form:label>
					<form:input type="text" path="vendor" />
					<form:errors class="text-danger" path="vendor"/>
				</div>				
				<div class="mb-3">
					<form:label class="form-label" path="amount">Amount:</form:label>
					<form:input type="text" path="amount" />
					<form:errors class="text-danger" path="amount"/>
				</div>
				<div class="mb-3">
					<form:label class="form-label" path="description">Description:</form:label>
					<form:textarea type="textarea" path="description" />
					<form:errors class="text-danger" path="description"/>
				</div>
				<input class="btn btn-primary" type="submit" value="Submit"/>		
			</form:form>
		</div>
	</div>
</body>
</html>