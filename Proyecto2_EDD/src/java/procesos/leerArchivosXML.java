package procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.jdom.Document;	
import org.jdom.Element;		
import org.jdom.JDOMException;	
import org.jdom.input.SAXBuilder;

public class leerArchivosXML {
    
    String GlobalDato = "";
    String Usuario = "";
    String Tarjeta = "";
    String Habitacion = "";
    String fechaIngreso = "";
    String fechaSalida = "";
    String extra="";
    int cont=0;
    int totalExtras=0;
    
    public String usuariosXML()
    {
        SAXBuilder builder = new SAXBuilder();
        String respuesta = "";
	File xmlFile = new File("C:\\Users\\l_enr\\Documents\\tempUsuarios.xml" );        
        try{ 
            
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List lista_campos = rootNode.getChildren("usuario");

            for ( int j = 0; j < lista_campos.size(); j++ )
            {
                Element campo = (Element)lista_campos.get( j );
                String nombre = campo.getChildTextTrim("nombre");
                String contra = campo.getChildTextTrim("password");
                String direccion = campo.getChildTextTrim("direccion");
                String telefono = campo.getChildTextTrim("telefono");
                String edad = campo.getChildTextTrim("edad");                
                
                conexionPython conectar = new conexionPython();
                conectar.RegistrarUsuario(nombre, contra, edad, telefono, direccion);
                
                respuesta += "\t"+nombre+"\t"+contra+"\t"+direccion+"\t"+telefono+"\t"+edad+"\n";                
            }           

        }catch(IOException | JDOMException io){
            System.out.println(io.getMessage());            
        }        
        return respuesta;
    }
    
    public String habitacionesXML()
    {
        SAXBuilder builder = new SAXBuilder();
        String respuesta = "";
	File xmlFile = new File("C:\\Users\\l_enr\\Documents\\tempHabitaciones.xml" );        
        try{ 
            
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List lista_campos = rootNode.getChildren("habitación");

            for ( int j = 0; j < lista_campos.size(); j++ )
            {
                Element campo = (Element)lista_campos.get( j );
                String nivel = campo.getChildTextTrim("nivel");
                String numero = campo.getChildTextTrim("numero");
                
                conexionPython conectar = new conexionPython();
                conectar.Habitaciones(nivel, numero);
                
                respuesta += "\t"+nivel+"\t"+numero+"\n";                
            }           

        }catch(IOException | JDOMException io){
            System.out.println(io.getMessage());            
        }        
        return respuesta;
    }
    
    public String reservacionesXML()
    {
        try{
            File xmlFile = new File("C:\\Users\\l_enr\\Documents\\tempReservaciones.xml");
            FileReader datos = new FileReader(xmlFile);
            BufferedReader leer = new BufferedReader(datos);
            String linea = leer.readLine();
            
            while(linea != null)
            {
                GlobalDato += linea;
                linea = leer.readLine();
            }            
            AnalizadorLexico(GlobalDato);
            return Usuario + Tarjeta + Habitacion + fechaIngreso + fechaSalida + extra;
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
            return "";
        }
    }
    
    public void AnalizadorLexico (String cadena)
    {
        int inicioestado=0;             
        int estadoprincipal =0;         
        char cadenaconcatenar;        
        String token = "";
        
        for(inicioestado=0; inicioestado<cadena.length(); inicioestado++ )
        {
            cadenaconcatenar = cadena.charAt(inicioestado);
            int codigoAscci = cadenaconcatenar;
            
            switch(estadoprincipal)
            {
                case 0: //Reservaciones //Reservacion
                    if(cadenaconcatenar == ' ' || cadenaconcatenar == '\r' || cadenaconcatenar == '\t' || cadenaconcatenar == '\n' || cadenaconcatenar == '\b' || cadenaconcatenar == '\f')
                    {
                        estadoprincipal = 0;
                    }
                    else if(cadenaconcatenar == '<')
                    { 
                        estadoprincipal = 0;
                        token += cadenaconcatenar;
                    }                    
                    else if((codigoAscci >= 65 && codigoAscci <=90) || (codigoAscci >=97 && codigoAscci <=122))
                    {
                        estadoprincipal = 0;
                        token +=cadenaconcatenar;
                    }                    
                    else if(cadenaconcatenar == '>')
                    {
                        token +=cadenaconcatenar;
                        if(token.equals("<reservaciones>"))
                        {
                            estadoprincipal = 0;
                            token="";
                        }
                        else if(token.equals("<reservacion>"))
                        {
                            estadoprincipal = 1;
                            token="";
                        }
                        else if(token.equals("</reservacion>"))
                        {
                            String anio=fechaIngreso.substring(0,4);
                            String mes=fechaIngreso.substring(4,6);
                            String dia=fechaIngreso.substring(6,8);                            
                            
                            if(cont == 1)
                                totalExtras=75;            
                            if(cont == 2)
                                totalExtras=150;
                            if(cont == 3)
                                totalExtras=225;
                            if(cont == 4)
                                totalExtras=275;
                            if(cont == 5)
                                totalExtras=325;
                            
                            int total = 200*Integer.parseInt(Habitacion.substring(1)) + Integer.parseInt(Habitacion.substring(2,3));
                            conexionPython insertarMatriz = new conexionPython();
                            insertarMatriz.Reservaciones(Habitacion, dia+mes+anio, fechaSalida, anio, mes, dia, Usuario, Tarjeta, total);
                            Usuario="";
                            Tarjeta="";
                            Habitacion="";
                            fechaIngreso="";
                            fechaSalida="";
                            cont=0;
                            estadoprincipal=0;
                            token="";
                        }
                        else if(token.equals("</reservaciones>"))
                        {
                            estadoprincipal = 0;
                            token="";
                        }
                        else if(token.equals("</extras>"))
                        {
                            estadoprincipal = 1;
                            token="";
                            extra +=1;                            
                        }
                    }   
                break;
                
                case 1: //Tag de Apertura
                    if(cadenaconcatenar == ' ' || cadenaconcatenar == '\r' || cadenaconcatenar == '\t' || cadenaconcatenar == '\n' || cadenaconcatenar == '\b' || cadenaconcatenar == '\f')
                    {
                        estadoprincipal = 1;
                    }
                    else if(cadenaconcatenar == '<')
                    { 
                        estadoprincipal = 1;
                        token += cadenaconcatenar;
                    }                    
                    else if((codigoAscci >= 65 && codigoAscci <=90) || (codigoAscci >=97 && codigoAscci <=122))
                    {
                        estadoprincipal = 1;
                        token +=cadenaconcatenar;
                    }
                    else if(cadenaconcatenar == '>')
                    {
                        estadoprincipal = 2;
                        token +=cadenaconcatenar;                        
                    }
                    else if(cadenaconcatenar == '/')
                    {
                        estadoprincipal = 0;
                        token +=cadenaconcatenar;                        
                    }
                break;
                
                case 2: //Contenido de la Tag
                    if(cadenaconcatenar == '\r' || cadenaconcatenar == '\t' || cadenaconcatenar == '\n' || cadenaconcatenar == '\b' || cadenaconcatenar == '\f')
                    {
                        estadoprincipal = 2;
                    }
                    else if((codigoAscci >= 65 && codigoAscci <=90) || (codigoAscci >=97 && codigoAscci <=122) || (codigoAscci >= 48 && codigoAscci <=57) || cadenaconcatenar == ' ')
                    {
                        switch (token) {
                            case "<usuario>":
                                estadoprincipal = 2;
                                Usuario +=cadenaconcatenar;
                                break;
                            case "<tarjeta>":
                                estadoprincipal = 2;
                                Tarjeta +=cadenaconcatenar;
                                break;
                            case "<habitacion>":
                                estadoprincipal = 2;
                                Habitacion +=cadenaconcatenar;
                                break;
                            case "<fechaIngreso>":
                                estadoprincipal = 2;
                                fechaIngreso +=cadenaconcatenar;
                                break;
                            case "<fechaSalida>":
                                estadoprincipal = 2;
                                fechaSalida +=cadenaconcatenar;
                                break;
                            case "<extra>":
                                estadoprincipal = 2;
                                extra +=cadenaconcatenar;
                                break;
                        }
                    }
                    else if(cadenaconcatenar == '<' && !token.equals("<extras>"))
                    { 
                        if(token.equals("<extra>")){
                            cont++;
                        }
                        estadoprincipal = 3;
                        token="";                        
                    }
                    else if(cadenaconcatenar == '<' && token.equals("<extras>"))
                    { 
                        token="";                        
                        estadoprincipal = 1;
                        token+= cadenaconcatenar;                        
                    }
                break;
                
                case 3: //Tag de Cierre
                    if(cadenaconcatenar == ' ' || cadenaconcatenar == '\r' || cadenaconcatenar == '\t' || cadenaconcatenar == '\n' || cadenaconcatenar == '\b' || cadenaconcatenar == '\f')
                    {
                        estadoprincipal = 3;
                    }
                    else if(cadenaconcatenar == '/')
                    { 
                        estadoprincipal = 3;                        
                    }                    
                    else if((codigoAscci >= 65 && codigoAscci <=90) || (codigoAscci >=97 && codigoAscci <=122))
                    {
                        estadoprincipal = 3;                        
                    }
                    else if(cadenaconcatenar == '>')
                    {
                        estadoprincipal = 1;                        
                    }
                break;
            }
        }   
    }
}
