<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Customer</title>
</head>

<body>
	<div style="width: 100%; height: 80px; background-color: rgba(0,200,0,255); text-align: center;">
		<h2 style="text-align: center; padding-top: 20px;">CUSTOMER RELATION MANAGEMENT</h2>
	</div>

	<div class="container">

		<h3 style="margin-top: 10%; margin-start: 5%;">Save customer</h3>
		<br><br>
		<form:form action="save" modelAttribute="customer" method="POST">
			<form:hidden path="id" />
			<div class="form-group row">
    			<label class="col-sm-2 col-form-label">First Name:</label>
    			<div class="col-sm-6">
      				<form:input path="fname" />
    			</div>
  			</div>
  			<div class="form-group row">
    			<label for="lastName" class="col-sm-2 col-form-label">Last Name:</label>
    			<div class="col-sm-6">
  					<form:input path="lname" />
    			</div>
  			</div>
  			<div class="form-group row">
    			<label for="emailID" class="col-sm-2 col-form-label">Email ID:</label>
    			<div class="col-sm-6">
  					<form:input path="email" />
    			</div>
  			</div>
  			<div class="form-group row">
    			<label class="col-sm-2 col-form-label"></label>
    			<div class="col-sm-6">
  					<input type="submit" value="Save" class="save" />
    			</div>
  			</div>
		</form:form>
		<a href="/StudentManagementDemo/customer/list">Back to list</a>
	</div>
</body>

</html>










