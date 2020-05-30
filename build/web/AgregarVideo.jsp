<%-- 
    Document   : AgregarVideo
    Created on : 28/05/2020, 12:53:07 PM
    Author     : denwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.LinkedList"%>
<%@page session="true"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/EstilosAME.css" type="text/css">
        
        <title>Agregar video nuevo</title>
    </head>
    <body>
        <%

            HttpSession ses = request.getSession();
            if (ses.getAttribute("s1") != null) {
                
            } else {
                response.sendRedirect("login.jsp");
            }

            if (request.getParameter("c") != null) {
                //ses.removeAttribute("s1");
                ses.invalidate();
                response.sendRedirect("index.jsp");
            }
        %>
        <main>
            <div class="content-form">
        <h1>Agregar nuevo video</h1>
        <form action="AgregarVideo" method="post">
            <strong><label for="titulo" class="lbl-titulo">Titulo del video</label></strong>
            <input type="hidden" name="usuarioVideo" id="usuarioVideo" value="<%out.print(ses.getAttribute("s1"));%>">
            <input type="text" name="titulo" id="titulo" placeholder="Introduce el titulo del video">
            <strong><label for="titulo" class="lbl-plataforma">¿A qué plataforma pertenece?</label></strong>
            <select id="plataforma" name="plataforma" requied >
               <option selected="" value="" disabled="" hidden=""> Elije una opción</option>
              <optgroup label="">
               <option value="YouTube">YouTube</option>
               <option value="Vimeo">Vimeo</option>
              </optgroup>  
           </select>
            <strong><label for="titulo" class="url">Ingrese la URL del video (vea el ejemplo si es de Vimeo)</label></strong>
            <input type="text" name="url" id="url" placeholder="Ejemplo: https://vimeo.com/243707834">
            <input type="submit" value="Guardar Video">
            <a class="volver" href="Comentarios.jsp">Volver</a>
        </form>
        
       </div>
        </main>
    </body>
</html>
