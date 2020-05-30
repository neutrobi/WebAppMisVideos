package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/EstiloLogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Iniciar Sesión</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"content-form\">\n");
      out.write("                <h1>Iniciar Sesión</h1>\n");
      out.write("                <h4>¿Eres usuario nuevo?<a href=\"registro.jsp\">Registrate</a></h4>\n");
      out.write("                <form action=\"iniciar?parametro=sesion\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <label for=\"email\" class=\"lbl-email\">Usuario</label>\n");
      out.write("                    <input type=\"text\" name=\"usuario\" id=\"email\">\n");
      out.write("\n");
      out.write("                    <label for=\"password\" class=\"lbl-password\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" name=\"pass\" id=\"password\">\n");
      out.write("                    <input type=\"submit\" name=\"bl\" value=\"Iniciar Sesión\">\n");
      out.write("                </form>\n");
      out.write("                ");

                    if(request.getAttribute("v") !=null){
                      if(request.getAttribute("v")== "1"){
                          HttpSession ses= request.getSession();
                          ses.setAttribute("s1", request.getAttribute("log"));
                          response.sendRedirect("Comentarios.jsp");
                      }else{
                        out.print("Credenciales incorrectos");
                      }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"JS/Script-Login.js\" type=\"text/javascript\"></script>\n");
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
