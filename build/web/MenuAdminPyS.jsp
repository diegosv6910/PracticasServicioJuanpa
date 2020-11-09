<%-- 
    Document   : MenuAdminPyS
    Created on : 7 nov 2020, 16:49:34
    Author     : Juanpa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="description" content="administrar servicio y practicas">
	<title>Menu Administracion practicas y servicio</title>
	<link rel="stylesheet" type="text/css" href="CSS/styleMA.css">
</head>
<body>
	<header class="cabezera">
		<h1>Bienvenid@ Al Menu Practicas y Servicios</h1>
	</header>
	<section class="seccion">
		<form method="post" action="Institucion.jsp">
		Instituciones<input type="submit" name="Institucion" value="Ingresar">
		</form>
		<form method="post" action="">
	    Practicas<input type="submit" name="Practicas" value="Ingresar">
		</form>
		<form method="post" action="">
	    Servicio<input type="submit" name="Servicio" value="Ingresar">
		</form>
	</section>
</body>
</html>
