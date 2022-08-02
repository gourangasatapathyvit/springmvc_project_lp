<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">


<style>
.btnspc {
	margin-bottom: 5px;
}

button {
	background-color: black
}

a {
	color: white;
	text-decoration: none;
}

body {
	width: 100%;
	height: 100vh;
}

.div1 {
	width: 100%;
}
</style>
<title>Document</title>
</head>

<body class="h6">
	<div class="btnbox text-right mt-2">
		<button type="button" class="btn btn-outline-danger">
			<a class="text-dark text-decoration-none" href="home.jsp">Logout</a>
		</button>
	</div>

	<div class="mt-3">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">first name</th>
					<th scope="col">last name</th>
					<th scope="col">DOB</th>
					<th scope="col">email</th>
					<th scope="col">contact number</th>
					<th scope="col">gender</th>
					<th scope="col">tobaco</th>
					<th scope="col">annual income</th>
					<th scope="col">policy type</th>
					<th scope="col">age of insurance</th>
					<th scope="col">status</th>
					<th scope="col">Action</th>
					<!-- 					<th scope="col">del Action</th> -->
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${proposalList}" var="list">
					<tr>
						<!-- <th scope="row">1</th> -->
						<td>${list.firstName }</td>
						<td>${list.lastName }</td>
						<td>${list.DOB }</td>
						<td>${list.email }</td>
						<td>${list.contactNumber }</td>
						<td>${list.gender }</td>
						<td>${list.consume }</td>
						<td>&#x20B9; ${list.annualIncome }</td>
						<td>${list.policyType }</td>
						<td>${list.ageOfInsurance }</td>
						<td>${list.action }</td>
						<td>

							<div class="btn-group">
								<a class="btn btn-primary dropdown-toggle" href="#"
									role="button" id="dropdownMenuLink" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false">action </a>

								<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
									<a class="dropdown-item" href="accept/${list.id}">Accept</a> <a
										class="dropdown-item" href="reject/${list.id}">Reject</a> <a
										class="dropdown-item" href="delete/${list.id}">delete</a>
								</div>
							</div>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>


	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>

</html>