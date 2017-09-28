package com.example.gianfranco.mbrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    public String usuarioPersona;
    public String clavePersona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.Usuario);
        editText2=(EditText) findViewById(R.id.Password);
    }
    public void pasar(View view){
        usuarioPersona = editText1.getText().toString();
        clavePersona = editText2.getText().toString();

        if(usuarioPersona.isEmpty() || clavePersona.isEmpty()){
            Toast.makeText(this,".. Complete las casillas ..", Toast.LENGTH_SHORT).show();
            return;
        }

        final Usuario usuario = new Usuario(usuarioPersona,clavePersona);
        final UsuarioRepository usuarioRepository = UsuarioRepository.crearPersona();
        String respuesta = usuarioRepository.puente(usuario);

        if(respuesta.equalsIgnoreCase("siCliente")){

            Intent ai = new Intent(this , ClienteActivity.class);
            startActivity(ai);

        }else if (respuesta.equalsIgnoreCase("siSupervisor")){

            Intent ai = new Intent(this , SupervisorActivity.class);
            startActivity(ai);

        }else {

            Toast.makeText(MainActivity.this,".. Datos Incorrectos ..", Toast.LENGTH_LONG).show();

        }
    }
}
