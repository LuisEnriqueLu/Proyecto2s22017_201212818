package procesos;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class conexionPython {
    
    public static OkHttpClient ClienteWeb = new OkHttpClient();
    public static String GlobalUsuario;
    public static String GlobalContrasena;
    public static String GlobalIP = "127.0.0.5";
    public static int GlobalTotal = 0;
    public static int GlobalTotalHabitacion = 0;
    public static int GlobalTotalExtra= 0;
    public static String GlobalFechaE = "";
    public static String GlobalFechaS = "";
    public static String Habitacion = "";
    public static String dia = "";
    public static String mes = "";
    public static String anio = "";
    public static String tarjeta = "";    
    
    /******************REGISTRAR USUARIO***********************/
    public String RegistrarUsuario(String usuario, String contrasena, String edad, String telefono, String direccion){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("contrasena", contrasena)
                .add("edad", edad)
                .add("telefono", telefono)
                .add("direccion", direccion)                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "RegistrarUsuario");
        return respuesta;
    }

    /******************LOGIN USUARIO***********************/
    public String LoginUsuario(String usuario, String contrasena){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("contrasena", contrasena)                                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "LoginUsuario");
        return respuesta;
    }

    /******************HABITACIONES***********************/
    public String Habitaciones(String nivel, String numero){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("nivel", nivel)
                .add("numero", numero)
                .add("idHabitacion", nivel+numero)
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "Habitaciones");
        return respuesta;
    }
    
    /******************RETORNAR HABITACIONES***********************/
    public String RetornarHabitaciones(){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("valorPost", "valorPost")                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "RetornarHabitaciones");
        return respuesta;
    }
    
    /******************RESERVACIONES - MATRIZ - HASH***********************/
    public String Reservaciones(String idReservacion, String fechaReservacion, String fechaSalida, String anio, String numeroMes, String dia, String usuario, String numeroTarjeta, int totalGastado){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("anio", anio)
                .add("numeroMes", numeroMes)
                .add("dia", dia)
                .add("idReservacion", idReservacion)
                .add("fechaReservacion", fechaReservacion)
                .add("fechaSalida", fechaSalida)
                .add("usuario", usuario)
                .add("numeroTarjeta", numeroTarjeta)
                .add("totalGastado", String.valueOf(totalGastado))
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "Reservaciones");
        return respuesta;
    }
    
    /******************RESERVACIONES - MATRIZ - HASH***********************/
    public String NivelNumero(String idReservacion){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("idReservacion", idReservacion)                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "NivelNumero");
        return respuesta;
    }
    
    /******************RETORNAR HABITACIONES USUARIO***********************/
    public String retornarHabitacionesUsuarios(){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("nombreUsuario", GlobalUsuario)                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "retornarHabitacionesUsuarios");
        return respuesta;
    }
    
    /**************ACTUALIZAR ESTADO EN ARBOL B HABITACION RESER***********************/
    public String ActualizarHReser(String idHabitacion){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("idHabitacion", idHabitacion)                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "ActualizarHReser");
        return respuesta;
    }
    
    /******************ELIMINAR USUARIO***********************/
    public String EliminarUsuario(String usuario, String contrasena){
        RequestBody cuerpoDatos = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("contrasena", contrasena)                                
                .build();
        String respuesta = ConexionPython(cuerpoDatos, "eliminarUsuario");
        return respuesta;
    }
    
    
    /******************CONECTAR CON PYTHON*******************/
    public static String ConexionPython(RequestBody cuerpoDatos, String NombreMetodo) 
    {
        try {
            URL url = new URL("http://"+ GlobalIP +":5000/"+ NombreMetodo);
            Request request = new Request.Builder().url(url).post(cuerpoDatos).build();
            Response respuestaPython = ClienteWeb.newCall(request).execute();
            return respuestaPython.body().string();
        }catch (MalformedURLException ex) {
            java.util.logging.Logger.getLogger(conexionPython.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch (IOException ex) {
            java.util.logging.Logger.getLogger(conexionPython.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
}
