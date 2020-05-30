package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Comentarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/EstilosComentarios.css\" type=\"text/css\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Videos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


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
        
      out.write("\n");
      out.write("        <div class=\"comments-container\">\n");
      out.write("            <!-- Video para comentar -->\n");
      out.write("            <div class=\"Video\">\n");
      out.write("                <p>\n");
      out.write("                <form>\n");
      out.write("                    <p class=\"clasificacion\">\n");
      out.write("                        <input id=\"radio1\" type=\"radio\" name=\"estrellas\" value=\"5\"><!--\n");
      out.write("                        --><label for=\"radio1\">★</label><!--\n");
      out.write("                        --><input id=\"radio2\" type=\"radio\" name=\"estrellas\" value=\"4\"><!--\n");
      out.write("                        --><label for=\"radio2\">★</label><!--\n");
      out.write("                        --><input id=\"radio3\" type=\"radio\" name=\"estrellas\" value=\"3\"><!--\n");
      out.write("                        --><label for=\"radio3\">★</label><!--\n");
      out.write("                        --><input id=\"radio4\" type=\"radio\" name=\"estrellas\" value=\"2\"><!--\n");
      out.write("                        --><label for=\"radio4\">★</label><!--\n");
      out.write("                        --><input id=\"radio5\" type=\"radio\" name=\"estrellas\" value=\"1\"><!-- \n");
      out.write("                        --><label for=\"radio5\">★</label>\n");
      out.write("                    </p>\n");
      out.write("                </form>\n");
      out.write("                ");
conectBD.Conection con = new conectBD.Conection();
                Connection cn = con.getConection();
                String sqll = "select url, plataforma from agregarvideo";
                Statement st;

                try {
                    st = cn.createStatement();
                    ResultSet r = st.executeQuery(sqll);
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Enviar un comentario -->\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2>Comentarios</h2></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
while (r.next()) {
                if(r.getString("plataforma").equals("YouTube")){ 
                
      out.write("\n");
      out.write("                <iframe width=\"590\" height=\"345\" src=\"https://www.youtube.com/embed/");
out.println(r.getString("url"));
      out.write("\" frameborder=\"0\" \n");
      out.write("                        allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" \n");
      out.write("                        allowfullscreen></iframe>\n");
      out.write("                ");
}else{
      out.write("\n");
      out.write("                <iframe id=\"vimeo\" src=\"");
out.println(r.getString("url"));
      out.write("\" frameborder=\"0\" \n");
      out.write("                        webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>\n");
      out.write("            ");
}}} catch (SQLException ex) {
                    System.out.println("error" + ex);
                }
      out.write("\n");
      out.write("                <iframe width=\"590\" height=\"345\" src=\"https://www.youtube.com/embed/8qzscKX6_WQ\" frameborder=\"0\" \n");
      out.write("                        allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" \n");
      out.write("                        allowfullscreen></iframe>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- Enviar un comentario -->\n");
      out.write("            <div class=\"enviar-comentario\">\n");
      out.write("                <form action=\"Comentarios\">\n");
      out.write("                    <p>\n");
      out.write("                    <h1>Deja tu comentario</h1>\n");
      out.write("                    <textarea name=\"descrpcion\" id=\"caja\" style=\"width: 760px; height: 200px\"></textarea>\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <p class=\"enviar\">\n");
      out.write("                        <input type=\"submit\" name=\"s2\" value=\"Iniciar Sesión\">\n");
      out.write("                    </p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                if (request.getAttribute("v") != null) {
                    if (request.getAttribute("v") == "2") {
                        ses.setAttribute("s2", request.getAttribute("com"));
                        response.sendRedirect("Comentarios.jsp");
                        out.print(ses.getAttribute("s2"));
                    } else {
                        out.print("Credenciales incorrectos");
                    }
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Contenedor Principal -->\n");
      out.write("            <!--\n");
      out.write("               <h1>Comentarios</h1>\n");
      out.write("\n");
      out.write("               <ul id=\"comments-list\" class=\"comments-list\">\n");
      out.write("                   <li>\n");
      out.write("                       <div class=\"comment-main-level\">\n");
      out.write("            <!-- Avatar \n");
      out.write("            <div class=\"comment-avatar\"><img src=\"http://i9.photobucket.com/albums/a88/creaticode/avatar_1_zps8e1c80cd.jpg\"\n");
      out.write("                                             alt=\"\"></div>\n");
      out.write("            <!-- Contenedor del Comentario \n");
      out.write("            <div class=\"comment-box\">\n");
      out.write("                <div class=\"comment-head\">\n");
      out.write("                    <h6 class=\"comment-name by-author\"><a href=\"\">Agustin Ortiz</a></h6>\n");
      out.write("                    <span>hace 20 minutos</span>\n");
      out.write("                    <i class=\"fa fa-reply\"></i>\n");
      out.write("                    <i class=\"fa fa-heart\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"comment-content\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit omnis animi et iure laudantium vitae,\n");
      out.write("                    praesentium optio, sapiente distinctio illo?\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <!-- Respuestas de los comentarios \n");
      out.write("            <ul class=\"comments-list reply-list\">\n");
      out.write("                <li>\n");
      out.write("            <!-- Avatar \n");
      out.write("            <div class=\"comment-avatar\"><img\n");
      out.write("                    src=\"http://i9.photobucket.com/albums/a88/creaticode/avatar_2_zps7de12f8b.jpg\" alt=\"\"></div>\n");
      out.write("            <!-- Contenedor del Comentario \n");
      out.write("            <div class=\"comment-box\">\n");
      out.write("                <div class=\"comment-head\">\n");
      out.write("                    <h6 class=\"comment-name\"><a href=\"\">Lorena Rojero</a></h6>\n");
      out.write("                    <span>hace 10 minutos</span>\n");
      out.write("                    <i class=\"fa fa-reply\"></i>\n");
      out.write("                    <i class=\"fa fa-heart\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"comment-content\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit omnis animi et iure laudantium vitae,\n");
      out.write("                    praesentium optio, sapiente distinctio illo?\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li>\n");
      out.write("            <!-- Avatar \n");
      out.write("            <div class=\"comment-avatar\"><img\n");
      out.write("                    src=\"http://i9.photobucket.com/albums/a88/creaticode/avatar_1_zps8e1c80cd.jpg\" alt=\"\"></div>\n");
      out.write("            <!-- Contenedor del Comentario\n");
      out.write("            <div class=\"comment-box\">\n");
      out.write("                <div class=\"comment-head\">\n");
      out.write("                    <h6 class=\"comment-name by-author\"><a href=\"\">Agustin Ortiz</a></h6>\n");
      out.write("                    <span>hace 10 minutos</span>\n");
      out.write("                    <i class=\"fa fa-reply\"></i>\n");
      out.write("                    <i class=\"fa fa-heart\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"comment-content\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit omnis animi et iure laudantium vitae,\n");
      out.write("                    praesentium optio, sapiente distinctio illo?\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("<li>\n");
      out.write("    <div class=\"comment-main-level\">\n");
      out.write("            <!-- Avatar \n");
      out.write("            <div class=\"comment-avatar\"><img src=\"http://i9.photobucket.com/albums/a88/creaticode/avatar_2_zps7de12f8b.jpg\"\n");
      out.write("                                             alt=\"\"></div>\n");
      out.write("            <!-- Contenedor del Comentario\n");
      out.write("            <div class=\"comment-box\">\n");
      out.write("                <div class=\"comment-head\">\n");
      out.write("                    <h6 class=\"comment-name\"><a href=\"\">Lorena Rojero</a></h6>\n");
      out.write("                    <span>hace 10 minutos</span>\n");
      out.write("                    <i class=\"fa fa-reply\"></i>\n");
      out.write("                    <i class=\"fa fa-heart\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"comment-content\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit omnis animi et iure laudantium vitae,\n");
      out.write("                    praesentium optio, sapiente distinctio illo?\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("            -->\n");
      out.write("            <script src=\"http://js.nicedit.com/nicEdit-latest.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script type=\"text/javascript\">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
