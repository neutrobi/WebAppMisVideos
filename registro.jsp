<%-- 
    Document   : registro
    Created on : 3/03/2020, 09:24:41 PM
    Author     : denwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/EstiloFormu.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <main>
            <div class="content-form">
                <h1>Registrarse</h1>
                <h4>¿Ya eres parte de Consutores Estratégicos?<a href="login.jsp">Inicia sesión</a></h4>
                <form action="registrar" method="post">

                    <label for="nombre" class="lbl-nombre">Nombre</label>
                    <input type="text" name="nombre" id="nombre">

                    <label for="apellidos" class="lbl-apellidos">Apellidos</label>
                    <input type="text" name="apellidos" id="apellidos">

                    <label for="email" class="lbl-email">Usuario</label>
                    <input type="text" name="usuario" id="email">

                    <label for="password" class="lbl-password">Contraseña</label>
                    <input type="password" name="pass" id="password">

                    <div class="content-check">
                        <a href="login.jsp">¿Ya estas registrado?</a>
                    </div>

                    <input type="submit" value="CREAR CUENTA">
                </form>
            </div>
        </main>


        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="JS/Script-Registro.js" type="text/javascript"></script>
    </body>
</html>
