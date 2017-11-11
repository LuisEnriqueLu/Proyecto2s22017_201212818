package procesos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reservar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String ch1 = request.getParameter("ch1");
            String ch2 = request.getParameter("ch2");
            String ch3 = request.getParameter("ch3");
            String ch4 = request.getParameter("ch4");
            String ch5 = request.getParameter("ch5");
            String diaE = request.getParameter("diaE");
            String mesE = request.getParameter("mesE");
            String anioE = request.getParameter("anioE");
            String diaS = request.getParameter("diaS");
            String mesS = request.getParameter("mesS");
            String anioS = request.getParameter("anioS");
            String radio = request.getParameter("radio");            
            
            conexionPython conectar = new conexionPython();
            int countExtras = 0;
            int totalExtras = 0;
            int totalHabitacion=0;
            int total=0;
            String ObjetoHabitaciones ="";
            String fechaE=anioE+mesE+diaE;
            String fechaS=anioS+mesS+diaS;             
            String [] cargar_datos;
            String [] cargar_datosH;
            
            //Extras
            if(ch1 != null)
                countExtras++;            
            if(ch2 != null)
                countExtras++;
            if(ch3 != null)
                countExtras++;
            if(ch4 != null)
                countExtras++;
            if(ch5 != null)
                countExtras++; 
            //Costo Extras
            if(countExtras == 1)
                totalExtras=75;            
            if(countExtras == 2)
                totalExtras=150;
            if(countExtras == 3)
                totalExtras=225;
            if(countExtras == 4)
                totalExtras=275;
            if(countExtras == 5)
                totalExtras=325;             
            
            
            String nivelNum = conectar.NivelNumero(radio);
            cargar_datos = nivelNum.split(","); 
            
            totalHabitacion = 200*Integer.parseInt(cargar_datos[0]) + Integer.parseInt(cargar_datos[1]); 
            total = totalHabitacion + totalExtras;

            String habitaciones = conectar.RetornarHabitaciones();
            cargar_datosH = habitaciones.split("@");                
            
            for(int x=0; x<cargar_datosH.length; x++)
            {   
                if(x%2 == 0){
                    ObjetoHabitaciones += ""
                            + "<div class=\"col-sm-4\"><div class=\"well\" style=\"color: darkgoldenrod; background-color: rgba(0,0,0,0.2); padding:13px; font-size: 19px;\"><img src=\"img/H1.jpg\" width=\"176\" height=\"110\" style=\"padding-bottom:6px\"><button type=\"button\" class=\"btn btn-primary\" name=\"nombreHabitacion\" value=\""+cargar_datosH[x] +"\">"+ cargar_datosH[x]+ "</button><a> </a><input type=\"radio\" name=\"radio\" value=\""+cargar_datosH[x] +"\">Seleccionar</div></div>"
                            + "";
                }else{
                    ObjetoHabitaciones += ""
                            + "<div class=\"col-sm-4\"><div class=\"well\" style=\"color: darkgoldenrod; background-color: rgba(0,0,0,0.2); padding:13px; font-size: 19px;\"><img src=\"img/H2.jpg\" width=\"176\" height=\"110\" style=\"padding-bottom:6px\"><button type=\"button\" class=\"btn btn-info\" name=\"nombreHabitacion\" value=\""+cargar_datosH[x] +"\">"+ cargar_datosH[x]+ "</button><a> </a><input type=\"radio\" name=\"radio\" value=\""+cargar_datosH[x] +"\">Seleccionar</div></div>"
                            + "";
                }
            }

            conexionPython.GlobalTotal = total;
            conexionPython.GlobalTotalExtra = totalExtras;
            conexionPython.GlobalTotalHabitacion = totalHabitacion;
            conexionPython.GlobalFechaS = fechaS;
            conexionPython.GlobalFechaE = fechaE;
            conexionPython.Habitacion = radio;
            conexionPython.anio = anioE;
            conexionPython.dia = diaE;
            conexionPython.mes = mesE;
            
            request.setAttribute("fechaE", fechaE);
            request.setAttribute("fechaS", fechaS);
            request.setAttribute("totalHabitacion", totalHabitacion);
            request.setAttribute("totalExtras", totalExtras);
            request.setAttribute("total", total);
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
