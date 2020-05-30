<%-- 
    Document   : index
    Created on : 28/05/2020, 09:55:13 AM
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
        <title>Pagina de inicio</title>
        <link rel="stylesheet" href="CSS/EstilosIndex.css" type="text/css">
        
        <style>
        .star{
          color: goldenrod;
          font-size: 2.0rem;
          padding: 0 1rem; /* space out the stars */
        }
        .star::before{
          content: '\2606';    /* star outline */
          cursor: pointer;
        }
        .star.rated::before{
          /* the style for a selected star */
          content: '\2605';  /* filled star */
        }
        
        .stars{
            counter-reset: rateme 0;   
            font-size: 2.0rem;
            font-weight: 900;
        }
        .star.rated{
            counter-increment: rateme 1;
        }
        .stars::after{
            content: counter(rateme) '/5';
        }
    </style>
    
    </head>
    <body>
        <header>
            <a href="#" class="logo">LOGO</a>
            <ul>
                <li><a href="registro.jsp">Registrarse</a></li>
                <li><a href="login.jsp">Iniciar sesión</a></li>
            </ul>
            <div class="toggle"></div>
        </header>

        <div class="wrapper">
            <h1>Videos recientes</h1>
            <%conectBD.Conection con = new conectBD.Conection();
                Connection cn = con.getConection();

                String sqll = "select id_video, usuarioVideo, url, plataforma, titulo from agregarvideo";
                Statement st;

                try {
                    st = cn.createStatement();
                    ResultSet r = st.executeQuery(sqll);

                    while (r.next()) {
                        if (r.getString("plataforma").equals("YouTube")) {
            %>
            <div class="titulo"><h3><%out.println(r.getString("titulo"));%></h3></div>
            <div class="stars" data-rating="3">
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
            </div>
            <iframe width="390" height="145" src="https://www.youtube.com/embed/<%out.println(r.getString("url"));%>" frameborder="0" 
                    allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                    allowfullscreen></iframe>
            <a href="verVideo.jsp?id=<%out.println(r.getString("id_video"));%>"><h5>VER VIDEO</h5></a>
            <a href="perfilUsuario.jsp?id=<%out.println(r.getString("usuarioVideo"));%>"><h5>Usuario: <%out.println(r.getString("usuarioVideo"));%></h5></a>
            <h5>Plataforma: <%out.println(r.getString("plataforma"));%></h5>
            <%} else {%>
            <div class="titulo"><h3><%out.println(r.getString("titulo"));%></h3></div>
            <div class="stars" data-rating="3">
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
                <span class="star">&nbsp;</span>
            </div>
            <iframe id="vimeo" src="https://player.vimeo.com/video/<%out.println(r.getString("url"));%>" width="390" height="145"
                    frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
            <a href="verVideo.jsp?id=<%out.println(r.getString("id_video"));%>"><h5>VER VIDEO</h5></a>
            <a href="perfilUsuario.jsp?id=<%out.println(r.getString("usuarioVideo"));%>"><h5>Usuario: <%out.println(r.getString("usuarioVideo"));%></h5></a>
            <h5>Plataforma: <%out.println(r.getString("plataforma"));%></h5>
            <%}
                    }
                } catch (SQLException ex) {
                    System.out.println("error" + ex);
                }%>
        </div>
        <script>
        
        //initial setup
        document.addEventListener('DOMContentLoaded', function(){
            let stars = document.querySelectorAll('.star');
            stars.forEach(function(star){
                star.addEventListener('click', setRating); 
            });
            
            let rating = parseInt(document.querySelector('.stars').getAttribute('data-rating'));
            let target = stars[rating - 1];
            target.dispatchEvent(new MouseEvent('click'));
        });

        function setRating(ev){
            let span = ev.currentTarget;
            let stars = document.querySelectorAll('.star');
            let match = false;
            let num = 0;
            stars.forEach(function(star, index){
                if(match){
                    star.classList.remove('rated');
                }else{
                    star.classList.add('rated');
                }
                //are we currently looking at the span that was clicked
                if(star === span){
                    match = true;
                    num = index + 1;
                }
            });
            document.querySelector('.stars').setAttribute('data-rating', num);
        }
        
    </script>
    </body>
</html>
