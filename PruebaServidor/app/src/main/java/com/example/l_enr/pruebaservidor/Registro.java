package com.example.l_enr.pruebaservidor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Registro extends AppCompatActivity {

    private Button btnRegistro;
    private EditText txtUsuario;
    private EditText txtContrasena;
    private TextView txtRest;
    OkHttpClient webClient = new OkHttpClient();
    String respuestaPython="192.168.43.19";
    RequestBody formBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistro = (Button) findViewById(R.id.btnRegistrar);
        txtContrasena  = (EditText) findViewById(R.id.txtContra);
        txtUsuario= (EditText) findViewById(R.id.txtNombre);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EnviarDatos();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

        Thread nt = new Thread(){

            @Override
            public void run(){
                try {
                    URL url = new URL("http://"+respuestaPython+":5000/registrarUsuario");
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
                        Toast.makeText(Registro.this, respuestaPython, Toast.LENGTH_LONG).show();
                    }
                });
            }
        };

        nt.start();
        return respuestaPython;
    }
}
