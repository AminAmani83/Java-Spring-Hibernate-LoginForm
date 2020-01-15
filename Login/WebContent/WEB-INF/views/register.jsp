<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registration Page</title>
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
		.label {
			display: inline-block;
			width: 100px;
			text-align: left;
		}
		h1, .center-align {
			text-align: center;
		}
		input {
			width: 150px;
		}
		#submit {
			width: 255px;
		}
		form {
			text-align: center;	
		}
	</style>
</head>
<body>

	<main>
		<h1>Registration Page</h1>
		<form:form action="./adduser" method="post"
					modelAttribute="newUser">
			<span class="label">Email:</span><form:input path="email" /><br><br>
			<span class="label">Password:</span><form:input path="password" /><br><br>
			<input type="submit" value="Submit" id="submit" />
		</form:form>
		<br>
		<div class="center-align">${message}</div>
	</main>
	
</body>
</html>
<!--  Author: Amin Amani -->