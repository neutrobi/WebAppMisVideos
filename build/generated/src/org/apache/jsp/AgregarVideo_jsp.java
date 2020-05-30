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

public final class AgregarVideo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Agregar video</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            HttpSession ses = request.getSession();
            if (ses.getAttribute("s1") != null) {
                out.print("<h1>¡Bienvenido! " + ses.getAttribute("s1") + "</h1>");
            } else {
                response.sendRedirect("login.jsp");
            }

            if (request.getParameter("c") != null) {
                //ses.removeAttribute("s1");
                ses.invalidate();
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        <h1>Agregar nuevo video</h1>\n");
      out.write("        <form action=\"Video\">\n");
      out.write("            <label for=\"titulo\">Titulo del video</label>\n");
      out.write("            <input type=\"text\" name=\"titulo\" id=\"titulo\" value=\"Hola\">\n");
      out.write("            <input type=\"text\" name=\"titulo\" id=\"titulo\" placeholder=\"Introduce el titulo del video\">\n");
      out.write("            <label for=\"titulo\">Ingrese la url del video</label>\n");
      out.write("            <input type=\"text\" name=\"url\" id=\"url\" placeholder=\"Ingrese la URL\">\n");
      out.write("            <input type=\"submit\" value=\"Guardar Video\">\n");
      out.write("        </form>\n");
      out.write("        <a href=\"Comentarios.jsp\">Volver</a>\n");
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
