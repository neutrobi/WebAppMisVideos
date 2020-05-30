package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/EstiloFormu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"content-form\">\n");
      out.write("                <h1>Registrarse</h1>\n");
      out.write("                <h4>¿Ya eres parte de Consutores Estratégicos?<a href=\"login.jsp\">Inicia sesión</a></h4>\n");
      out.write("                <form action=\"registrar\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <label for=\"nombre\" class=\"lbl-nombre\">Nombre</label>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\">\n");
      out.write("\n");
      out.write("                    <label for=\"apellidos\" class=\"lbl-apellidos\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" name=\"apellidos\" id=\"apellidos\">\n");
      out.write("\n");
      out.write("                    <label for=\"email\" class=\"lbl-email\">Usuario</label>\n");
      out.write("                    <input type=\"text\" name=\"usuario\" id=\"email\">\n");
      out.write("\n");
      out.write("                    <label for=\"password\" class=\"lbl-password\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" name=\"pass\" id=\"password\">\n");
      out.write("\n");
      out.write("                    <div class=\"content-check\">\n");
      out.write("                        <a href=\"login.jsp\">¿Ya estas registrado?</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"CREAR CUENTA\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"JS/Script-Registro.js\" type=\"text/javascript\"></script>\n");
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
