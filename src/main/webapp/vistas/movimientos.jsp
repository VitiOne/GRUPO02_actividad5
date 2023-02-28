<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movimientos</title>
</head>
<body>
	<h1>Id: ${requestScope.cuentaM.id}</h1>
	<h1>Saldo: ${requestScope.cuentaM.saldo}</h1>
	<br>
	<table>
		<tr>
			<th>Cantidad</th>
			<th>Fecha</th>
			<th>Tipo</th>
		</tr>
		<c:forEach var="ele" items="${requestScope.cuentaM.movimientos}">
    		<tr>
				<td>${ele.cantidad}</td>
				<td>${ele.fecha}</td>
				<td>${ele.operacion}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>