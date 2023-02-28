<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ingresar</title>
</head>
<body>
	<p style="color: red;">${requestScope.mensajeError}</p>
	<form action="/ingresar" method="post">
		<p>Introduce cantidad a ingresar: <input type="number" name="cantidad"></p>
		<input type="submit" value="Ingresar">
	</form>
</body>
</html>