<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="index.jsp"></jsp:include>
	
	<div class="container">
	<h1 class="text-primary">Lista de productos</h1>
	<td><a href="/producto/alta" class="btn btn-primary btn-sm" >Nuevo Producto</a></td>
	
	<table class="table table-striped table-sm" >
	<th>Id</th><th>Nombre Producto</th><th>Opciones</th>
	
	<c:forEach var="ele" items="${listaProductos }" >
		<tr>
			<td>${ele.id}</td>
			<td>${ele.descripcion }</td>
			<td><a href="/producto/verUno/${ele.id}" class="btn btn-success btn-sm">Ver detalle</a>
			 
			<a href="/producto/editar/${ele.id}" class="btn btn-success btn-sm">Modificar</a> 
			<a href="/producto/eliminar/${ele.id}" class="btn btn-danger btn-sm">Eliminar</a></td>
			
		</tr>
	</c:forEach>

	
	</table>
	</div>
	</body>
</html>