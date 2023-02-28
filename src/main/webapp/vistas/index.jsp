<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>


	
	<p style="color: red;">${requestScope.mensajeError}</p>
	<p style="color: red;">index > </p>
	 <div id="container">
        <form action="/login" method="get">
            <!-- Username -->
            <label for="username">Username:</label>
            <input type="text" name="usuario">
           
            <label for="password">Password:</label>
            <input type="password" name = "password">
            <input type="submit" >
      </form>       
    </div>
</body>
</html>