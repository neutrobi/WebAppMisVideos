package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pagina de inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/EstilosIndex.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"#\" class=\"logo\">LOGO</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"registro.jsp\">Registrarse</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Iniciar sesión</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"toggle\"></div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <h1>Videos recientes</h1>\n");
      out.write("            ");
conectBD.Conection con = new conectBD.Conection();
                    Connection cn = con.getConection();
                   
                    String sqll = "select id_video, usuarioVideo, url, plataforma, titulo from agregarvideo";
                    Statement st;

                    try {
                        st = cn.createStatement();
                        ResultSet r = st.executeQuery(sqll);
                     
                    while (r.next()) {
                        if (r.getString("plataforma").equals("YouTube")) {
                
      out.write("\n");
      out.write("                <div class=\"titulo\"><h3>");
out.println(r.getString("titulo"));
      out.write("</h3></div>\n");
      out.write("                <iframe width=\"390\" height=\"145\" src=\"https://www.youtube.com/embed/");
out.println(r.getString("url"));
      out.write("\" frameborder=\"0\" \n");
      out.write("                        allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" \n");
      out.write("                        allowfullscreen></iframe>\n");
      out.write("                <a href=\"perfilUsuario.jsp?id=");
out.println(r.getString("usuarioVideo"));
      out.write("\"><h5>Usuario: ");
out.println(r.getString("usuarioVideo"));
      out.write("</h5></a>\n");
      out.write("               <h5>Plataforma: ");
out.println(r.getString("plataforma"));
      out.write("</h5>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <div class=\"titulo\"><h3>");
out.println(r.getString("titulo"));
      out.write("</h3></div>\n");
      out.write("                    <iframe id=\"vimeo\" src=\"https://player.vimeo.com/video/");
out.println(r.getString("url"));
      out.write("\" width=\"390\" height=\"145\"\n");
      out.write("                        frameborder=\"0\" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>\n");
      out.write("                    <a href=\"perfilUsuario.jsp?id=");
out.println(r.getString("usuarioVideo"));
      out.write("\"><h5>Usuario: ");
out.println(r.getString("usuarioVideo"));
      out.write("</h5></a>\n");
      out.write("                    <h5>Plataforma: ");
out.println(r.getString("plataforma"));
      out.write("</h5>\n");
      out.write("                    ");
}
                            }
                        } catch (SQLException ex) {
                            System.out.println("error" + ex);
                        }
      out.write("\n");
      out.write("        </div>\n");
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
