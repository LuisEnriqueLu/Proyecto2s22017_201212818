package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DevolverHabitacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOTEL EL LOBO</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/hotel.png\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"fonts/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>        \n");
      out.write("        <script src=\"js/login.js\"></script>        \n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-fixed-top\" style=\"background-color: rgba(0,0,0,0.2);\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"nav navbar-nav\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                        <li><a style=\"padding-left: 0px; color: aliceblue; background-color: transparent; font-size: 25px; font-weight:400;\"><img src=\"img/hotel.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> BIENVENIDO A HOTEL EL LOBO</a></li>                    \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"controllerCerrarSesion\" method=\"POST\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"padding-top: 18px; padding-right: 10px\">\n");
      out.write("                    <button style=\"color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;\"><img src=\"img/salida.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> ");
      out.print( request.getAttribute("respuestaPython") );
      out.write(" - Cerrar Sesión </button>\n");
      out.write("                </ul>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"regresar\" method=\"POST\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"padding-top: 18px; padding-right: 10px\">\n");
      out.write("                    <button style=\"color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;\"><img src=\"img/atras.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> Regresar </button>\n");
      out.write("                </ul>\n");
      out.write("                </form>\n");
      out.write("            </div>            \n");
      out.write("        </nav>  \n");
      out.write("        <div class=\"container-fluid\" style=\"color: white;\">\n");
      out.write("            <div class=\"row content\">\n");
      out.write("                <form action=\"devolver\" method=\"POST\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"panel panel-warning\" style=\"border: 2px solid; border-color:#faebcc; color: #8a6d3b; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                    <h2 class=\"panel-title\"><strong>HABITACIONES DISPONIBLES</strong></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    ");

                                        if(null!= request.getAttribute("habitacionesDevolver"))
                                        {
                                            out.print(request.getAttribute("habitacionesDevolver"));
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-success\" style=\"border: 2px solid; border-color:#d6e9c6; color: #a94442; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h2 class=\"panel-title\"><strong>DEVOLVER</strong></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">DEVOLVER HABITACION <span class=\"glyphicon glyphicon-repeat\"></span></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                    \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <footer class=\"footer\" style=\"background-color: rgba(0,0,0,.2); text-align: center; position: fixed; bottom: 0px; width: 100%; height: 45px;\">\n");
      out.write("            <div class=\"container\" style=\"margin-top: 12px\">\n");
      out.write("                <span style=\"color: white;\">Copyright &copy;  HOTEL EL LOBO 2017</span>\n");
      out.write("            </div>\n");
      out.write("        </footer> \n");
      out.write("        <script src=\"js/login.js\"></script>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery1.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
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
