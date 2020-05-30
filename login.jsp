<%-- 
    Document   : login
    Created on : 3/03/2020, 09:15:05 PM
    Author     : denwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/EstiloLogin.css" rel="stylesheet" type="text/css"/>
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <main>
            <div class="content-form">
                <h1>Iniciar Sesión</h1>
                <h4>¿Eres usuario nuevo?<a href="registro.jsp">Registrate</a></h4>
                <form action="iniciar?parametro=sesion" method="post">

                    <label for="email" class="lbl-email">Usuario</label>
                    <input type="text" name="usuario" id="email">

                    <label for="password" class="lbl-password">Contraseña</label>
                    <input type="password" name="pass" id="password">
                    <input type="submit" name="bl" value="Iniciar Sesión">
                </form>
                <%
                    if(request.getAttribute("v") !=null){
                      if(request.getAttribute("v")== "1"){
                          HttpSession ses= request.getSession();
                          ses.setAttribute("s1", request.getAttribute("log"));
                          response.sendRedirect("Comentarios.jsp");
                      }else{
                        out.print("Credenciales incorrectos");
                      }
                    }
                %>
            </div>
        </main>

        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="JS/Script-Login.js" type="text/javascript"></script>
    </body>
</html>
