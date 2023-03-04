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
	<form action="/usuario/registro/direccion" method="post">
		<input type="number" name="id" placeholder="idTarjeta"></br>
		<input type="number" name="cp" placeholder="cp"></br>
		<input type="text" name="localidad" placeholder="localidad"></br>
		<input type="text" name="calle" placeholder="calle"></br>
		<input type="number" name="numero" placeholder="numero"></br>
		<input type="text" name="piso" placeholder="piso"></br>
		<input type="text" name="letra" placeholder="letra"></br>
		<input type="submit" value="Registrar">


	</form>
</body>
</html>