<%-- 
    Document   : InstitucionADD
    Created on : 7 nov 2020, 21:43:52
    Author     : Juanpa
--%>
<%@page import="DAO.InstitucionDAO"%>
<%@page import="model.Institucion"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Alta de instituciones">
	<title>ALTA DE INSTITUCIONES</title>
	<link rel="stylesheet" type="text/css" href="CSS/styleIA.css">
</head>

<%
    InstitucionDAO dao = new InstitucionDAO();
    List<Institucion> datos = new ArrayList();
    %>
<body>
	<header class="cabezera">
		<h1>ALTA DE INSTITUCIONES</h1>
	</header>
	<section>
		<form method="post" action="controlInstitucion">
			<label for="User">Institucion</label>
                        <input type="text" name="txtInstitucion" placeholder="usuario" autofocus required/> 
			<p>Nombre del proyecto:<input type="text" name="txtProyecto" required> <br></p>
			<p>Nombre del encargado:<input type="text" name="txtNameEncargado" required> <br></p>
			<p>Cargo del encargado:<input type="text" name="txtCargoEncargado" required> <br></p>
			<p>Telefono del encargado:<input type="text" name="txtTelEncargado" required> <br></p>
			<p>Email del encargado:<input type="text" name="txtEmailEncargado" required> <br></p>
			<p>Opciones de la institucion:<input type="checkbox" name="opt1" value="practicas">practicas
			<input type="checkbox" name="opt1" value="ambos">ambos<br></p>
			<p>Apoyo economico:<input type="checkbox" name="opt2" value="Si"> Si
			<input type="checkbox" name="opt2" value="No">No<br></p>
			<p>Monto:<input type="text" name="txtMonto" required> <br></p>
			<p>Vacantes Disponibles:<input type="text" name="txtVacantes" required> <br></p>
			<p>Horario:<input type="text" name="txtMonto" required> <br></p>
			<input type="submit" value="Registro" />
		</form>
		<table>
			<tr>
				<td>ID Institucion</td> <td>Nombre de la institucion</td> <td>Nombre del proyecto</td> <td>Nombre del encargado</td> <td>Cargo del encargado</td> <td>Telefono del encargado</td> <td>Email del encargado</td> <td>Disponibilidad</td> <td>Apoyo economico</td> <td>Monto</td> <td>Vacantes</td>     <td>Horario</td>
			</tr>
                        <%
                            //Hacer un recorrido en la base de datos para mostrar las instituciones disponibles
                            datos = dao.consultar();
                            for(Institucion I : datos){
                                %>
                                <tr>
                                    <td><%= I.getID_Institucion() %></td> <td><%= I.getNombre_Institucion() %></td> <td><%= I.getNombre_Proyecto() %></td> <td><%= I.getNombre_Encargado() %></td> <td><%= I.getCargo_Encargado() %></td> <td><%= I.getTelefono_Encargado() %></td> <td><%= I.getEmail_Encargado() %></td> <td><%= I.getPracticas_Servicio() %></td> <td><%= I.getApoyo_Economico() %></td> <td><%= I.getMonto() %></td> <td><%= I.getVacantes() %></td> <td><%= I.getHorario() %></td>
                                </tr>
                                <%
                            }
                            %>
		</table>
	</section>
</body>
</html>
