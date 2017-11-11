package com.example.l_enr.pruebaservidor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

public class MainActivity extends AppCompatActivity {

    private Button btnConectarPython;
    private Button btnRegistro;
    private EditText txtUsuario;
    private EditText txtContrasena;
    //private TextView txtRest;
    OkHttpClient webClient = new OkHttpClient();
    String respuestaPython="127.0.0.1";
    RequestBody formBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConectarPython = (Button) findViewById(R.id.btnRegistrarse);
        btnRegistro = (Button) findViewById(R.id.btnRegistrar);
        txtContrasena  = (EditText) findViewById(R.id.txtcontrasena);
        txtUsuario= (EditText) findViewById(R.id.txtnombre);
        //txtRest = (TextView) findViewById(R.id.txtResult);

        btnConectarPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String respuesta = EnviarDatos();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivityForResult(intent,0);
            }
        });

    }

    public String EnviarDatos() throws IOException {
        String usuario = txtUsuario.getText().toString();
        String contrasena = txtContrasena.getText().toString();
        RequestBody DatosAEnviar = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("contrasena", contrasena)
                .build();

        formBody = DatosAEnviar;
        String respuesta = ConexionPythonRegistrarUsuario();
        return respuesta;
    }

    public String ConexionPythonRegistrarUsuario(){

        conexion.usuario = txtUsuario.getText().toString();
        conexion.contrasena = txtContrasena.getText().toString();
        //Se Crea un Hilo
        Thread nt = new Thread(){

           @Override
            public void run(){
               try {
                   URL url = new URL("http://"+respuestaPython+":5000/loginUsuario");
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
                       //txtRest.setText(respuestaPython);
                       Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_LONG).show();
                       if(respuestaPython.equals("True"))
                       {
                           Intent intent = new Intent(MainActivity.this, Carpetas.class);
                           startActivityForResult(intent,0);
                       }
                       else{
                           Intent intent = new Intent(MainActivity.this, MainActivity.class);
                           startActivityForResult(intent,0);
                       }
                   }
               });
            }
        };

        nt.start(); //Ejecutamos el Hilo
        return respuestaPython;
    }
}
