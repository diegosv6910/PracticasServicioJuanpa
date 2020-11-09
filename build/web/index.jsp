<%-- 
    Document   : index
    Created on : 5 nov 2020, 18:19:21
    Author     : Juanpa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="controlPYSADMIN">
            <input type="hidden" name="action" value="login">
                
            <label for="User">Usuario</label>
            <input type="text" name="usuario" placeholder="usuario" autofocus required/> 
            <br>
            <label for="passwd">Contraseña</label>
            <input type="password" name="password" placeholder="contraseña" required/>
            <br>
            <input type="submit" value="Login" />
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>
