<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Document</title>
</head>

<body
	class="w-100 h-100 d-flex align-items-center justify-content-center">

	<div class="w-50">

		<div class="container mb-5 ">
			<form action="proposalprocess" method="post">
				<div class="form-group mt-5">
					<label for="firstname">first name</label> <input type="text"
						class="form-control" id="firstname" aria-describedby="firstname"
						placeholder="Enter first name" name="firstName">
				</div>

				<div class="form-group mt-5">
					<label for="lastname">last name</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="lastname" placeholder="Enter last name"
						name="lastName">
				</div>
				<div class="form-group mt-5">
					<label for="inputDate">DOB</label> <input type="date"
						class="form-control" name="DOB" id="inputDate"
						aria-describedby="inputDate">
				</div>


				<div class="form-group mt-5">
					<label for="exampleInputEmail1">enter email</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						aria-describedby="exampleInputEmail1" placeholder="enter email"
						name="email">
				</div>
				<div class="form-group mt-5">
					<label for="exampleInputEmail1">phone number</label> <input
						type="number" class="form-control" id="exampleInputEmail1"
						aria-describedby="firstname" placeholder="Enter phone number"
						name="contactNumber">
				</div>
				<div class="form-group mt-5">
					<h3>Gender</h3>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline1" name="gender"
							class="custom-control-input form-control" value="male"> <label
							class="custom-control-label" for="customRadioInline1">male</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline2" name="gender"
							class="custom-control-input form-control" value="female">
						<label class="custom-control-label" for="customRadioInline2">female</label>
					</div>

					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline3" name="gender"
							class="custom-control-input form-control" value="transgender">
						<label class="custom-control-label" for="customRadioInline3">transgender</label>
					</div>
				</div>

<!-- 				<div class="form-group mt-5">
					<h3>Consume Tobaco</h3>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline11" name="isConsume"
							class="custom-control-input form-control" value="yes"> <label
							class="custom-control-label" for="customRadioInline12">yes</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline22" name="isConsume"
							class="custom-control-input form-control" value="no">
						<label class="custom-control-label" for="customRadioInline22">no</label>
					</div>

				</div> -->

				<div class="form-group mt-5">
					<h3>Consume Tobaco</h3>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline4" name="consume"
							class="custom-control-input form-control" value="yes"> <label
							class="custom-control-label" for="customRadioInline4">Yes</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline5" name="consume"
							class="custom-control-input form-control" value="no"> <label
							class="custom-control-label" for="customRadioInline5">No</label>
					</div>
				</div>

				<div class="form-group mt-5">
					<label for="exampleInputEmail1">Annual income</label> <input
						type="number" name="annualIncome" class="form-control"
						id="exampleInputEmail1" aria-describedby="firstname"
						placeholder="Enter your annual income">
				</div>

				<div class="form-group mt-5">
					<h3>Policy Type</h3>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline6" name="policyType"
							class="custom-control-input form-control"
							value="Term insurance Policy"> <label
							class="custom-control-label" for="customRadioInline6">Term
							insurance Policy</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline7" name="policyType"
							class="custom-control-input form-control"
							value="Whole Life insurance Policy"> <label
							class="custom-control-label" for="customRadioInline7">Whole
							Life insurance Policy</label>
					</div>

					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline8" name="policyType"
							class="custom-control-input form-control"
							value="Money Back policy"> <label
							class="custom-control-label" for="customRadioInline8">Money
							Back policy</label>
					</div>

					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" id="customRadioInline9" name="policyType"
							class="custom-control-input form-control"
							value="Endowment Policy"> <label
							class="custom-control-label" for="customRadioInline9">Endowment
							Policy</label>
					</div>
				</div>

				<div class="form-group mt-5">
					<label for="duration">duration</label> <input type="text"
						class="form-control" name="ageOfInsurance" id="duration"
						aria-describedby="duratin"
						placeholder="Enter the duration of insurance">
				</div>

				<div class="text-center">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>

			</form>
		</div>
	</div>
</body>

</html>