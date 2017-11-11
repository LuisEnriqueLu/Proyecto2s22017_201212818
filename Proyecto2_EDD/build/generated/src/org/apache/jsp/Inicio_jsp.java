package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import procesos.conexionPython;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
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
      out.write("                </form>                \n");
      out.write("            </div>            \n");
      out.write("        </nav> \n");
      out.write("        <div class=\"container-fluid\" style=\"color: white;\">\n");
      out.write("            <div class=\"row content\">\n");
      out.write("                <form action=\"reservar\" method=\"POST\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"panel panel-warning\" style=\"border: 2px solid; border-color:#faebcc; color: #8a6d3b; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h2 class=\"panel-title\"><strong>HABITACIONES DISPONIBLES</strong></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    ");

                                        if(null!= request.getAttribute("habitaciones"))
                                        {
                                            out.print(request.getAttribute("habitaciones"));
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>                    \n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-info\" style=\"border: 2px solid; border-color:#bce8f1; color: darkblue; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h2 class=\"panel-title\"><strong>EXTRAS - FECHA RESERVACIÓN</strong></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\" style=\"font-size: 18px\">                            \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"Limpieza\" name=\"ch1\">Limpieza\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"Cable\" name=\"ch2\">Cable\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"Internet\" name=\"ch3\">Internet\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"Comida\" name=\"ch4\">Comida\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"Netflix\" name=\"ch5\">Netflix\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> \n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h4>Fecha E</h4>\n");
      out.write("                                        <div class=\"form-group has-success\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputSuccess\">Dia</label>\n");
      out.write("                                            <input name=\"diaE\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #3c763d\" class=\"form-control\" id=\"inputSuccess\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-warning\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputWarning\">Mes</label>\n");
      out.write("                                            <input name=\"mesE\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #8a6d3b\" class=\"form-control\" id=\"inputWarning\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-error\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputError\">Año</label>\n");
      out.write("                                            <input name=\"anioE\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #a94442\" class=\"form-control\" id=\"inputError\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h4>Fecha S</h4>\n");
      out.write("                                        <div class=\"form-group has-success\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputSuccess\">Dia</label>\n");
      out.write("                                            <input name=\"diaS\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #3c763d\" class=\"form-control\" id=\"inputSuccess\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-warning\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputWarning\">Mes</label>\n");
      out.write("                                            <input name=\"mesS\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #8a6d3b\" class=\"form-control\" id=\"inputWarning\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-error\">\n");
      out.write("                                            <label class=\"control-label\" for=\"inputError\">Año</label>\n");
      out.write("                                            <input name=\"anioS\" type=\"text\" style=\"color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #a94442\" class=\"form-control\" id=\"inputError\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success btn-circle btn-lg\"><i class=\"glyphicon glyphicon-ok\"></i></button>\n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <form action=\"pagar\" method=\"POST\">\n");
      out.write("                        <div class=\"panel panel-danger\" style=\"border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h2 class=\"panel-title\"><strong>PAGAR</strong></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"alert alert-success\" style=\"color: #333; background-color: #f5f5f5; border-color: #ddd; font-size: 15px; padding:10px;\">\n");
      out.write("                                    <strong>Fecha de Entrada: \n");
      out.write("                                        ");

                                            if(null!= request.getAttribute("fechaE"))
                                            {
                                                out.print(request.getAttribute("fechaE"));
                                            }
                                        
      out.write("                                \n");
      out.write("                                    </strong>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"alert alert-info\" style=\"font-size: 15px; padding:10px;\">\n");
      out.write("                                    <strong>Fecha de Salida: \n");
      out.write("                                        ");

                                            if(null!= request.getAttribute("fechaS"))
                                            {
                                                out.print(request.getAttribute("fechaS"));
                                            }
                                        
      out.write("                                \n");
      out.write("                                    </strong>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"alert alert-success\" style=\"font-size: 15px; padding:10px;\">\n");
      out.write("                                    <strong>Costo de Habitación: \n");
      out.write("                                        ");

                                            if(null!= request.getAttribute("totalHabitacion"))
                                            {
                                                out.print(request.getAttribute("totalHabitacion"));
                                            }
                                        
      out.write(" \n");
      out.write("                                    </strong>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"alert alert-warning\" style=\"font-size: 15px; padding:10px;\">\n");
      out.write("                                    <strong>Total de Extras: \n");
      out.write("                                        ");

                                            if(null!= request.getAttribute("totalExtras"))
                                            {
                                                out.print(request.getAttribute("totalExtras"));
                                            }
                                        
      out.write("\n");
      out.write("                                    </strong>\n");
      out.write("                                </div>                            \n");
      out.write("                                <div class=\"alert alert-danger\" style=\"font-size: 15px; padding:10px;\">\n");
      out.write("                                    <strong>Total a Pagar Q.\n");
      out.write("                                        ");

                                            if(null!= request.getAttribute("total"))
                                            {
                                                out.print(request.getAttribute("total"));
                                            }
                                        
      out.write("\n");
      out.write("                                    </strong>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\" style=\"color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: #f2dede;\"><strong>No. Tarjeta</strong></span>\n");
      out.write("                                    <input type=\"text\" name=\"tarjeta\" class=\"form-control\" style=\"font-size: 19px; color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: rgba(0,0,0,0);\">\n");
      out.write("                                    <span class=\"input-group-addon\" style=\"color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: #f2dede;\"><strong>$</strong></span>\n");
      out.write("                                </div>                            \n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-warning\">PAGAR <span class=\"glyphicon glyphicon-euro\"></span></button>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>             \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <form action=\"habitacionesADevolver\" method=\"POST\">\n");
      out.write("                        <div class=\"panel panel-success\" style=\"border: 2px solid; border-color:#d6e9c6; color: #a94442; background-color: rgba(0,0,0,0.1);\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h2 class=\"panel-title\"><strong>Devolver</strong></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">DEVOLVER HABITACIONES <span class=\"glyphicon glyphicon-repeat\"></span></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <footer class=\"footer\" style=\"background-color: rgba(0,0,0,.2); text-align: center; bottom: 0px; width: 100%; height: 45px;\">\n");
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
      out.write("\n");
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
