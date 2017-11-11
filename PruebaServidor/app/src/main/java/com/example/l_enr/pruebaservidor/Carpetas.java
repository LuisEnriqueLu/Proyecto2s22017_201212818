package com.example.l_enr.pruebaservidor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class Carpetas extends AppCompatActivity {

    private Button btnCrearCarpeta;
    private Button btnCambiarCarpeta;
    private EditText txtCrearCarpeta;
    private EditText txtCambiarCarpeta;
    OkHttpClient webClient = new OkHttpClient();
    String respuestaPython="192.168.43.19";
    RequestBody formBody;
    RequestBody formBody1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpetas);

        btnCrearCarpeta = (Button) findViewById(R.id.btnCrear);
        txtCrearCarpeta  = (EditText) findViewById(R.id.txtCarpeta);
        btnCambiarCarpeta = (Button) findViewById(R.id.btnCambiar);
        txtCambiarCarpeta  = (EditText) findViewById(R.id.txtNuevoNombre);

        btnCrearCarpeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String respuesta = CambiarCarpeta();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnCambiarCarpeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String respuesta = CambiarCarpeta();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*public String CrearCarpeta() throws IOException {
        String carpeta = txtCrearCarpeta.getText().toString();

        String [] cargar_datos;

        String codigoCarpeta = "";
        String numeroAConcatenar;
        int posicionCaracter = 0;
        int codigoAscii;

        for (posicionCaracter = 0; posicionCaracter<carpeta.length(); posicionCaracter++)
        {
            codigoAscii = carpeta.charAt(posicionCaracter);
            numeroAConcatenar = Integer.toString(codigoAscii);
            codigoCarpeta = codigoCarpeta + numeroAConcatenar;
        }

        RequestBody DatosAEnviar = new FormEncodingBuilder()
                .add("usuario", conexion.usuario)
                .add("contrasena", conexion.contrasena)
                .add("nombreCarpeta", carpeta)
                .add("idCarpeta", codigoCarpeta)
                .build();

        formBody = DatosAEnviar;
        String respuesta = ConexionPythonRegistrarUsuario();
        return respuesta;
    }*/

    public String CambiarCarpeta() throws IOException {
        String carpeta = txtCrearCarpeta.getText().toString();
        String nuevoNombre = txtCambiarCarpeta.getText().toString();

        String [] cargar_datos;

        String codigoCarpeta = "";
        String numeroAConcatenar;
        int posicionCaracter = 0;
        int codigoAscii;

        for (posicionCaracter = 0; posicionCaracter<carpeta.length(); posicionCaracter++)
        {
            codigoAscii = carpeta.charAt(posicionCaracter);
            numeroAConcatenar = Integer.toString(codigoAscii);
            codigoCarpeta = codigoCarpeta + numeroAConcatenar;
        }


        String [] cargar_datos1;

        String codigoCarpeta1 = "";
        String numeroAConcatenar1;
        int posicionCaracter1 = 0;
        int codigoAscii1;

        for (posicionCaracter1 = 0; posicionCaracter1<nuevoNombre.length(); posicionCaracter1++)
        {
            codigoAscii1 = nuevoNombre.charAt(posicionCaracter1);
            numeroAConcatenar1 = Integer.toString(codigoAscii1);
            codigoCarpeta1 = codigoCarpeta1 + numeroAConcatenar1;
        }



        RequestBody DatosAEnviar = new FormEncodingBuilder()
                .add("usuario", conexion.usuario)
                .add("contrasena", conexion.contrasena)
                .add("idCarpeta", codigoCarpeta)
                .add("'nuevoNombre'", nuevoNombre)
                .add("'idNuevo'", codigoCarpeta1)
                .build();

        formBody1 = DatosAEnviar;
        String respuesta = ConexionPythonCambiarCarpeta();
        return respuesta;
    }


    public String ConexionPythonCambiarCarpeta(){

        //Se Crea un Hilo
        Thread nt = new Thread(){

            @Override
            public void run(){
                try {
                    URL url = new URL("http://"+respuestaPython+":5000/CambiarNombreCarpetas");
                    Request request = new Request.Builder().url(url).post(formBody1).build();
                    Response response = webClient.newCall(request).execute();
                    respuestaPython = response.body().string();
                } catch (MalformedURLException ex) {
                    java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Carpetas.this, respuestaPython, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Carpetas.this, Carpetas.class);
                        startActivityForResult(intent,0);
                    }
                });
            }
        };

        nt.start(); //Ejecutamos el Hilo
        return respuestaPython;
    }

    /*public String ConexionPythonRegistrarUsuario(){

        //Se Crea un Hilo
        Thread nt = new Thread(){

            @Override
            public void run(){
                try {
                    URL url = new URL("http://"+respuestaPython+":5000/crearCarpetaUsuario");
                    Request request = new Request.Builder().url(url).post(formBody).build();
                    Response response = webClient.newCall(request).execute();
                    respuestaPython = response.body().string();
                } catch (MalformedURLException ex) {
                    java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Carpetas.this, respuestaPython, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Carpetas.this, Carpetas.class);
                        startActivityForResult(intent,0);
                    }
                });
            }
        };

        nt.start(); //Ejecutamos el Hilo
        return respuestaPython;
    }*/

}
