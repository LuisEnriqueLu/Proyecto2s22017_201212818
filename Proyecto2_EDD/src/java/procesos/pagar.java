package procesos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pagar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String tarjeta = request.getParameter("tarjeta");            
            conexionPython.tarjeta = tarjeta;
            String fechaReser = "";
            fechaReser = conexionPython.GlobalFechaE.substring(6, 8) + conexionPython.GlobalFechaE.substring(4, 6) + conexionPython.GlobalFechaE.substring(0, 4);
            
            conexionPython insertarMatriz = new conexionPython();
            String reservaciones = insertarMatriz.Reservaciones(conexionPython.Habitacion, fechaReser, conexionPython.GlobalFechaS, conexionPython.anio, conexionPython.mes, conexionPython.dia, conexionPython.GlobalUsuario, conexionPython.tarjeta, conexionPython.GlobalTotal);
            
            conexionPython.GlobalTotal = 0;
            conexionPython.GlobalTotalExtra = 0;
            conexionPython.GlobalTotalHabitacion = 0;
            conexionPython.GlobalFechaS = "";
            conexionPython.GlobalFechaE = "";
            conexionPython.Habitacion = "";
            conexionPython.anio = "";
            conexionPython.dia = "";
            conexionPython.mes = "";
            conexionPython.tarjeta = "";
            
            String [] cargar_datos;
            String ObjetoHabitaciones ="";
            
            conexionPython RetornarHabitaciones = new conexionPython();
            String habitaciones = RetornarHabitaciones.RetornarHabitaciones();
                
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
        return "Short description";
    }
}
