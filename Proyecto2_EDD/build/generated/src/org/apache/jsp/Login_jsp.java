package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html style=\"min-height: 100%; position: relative;\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOTEL EL LOBO</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/hotel.png\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"fonts/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/estilos.ccs\" rel=\"stylesheet\">          \n");
      out.write("    </head>    \n");
      out.write("    <body style=\"padding-top: 50px\">\n");
      out.write("        <nav class=\"navbar navbar-fixed-top\" style=\"background-color: transparent;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"padding-top: 18px; padding-right: 10px\">\n");
      out.write("                    <form action=\"CargarArchivos.jsp\">\n");
      out.write("                        <img src=\"img/archivo.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"><input type=\"submit\" style=\"color: aliceblue; background-color: transparent; font-size: 20px; font-weight:400; border:transparent;\" value=\"CARGAR ARCHIVOS\">                        \n");
      out.write("                        <a href=\"CrearModEliminar.jsp\"><button style=\"color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;\"><img src=\"img/archivo.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> Crear - Modificar - Eliminar </button></a>\n");
      out.write("                    </form>\n");
      out.write("                </ul>\n");
      out.write("            </div>            \n");
      out.write("        </nav> \n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 col-md-offset-3\">                    \n");
      out.write("                    <div class=\"panel panel-login\">          \n");
      out.write("                        <div class=\"panel-body\">                            \n");
      out.write("                            <div class=\"col-md-12\">                        \n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <h3 style=\"color: #2D3B55; text-align: center\"></p><img src=\"img/hotel.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> BIENVENIDO A HOTEL EL LOBO</h3> \n");
      out.write("                                </div>                        \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"color: #2D3B55;\">                                \n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <form id=\"login-form\" action=\"controllerLogin\" method=\"POST\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                        <h2><p class=\"glyphicon glyphicon-log-in\"></p>  INICIAR SESIÓN</h2>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"usuario\" tabindex=\"1\" class=\"form-control\" placeholder=\"Nombre de Usuario\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"contrasena\" tabindex=\"2\" class=\"form-control\" placeholder=\"Contraseña\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>                                        \n");
      out.write("                                        <div class=\"col-xs-6 form-group pull-right\">     \n");
      out.write("                                            <input type=\"submit\" name=\"btnLogin\" tabindex=\"6\" class=\"form-control btn btn-login\" value=\"Iniciar Sesión\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <form id=\"register-form\" action=\"controllerRegistrar\" method=\"POST\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                        <h2><p class=\"glyphicon glyphicon-log-out\"></p>  REGISTRO DE USUARIOS</h2>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"usuario\" tabindex=\"1\" class=\"form-control\" placeholder=\"Nombre de Usuario\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"contrasena\" tabindex=\"2\" class=\"form-control\" placeholder=\"Contraseña\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-6 form-group pull-left\">\n");
      out.write("                                            <input type=\"text\" name=\"edad\" tabindex=\"3\" class=\"form-control\" placeholder=\"Edad\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>                                        \n");
      out.write("                                        <div class=\"col-xs-6 form-group pull-right\">\n");
      out.write("                                            <input type=\"text\" name=\"telefono\" tabindex=\"4\" class=\"form-control\" placeholder=\"Telefono\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"direccion\" tabindex=\"5\" class=\"form-control\" placeholder=\"Direccion\" required=\"\" style=\"font-weight:400;\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                    <input type=\"submit\" name=\"register-submit\" tabindex=\"6\" class=\"form-control btn btn-register\" value=\"Registrar\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                                    \n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6 tabs\">\n");
      out.write("                                    <a href=\"#\" class=\"active\" id=\"login-form-link\"><div class=\"login\" style=\"font-weight:400;\"><img src=\"img/login.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> INICIAR SESIÓN</div></a>                                        \n");
      out.write("                                </div>                                \n");
      out.write("                                <div class=\"col-xs-6 tabs\">\n");
      out.write("                                    <a href=\"#\" id=\"register-form-link\"><div style=\"text-align: left\" class=\"register\" style=\"font-weight:400;\"><img src=\"img/log.png\" width=\"30\" height=\"35\" style=\"padding-bottom:6px\"> REGISTRAR USUARIOS</div></a>                                        \n");
      out.write("                                </div>                                              \n");
      out.write("                            </div>                                \n");
      out.write("                        </div>                        \n");
      out.write("                    </div>                        \n");
      out.write("                </div>                    \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"margin-top:0px\">\n");
      out.write("                <div class=\"col-md-6 col-md-offset-3\">                    \n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h3 style=\"color: #2D3B55; text-align: center\">\n");
      out.write("                        ");

                            if(null!= request.getAttribute("respuestaPython"))
                            {
                            out.print(request.getAttribute("respuestaPython"));
                            }
                        
      out.write("</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("        </div>        \n");
      out.write("        <footer class=\"footer\" style=\"background-color: rgba(0,0,0,.2); text-align: center; position: fixed; bottom: 0px; width: 100%; height: 45px;\">\n");
      out.write("            <div class=\"container\" style=\"margin-top: 12px\">\n");
      out.write("                <span style=\"color: white;\">Copyright &copy;  HOTEL EL LOBO 2017</span>\n");
      out.write("            </div>\n");
      out.write("        </footer> \n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery1.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>        \n");
      out.write("        <script src=\"js/login.js\"></script>  \n");
      out.write("    </body> \n");
      out.write("</html>");
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
