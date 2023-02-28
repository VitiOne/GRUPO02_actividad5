<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Extraer</title>
</head>
<body>
	<p style="color: red;">${requestScope.mensajeError}</p>
	<form action="/extraer" method="post">
		<p>Introduce cantidad a extraer: <input type="number" name="cantidad"></p>
		<input type="submit" value="Extraer">
	</form>
</body>
</html>