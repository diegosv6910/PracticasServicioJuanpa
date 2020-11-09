<%-- 
    Document   : Institucion
    Created on : 7 nov 2020, 19:39:40
    Author     : Juanpa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Administracion de instituciones">
	<title>Instituciones</title>
	<link rel="stylesheet" type="text/css" href="CSS/styleI.css">
</head>
<body>
	<header class="cabezera">
		<h1>Bienvenid@ Al Menu Instituciones</h1>
	</header>
	<section>
		<form method="post" action="InstitucionADD.jsp">
			Agregar una institucion<input type="submit" name="AddInstitucion" value="Ingresar">
		</form>
		<form method="post" action="">
			Mostrar instituciones disponibles<input type="submit" name="ShowInstitucion" value="Ingresar">
		</form>
	</section>
</body>
