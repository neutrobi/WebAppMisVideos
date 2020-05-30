<%-- 
    Document   : EditarVideo
    Created on : 28/05/2020, 10:44:50 PM
    Author     : denwa
--%>

<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <title>Eliminar video</title>
    </head>
    <body>
        <%conectBD.Conection con = new conectBD.Conection();
            HttpSession ses = request.getSession();
            Connection cn = con.getConection();
            String id = request.getParameter("id");

            String sqll = "select id_video, url, plataforma, titulo, urlCompleta from agregarvideo "
                    + "WHERE id_video = '" + id + "'";
            Statement st;

            try {
                st = cn.createStatement();
                ResultSet r = st.executeQuery(sqll);

                while (r.next()) {
        %>
        <main>
            <div class="content-form">
                <h1>¿Esta seguro de eliminar el siguiente video?</h1>
                <form action="EliminarVideo" method="post">
                    
                    <input type="hidden" name="id_usuario" id="id_usuario" value="<%out.print(id);%>">
                    
                   <% if (r.getString("plataforma").equals("YouTube")) {
                %>
                <h3>Con titulo: <%out.println(r.getString("titulo"));%></h3>
              
                <iframe width="590" height="345" src="https://www.youtube.com/embed/<%out.println(r.getString("url"));%>" frameborder="0" 
                        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen></iframe>      
                    <%} else {%>
                <h4><%out.println(r.getString("titulo"));%></h4>
        
                <iframe id="vimeo" src="https://player.vimeo.com/video/<%out.println(r.getString("url"));%>" width="590" height="345"
                        frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
                    
                  <%}%>
                    <input type="submit" value="Eliminar Video">
                    <a class="volver" href="Comentarios.jsp">Volver</a>
                </form>
            </div>
        </main>
        <%
                }
            } catch (SQLException ex) {
                System.out.println("error" + ex);
            }%>

    </body>
</html>
