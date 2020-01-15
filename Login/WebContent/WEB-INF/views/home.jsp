<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
	<style>
		main {
			margin: auto;
			width: 300px;
			margin-top: 100px;
			background-color: lightblue;
			overflow: auto;
			padding: 50px;
			min-height: 200px;
		}
		h1, .center-align {
			text-align: center;
		}
	</style>
</head>
<body>
	<main>
		<h1>Welcome!</h1>
		<div class="center-align">${message}</div>
	</main>
</body>
</html>
<!--  Author: Amin Amani -->