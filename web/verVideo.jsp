<%-- 
    Document   : perfilUsuario
    Created on : 29/05/2020, 04:55:07 PM
    Author     : denwa
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/EstilosVerVideo.css" type="text/css">
        
        <title>Ver video</title>
    </head>
    <body>
        <header>
            <a href="#" class="logo">VER VIDEO</a>
            <ul>
                <li><a href="registro.jsp">Registrarse</a></li>
                <li><a href="login.jsp">Iniciar sesión</a></li>
            </ul>
            <div class="toggle"></div>
        </header>
        <div class="comments-container">
            <h1 class="ajuste">Perfil de <span><%out.println(request.getParameter("id"));%></span></h1>
            <!-- Video para comentar -->
            <div class="Video">  
        <%conectBD.Conection con = new conectBD.Conection();
            HttpSession ses = request.getSession();
            Connection cn = con.getConection();
            String id = request.getParameter("id");

            String sqll = "select id_video, usuarioVideo, url, plataforma, titulo, urlCompleta from agregarvideo "
                    + "WHERE id_video = '" + id + "'";
            Statement st;

            try {
                st = cn.createStatement();
                ResultSet r = st.executeQuery(sqll);

                while (r.next()) {
        %>
                <% if (r.getString("plataforma").equals("YouTube")) {
                %>
                
                <h5>Id del video: <span><%out.println(r.getString("id_video"));%></span></h5>
                <h5>Subido por el usuario: <span><%out.println(r.getString("usuarioVideo"));%></span></h5>
                <h5>Es de la red social: <span><%out.println(r.getString("plataforma"));%></span></h5>
                <h5>Su direccion URL es: <span><%out.println(r.getString("urlCompleta"));%></span></h5>
                <h3><%out.println(r.getString("titulo"));%></h3>

                <iframe width="590" height="345" src="https://www.youtube.com/embed/<%out.println(r.getString("url"));%>" frameborder="0" 
                        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen></iframe>      
                    <%} else {%>
                <h5>Id del video: <span><%out.println(r.getString("id_video"));%></span></h5>
                <h5>Subido por el usuario: <span><%out.println(r.getString("usuarioVideo"));%></span></h5>
                <h5>Es de la red social: <span><%out.println(r.getString("plataforma"));%></span></h5>
                <h5>Su direccion URL es: <span><%out.println(r.getString("urlCompleta"));%></span></h5>
                <h3><%out.println(r.getString("titulo"));%></h3>

                <iframe id="vimeo" src="https://player.vimeo.com/video/<%out.println(r.getString("url"));%>" width="590" height="345"
                        frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>

                <%}%>
                
        <%
                }
            } catch (SQLException ex) {
                System.out.println("error" + ex);
            }%>
            </div>
         </div> 
    </body>
</html>
