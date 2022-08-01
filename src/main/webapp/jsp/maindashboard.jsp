<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style>
body {
	height: 100vh;
	width: 100vw;
}

a:hover, a:visited, a:link, a:active {
	text-decoration: none;
	color: white;
}

.btncontainer {
	height: 100%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.btnsize {
	width: 70pt;
}
</style>
</head>

<body>
	<div class="btncontainer">

		<button type="button" class="btn btn-secondary btn-sm btnsize">
			<a href="dashboard">dashboard</a>
		</button>
		<button type="button" class="btn btn-secondary btn-sm mt-3 btnsize">
			<a href="proposalform">proposal</a>
		</button>

	</div>

</body>

</html>