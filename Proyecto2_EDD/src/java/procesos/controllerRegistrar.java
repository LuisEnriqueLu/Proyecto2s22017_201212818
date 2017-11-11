package procesos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controllerRegistrar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
            String edad = request.getParameter("edad");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");            
            
            conexionPython conectar = new conexionPython();
            String respuesta = conectar.RegistrarUsuario(usuario, contrasena, edad, telefono, direccion);
            request.setAttribute("respuestaPython", respuesta);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
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
        return "Servlet Para Registrar Usuarios";
    }
}
