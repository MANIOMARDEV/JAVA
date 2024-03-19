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
<title>Save Travels</title>
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Save Travels</h1>
        <table class="table table-striped border">
		    <thead>
		        <tr>
		            <th scope="col" class="border">Expense</th>
		            <th scope="col" class="border">Vendor</th>
		            <th scope="col" class="border">Amount</th>
		            <th scope="col" class="border">Actions</th>
		        </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="expense" items="${expenses}">
			        <tr>
			        	<td class="border"><a href="/expenses/${expense.id}"><c:out value="${expense.expense}"/></a></td>
			        	<td class="border"><c:out value="${expense.vendor}"/></td>
			        	<td class="border"><fmt:formatNumber type="currency" value="${expense.amount}"/></td>
			        	<td>
			        		<div class="row justify-content-center">
				        		<a href="/expenses/edit/${expense.id}">edit</a> 
				        		<form class="col-2" action="/expenses/${expense.id}" method="post">
								    <input type="hidden" name="_method" value="delete">
								    <input class="btn btn-danger" type="submit" value="delete">
								</form>
			        		</div>
			        	</td>
			    	</tr>	    	
		    	</c:forEach>   		
		    </tbody>
		</table>
		<div class="m-5">
			<h2>Add an expense:</h2>
			<form:form action="/addExpense" method="post" modelAttribute="modelExpense" class="form">
				<div class="mb-3 inline-block">
					<form:label class="form-label" path="expense">Expense Name:</form:label>
					<form:errors class="text-danger" path="expense"/>
					<form:input type="text" path="expense" />
				</div>				
				<div class="mb-3">
					<form:label class="form-label" path="vendor">Vendor:</form:label>
					<form:errors class="text-danger" path="vendor"/>
					<form:input type="text" path="vendor" />
				</div>				
				<div class="mb-3">
					<form:label class="form-label" path="amount">Amount:</form:label>
					<form:errors class="text-danger" path="amount"/>
					<form:input type="number" step="0.01" min="0.01" path="amount" />
				</div>
				<div class="mb-3">
					<form:label class="form-label" path="description">Description:</form:label>
					<form:errors class="text-danger" path="description"/>
					<form:textarea type="textarea" path="description" />
				</div>
				<input class="btn btn-primary" type="submit" value="Submit"/>		
			</form:form>
		</div>
    </div>
</body>
</html>