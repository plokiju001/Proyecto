package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prescripciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("         <head>\n");
      out.write("        \n");
      out.write("        <title>GPM</title>\n");
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
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <a href=\"index.jsp\">\n");
      out.write("        <img src=\"img/Tlajo.png\" width=\"600px\">\n");
      out.write("        </a>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class =\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"panteones.jsp\">PANTEONES</a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\" style=\"background-color: rgba(150,150,150, .2); color: #fff; font-size: 18px; margin-right: 1em; margin-left: 1m\">\n");
      out.write("         \n");
      out.write("              <li><a href=\"prescripciones.jsp\">Prescripciones</a></li>    \n");
      out.write("               <li><a href=\"AdquiTerreno.jsp\">Adquisición de terreno nuevo</a></li>\n");
      out.write("      <li><a href=\"certificados.jsp\">Certificado de derecho de gaveta</a></li>\n");
      out.write("      <li><a href=\"PagoMant.jsp\">Pago de mantenimiento</a></li>\n");
      out.write("      <li><a href=\"ordenPago.jsp\">Orden de pago</a></li>\n");
      out.write("            </ul>          \n");
      out.write("        </div>\n");
      out.write("         </nav>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("        <div class=\"container\" id=\"gavetas\">\n");
      out.write("          \n");
      out.write(" <ul class=\"nav nav-tabs\">\n");
      out.write("  <li class=\"active\"><a data-toggle=\"tab\" href=\"#home\">Home</a></li>\n");
      out.write("       <li><a data-toggle=\"tab\" href=\"#buscar\">Gaveta Antigua</a></li>\n");
      out.write("    <li><a data-toggle=\"tab\" href=\"#formulario\">Gaveta Nueva </a></li>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("             <div class=\"tab-content\">\n");
      out.write("   <div id=\"home\" class=\"tab-pane fade in active\">\n");
      out.write("    <h2>PRESCRIPCIONES</h2>\n");
      out.write("    <p>Por favor selecciona el tipo de gaveta.</p>\n");
      out.write("  </div>   \n");
      out.write("        \n");
      out.write("                \n");
      out.write(" <div id=\"buscar\" class=\"tab-pane fade\">\n");
      out.write("     <br>\n");
      out.write("             <h2>   Buscar ID o Cuenta:</h2>\n");
      out.write("             <br>\n");
      out.write("             <br>\n");
      out.write("             <br>\n");
      out.write("  <form>\n");
      out.write("   <div class=\"input-form-group\">  \n");
      out.write("      <div class=\"col-xs-3\">  \n");
      out.write("     <input type=\"text\" class=\"form-control\" placeholder=\"Buscar ID\">\n");
      out.write("      </div>\n");
      out.write("       <div class=\"input-group-btn\">\n");
      out.write("        <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>     \n");
      out.write("     </div>\n");
      out.write("       <br>\n");
      out.write("        <div class=\"col-xs-3\">  \n");
      out.write("     <input type=\"text\" class=\"form-control\" placeholder=\"Buscar Cuenta\">\n");
      out.write("      </div>\n");
      out.write("       <div class=\"input-group-btn\">\n");
      out.write("        <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>     \n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("             <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                 <div id=\"formulario\" class=\"tab-pane fade\">\n");
      out.write("                \n");
      out.write("  <h2>Actualizar datos:</h2>\n");
      out.write("  <form>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"cuenta\">Cuenta:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"cuenta\">\n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("      <h4><b>Datos del propietario:</b></h4>\n");
      out.write("      <br>   \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"nombre\">Nombre:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"nombre\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"paterno\">Apellido Paterno:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"paterno\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"materno\">Apellido Materno:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"materno\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"calle\">Calle:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"calle\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"numeroExt\">Número Exterior:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"numeroExt\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"numeroInt\">Número Interior:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"numeroInt\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"colonia\">Colonia:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"colonia\">\n");
      out.write("    </div>\n");
      out.write("       <br>\n");
      out.write("                   \n");
      out.write("       <h4><b>Datos de la gaveta:</b></h4>\n");
      out.write("      <br>  \n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"lote\">Lote:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"lote\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"seccion\">Sección:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"seccion\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"localidad\">Localidad:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"localidad\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"panteon\">Panteón:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"panteon\">\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Actualizar</button>\n");
      out.write("    <br>\n");
      out.write("      <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("  </form>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("  </div>          \n");
      out.write("</body> \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
