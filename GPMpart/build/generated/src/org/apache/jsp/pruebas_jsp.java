package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pruebas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <title>GPM</title>\n");
      out.write("            \n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/tlajo_en_movimiento_favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome-4.6.1/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"iconFonts/material-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/typeahead.min.js\"></script>\n");
      out.write("        <script src=\"js/acciones.js\"></script>\n");
      out.write("        <script src=\"js/validator.js\"></script>\n");
      out.write("        <script src=\"js/jquery-barcode.min.js\"></script>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">  \n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"menu-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Drop Down<b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"menu-item dropdown dropdown-submenu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Level 1</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"#\">Link 1</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item dropdown dropdown-submenu\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Level 2</a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">Link 3</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
