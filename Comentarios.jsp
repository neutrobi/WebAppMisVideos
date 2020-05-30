<%-- 
    Document   : Comentarios
    Created on : 11/02/2020, 10:55:19 AM
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
        <link rel="stylesheet" href="CSS/EstilosComentarios.css" type="text/css">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link  rel="stylesheet" href="CSS/starrr.css" type="text/css">
        <script src="JS/starrr.js"></script>
    
        <title>Videos</title>
    </head>
    <body>
        <%

            HttpSession ses = request.getSession();
            if (ses.getAttribute("s1") != null) {
                out.print("<header><a class='logo'>¡Bienvenido! " + ses.getAttribute("s1") + "</a>"
                        + "<ul>"
                        + "<li><a href=AgregarVideo.jsp>Agregar Video</a></li>"
                        + "<li><a href=Comentarios.jsp?c=1>Cerrar sesión</a></li>"
                        + "</ul>"
                        + "<div class='toggle'></div>"
                        + "</header>"
                        + "<STYLE type=text/css>"
                        + "header{"
                        + "position: fixed;"
                        + "width: 100%;"
                        + "height: 80px;"
                        + "padding: 0 100px;"
                        + "display: flex;"
                        + "justify-content: space-between;"
                        + "align-items: center;"
                        + "background: #111;"
                        + "z-index: 1000;}"
                        + "header .logo{"
                        + "color: #fff;"
                        + "font-size: 30px;"
                        + "text-decoration: none;"
                        + "letter-spacing: 2px;"
                        + "font-weight: 700;}"
                        + "header ul{"
                        + "position: relative;"
                        + "display: flex;}"
                        + "header ul li{"
                        + "position: relative;"
                        + "list-style: none;}"
                        + "header ul li a{"
                        + "position: relative;"
                        + "padding: 5px 10px;"
                        + "color: #fff;"
                        + "display: inline-block;"
                        + "text-decoration: none;"
                        + "cursor: pointer;}"
                        + ".toggle{display: none;}"
                        + "</STYLE>");
            } else {
                response.sendRedirect("login.jsp");
            }
            out.print("<div class=boton><a href=Comentarios.jsp?c=1>Cerrar Sesion</a></div>"
                    + "<STYLE type=text/css>"
                    + ".boton a{"
                    + "color:#FFF;}"
                    + ".boton{"
                    + "display: flex;"
                    + "justify-content: center;"
                    + "align-items: center;"
                    + "margin-left:1100px;"
                    + "width: 150px;"
                    + "height: 40px;"
                    + "background: #111;"
                    + "border-radius: 6px;"
                    + "transition: all .3s cubic-bezier(0.67, 0.17, 0.40, 0.83);"
                    + "}</STYLE>");

            if (request.getParameter("c") != null) {
                //ses.removeAttribute("s1");
                ses.invalidate();
                response.sendRedirect("index.jsp");
            }
        %>
        <div class="comments-container">
            <h1>TUS <span>VIDEOS</span></h1>
            <!-- Video para comentar -->
            <div class="Video">                
                <%conectBD.Conection con = new conectBD.Conection();
                    Connection cn = con.getConection();
                   
                    String sqll = "select id_video, url, plataforma, titulo from agregarvideo "
                            + "WHERE usuarioVideo = '"+ ses.getAttribute("s1") +"'";
                    Statement st;

                    try {
                        st = cn.createStatement();
                        ResultSet r = st.executeQuery(sqll);
                %>

                <!-- Agregar videos -->


                <%while (r.next()) {
                        if (r.getString("plataforma").equals("YouTube")) {
                %>
                <h3><%out.println(r.getString("titulo"));%></h3>
                <form>
                    </p>
                    <hr/>
                    Calificar: <span id="Estrellas"></span>
                    <hr/>
                    <br>
                    <a href="EditarVideo.jsp?id=<%out.println(r.getString("id_video"));%>">Editar Video</a><br><br>
                    <a id="eliminar" href="EliminarVideo.jsp?id=<%out.println(r.getString("id_video"));%>">Eliminar Video</a>
                    <p>
                    <p class="clasificacion">
                        <input id="radio1" type="radio" name="estrellas" value="5"><!--
                        --><label for="radio1">★</label><!--
                        --><input id="radio2" type="radio" name="estrellas" value="4"><!--
                        --><label for="radio2">★</label><!--
                        --><input id="radio3" type="radio" name="estrellas" value="3"><!--
                        --><label for="radio3">★</label><!--
                        --><input id="radio4" type="radio" name="estrellas" value="2"><!--
                        --><label for="radio4">★</label><!--
                        --><input id="radio5" type="radio" name="estrellas" value="1"><!-- 
                        --><label for="radio5">★</label>
                    </p>
                </form>
                <iframe width="590" height="345" src="https://www.youtube.com/embed/<%out.println(r.getString("url"));%>" frameborder="0" 
                        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen></iframe>      
                    <%} else {%>
                <h4><%out.println(r.getString("titulo"));%></h4>
                <form class="ajuste">
                    </p>
                    <hr/>
                    Calificar: <span id="Estrellas"></span>
                    <hr/>
                    <br>
                    <a href="EditarVideo.jsp?id=<%out.println(r.getString("id_video"));%>">Editar Video</a><br><br>
                    <a id="eliminar" href="EliminarVideo.jsp?id=<%out.println(r.getString("id_video"));%>">Eliminar Video</a>
                    <p>
                    <p class="clasificacion">
                        <input id="radio1" type="radio" name="estrellas" value="5"><!--
                        --><label for="radio1">★</label><!--
                        --><input id="radio2" type="radio" name="estrellas" value="4"><!--
                        --><label for="radio2">★</label><!--
                        --><input id="radio3" type="radio" name="estrellas" value="3"><!--
                        --><label for="radio3">★</label><!--
                        --><input id="radio4" type="radio" name="estrellas" value="2"><!--
                        --><label for="radio4">★</label><!--
                        --><input id="radio5" type="radio" name="estrellas" value="1"><!-- 
                        --><label for="radio5">★</label>
                    </p>
                </form>
                <iframe id="vimeo" src="https://player.vimeo.com/video/<%out.println(r.getString("url"));%>" width="590" height="345"
                        frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
                    <%}
                            }
                        } catch (SQLException ex) {
                            System.out.println("error" + ex);
                        }%>               

            </div>

            <%
                if (request.getAttribute("v") != null) {
                    if (request.getAttribute("v") == "2") {
                        ses.setAttribute("s2", request.getAttribute("com"));
                        response.sendRedirect("Comentarios.jsp");
                        out.print(ses.getAttribute("s2"));
                    } else {
                        out.print("Credenciales incorrectos");
                    }
                }
            %>
            
        </div>
        <script>
            $('#Estrellas').starrr({
                rating: 3,
                change: function (e, valor) {
                    alert(valor);

                }

            });

        </script>
        <script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>
        <script type="text/javascript">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>
    </body>
</html>
