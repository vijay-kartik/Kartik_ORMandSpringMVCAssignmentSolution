<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<title>CRM</title>
</head>

<body>
	<div class="container">
		<h3 style="background-color: rgba(34, 242, 103); 
					text-align: center; 
					height: 80px; padding-top: 20px;">
					Customer Relationship Management
		</h3>
		<div id="empty" style="height: 80px"></div>
		<a href="/StudentManagementDemo/customer/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"
				onclick="window.location.href='showFormForAdd'; return false;"> Add Customer </a> 
		
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email ID</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customers}" var="customer">
					<tr>
						<td><c:out value="${customer.fname}" /></td>
						<td><c:out value="${customer.lname}" /></td>
						<td><c:out value="${customer.email}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/CRM/customer/showFormForUpdate?customerId=${customer.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/CRM/customer/delete?customerId=${customer.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">
								Delete </a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		
	

	</div>

</body>
</html>



