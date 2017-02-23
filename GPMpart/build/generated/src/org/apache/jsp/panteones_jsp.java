package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panteones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <title>GPM</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("         <a href=\"index.jsp\">\n");
      out.write("        <img src=\"img/Tlajo.png\" width=\"600px\">\n");
      out.write("        </a>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class =\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"panteones.jsp\">PANTEONES</a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\" style=\"background-color: rgba(150,150,150, .2); color: #fff; font-size: 18px; margin-right: 1em; margin-left: 1m\">\n");
      out.write("           \n");
      out.write("        <li><a href=\"prescripciones.jsp\">Prescripciones</a></li>    \n");
      out.write("       <li><a href=\"AdquiTerreno.jsp\">Adquisición de terreno nuevo</a></li>        \n");
      out.write("      <li><a href=\"certificados.jsp\">Certificado de derecho de gaveta</a></li>\n");
      out.write("      <li><a href=\"PagoMant.jsp\">Pago de mantenimiento</a></li>\n");
      out.write("      <li><a href=\"ordenPago.jsp\">Orden de pago</a></li>\n");
      out.write("  <li><a href=\"#\">Sesión</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("          </nav>\n");
      out.write("         <div class=\"container\" id=\"panteones\">\n");
      out.write("             \n");
      out.write("             <div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">Dropdown</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"#\">Panteón 01</a>\n");
      out.write("    <a href=\"#\">Panteón 02</a>\n");
      out.write("    <a href=\"#\">Panteón 03</a>\n");
      out.write("      <a href=\"#\">Panteón 03</a>\n");
      out.write("        <a href=\"#\">Panteón 03</a>\n");
      out.write("          <a href=\"#\">Panteón 03</a>\n");
      out.write("            <a href=\"#\">Panteón 03</a>\n");
      out.write("              <a href=\"#\">Panteón 03</a>\n");
      out.write("                <a href=\"#\">Panteón 03</a>\n");
      out.write("                  <a href=\"#\">Panteón 03</a>\n");
      out.write("                    <a href=\"#\">Panteón 03</a>\n");
      out.write("                      <a href=\"#\">Panteón 03</a>\n");
      out.write("                        <a href=\"#\">Panteón 03</a>\n");
      out.write("                          <a href=\"#\">Panteón 03</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("          \n");
      out.write(" ");
      out.write("        \n");
      out.write("  </div>    \n");
      out.write("              \n");
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
