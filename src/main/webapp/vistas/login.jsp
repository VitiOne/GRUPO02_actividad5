<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar sesi�n</title>
</head>
<body>
	<h1>Iniciar Sesi�n</h1>
	<form action="/usuario/login" method="post">
	
		<p>Email <input type="text" name="username" ></p>
		<p>Contrase�a <input type="text" name="password" ></p>
		<p>${requestScope.mensaje}</p> <!-- Mensaje al hacer login, indica correcto o incorrecto -->
		<p><input type="submit" value="Log In" ></p>
		
	</form>
	<p><a href="/">Volver a Home</a></p>
</body>
</html>