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
        
        <title>Editar video</title>
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
        <h1>Editar video</h1>
        <form action="EditarVideo" method="post">
            <strong><label for="titulo">Titulo del video</label></strong>
            <input type="hidden" name="id_usuario" id="id_usuario" value="<%out.print(id);%>">
            <input type="hidden" name="usuarioVideo" id="usuarioVideo" value="<%out.print(ses.getAttribute("s1"));%>">
            <input type="text" name="titulo" id="titulo" value="<%out.println(r.getString("titulo"));%>">
            <strong><label for="titulo">Plataforma</label></strong>
            <%if (r.getString("plataforma").equals("YouTube")) {
            %>
            <select id="plataforma" name="plataforma" requied >
                <option selected="selected" value="YouTube"><%out.println(r.getString("plataforma"));%></option>
                <optgroup label="">
                    <option value="YouTube">YouTube</option>
                    <option value="Vimeo">Vimeo</option>
                </optgroup>  
            </select>
            <%} else {%>
            <select id="plataforma" name="plataforma" requied >
                <option selected="selected" value="Vimeo"><%out.println(r.getString("plataforma"));%></option>
                <optgroup label="">
                    <option value="YouTube">YouTube</option>
                    <option value="Vimeo">Vimeo</option>
                </optgroup>  
            </select>
            <%}%>
            <strong><label for="titulo">Ingrese la url del video</label></strong>
            <%
                if (r.getString("plataforma").equals("YouTube")) {

            %>
            <input type="text" name="url" id="url" 
                   value="https://www.youtube.com/watch?v=<%out.println(r.getString("url"));%>">
            <input type="submit" value="Guardar Video">
            <%} else {%>
            <input type="text" name="url" id="url" 
                   value="<%out.println(r.getString("urlCompleta"));%>">
            <input type="submit" value="Guardar Video">
            <a class="volver" href="Comentarios.jsp">Volver</a>
        </form>
        <%}
                }
            } catch (SQLException ex) {
                System.out.println("error" + ex);
                }%>
        </div>
        </main>
    </body>
</html>
