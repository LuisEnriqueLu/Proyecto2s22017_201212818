package procesos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controllerLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
                    
            conexionPython.GlobalUsuario = usuario;
            conexionPython.GlobalContrasena = contrasena;
                
            conexionPython conectar = new conexionPython();
            String respuesta = conectar.LoginUsuario(usuario, contrasena);                
            String [] cargar_datos;
            String ObjetoHabitaciones ="";
            
            if(respuesta.equals("True"))
            {
                conexionPython RetornarHabitaciones = new conexionPython();
                String habitaciones = RetornarHabitaciones.RetornarHabitaciones();
                
                if (!habitaciones.equals("nada")){
                    cargar_datos = habitaciones.split("@");                

                    for(int x=0; x<cargar_datos.length; x++)
                    {   
                        if(x%2 == 0){
                            ObjetoHabitaciones += ""
                                    + "<div class=\"col-sm-4\"><div class=\"well\" style=\"color: darkgoldenrod; background-color: rgba(0,0,0,0.2); padding:13px; font-size: 19px;\"><img src=\"img/H1.jpg\" width=\"176\" height=\"110\" style=\"padding-bottom:6px\"><button type=\"button\" class=\"btn btn-primary\" name=\"nombreHabitacion\" value=\""+cargar_datos[x] +"\">"+ cargar_datos[x]+ "</button><a> </a><input type=\"radio\" name=\"radio\" value=\""+cargar_datos[x] +"\"><b>Seleccionar</b></div></div>"
                                    + "";
                        }else{
                            ObjetoHabitaciones += ""
                                    + "<div class=\"col-sm-4\"><div class=\"well\" style=\"color: darkgoldenrod; background-color: rgba(0,0,0,0.2); padding:13px; font-size: 19px;\"><img src=\"img/H2.jpg\" width=\"176\" height=\"110\" style=\"padding-bottom:6px\"><button type=\"button\" class=\"btn btn-info\" name=\"nombreHabitacion\" value=\""+cargar_datos[x] +"\">"+ cargar_datos[x]+ "</button><a> </a><input type=\"radio\" name=\"radio\" value=\""+cargar_datos[x] +"\"><b>Seleccionar</b></div></div>"
                                    + "";
                        }
                    }               

                    request.setAttribute("respuestaPython", "Bienvenido " + conexionPython.GlobalUsuario);
                    request.setAttribute("habitaciones", ObjetoHabitaciones);
                    request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                }else{
                    request.setAttribute("respuestaPython", "Bienvenido " + conexionPython.GlobalUsuario);
                    request.setAttribute("habitacionesDevolver", "");
                    request.getRequestDispatcher("DevolverHabitacion.jsp").forward(request, response);  
                }           
            }
            else{                    
                request.setAttribute("respuestaPython", "Usuario y/o Contraseña Invalido(s)");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet Para Iniciar Sesión";
    }
}
