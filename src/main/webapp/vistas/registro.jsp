<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola</h1>
	<h3>${mensaje }</h3>
	<form action="/usuario/registro" method="post">
		<input type="text" name="username" placeholder="Username"></br>
		<input type="text" name="password" placeholder="Contraseña"></br>
		<input type="text" name="nombre" placeholder="Nombre"></br>
		<input type="text" name="apellidos" placeholder="Apellidos"></br>
		<input type="text" name="direccion" placeholder="Direccion"></br>
		<input type="submit" value="Registrar">

	</form>
	
	<h3><a href="/usuario/registro/tarjeta" class="btn btn-success btn-sm">Registro tarjetas bancarias</a></h3>
	<h3><a href="/usuario/registro/direccion" class="btn btn-success btn-sm">Registro direcciones</a></h3>
	
</body>
</html>