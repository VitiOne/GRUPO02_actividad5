<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transferencia</title>
</head>
<body>
	<p style="color: red;">${requestScope.mensajeError}</p>
	<form action="/transferencia" method="post">
		<p>Introduce cantidad a transferir: <input type="number" name="cantidad"></p>
		<p>Introduce cuenta destino: <input type="number" name="destino"></p>
		<input type="submit" value="Transferir">
	</form>
</body>
</html>