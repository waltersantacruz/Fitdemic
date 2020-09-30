package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PreguntasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
    }

    public void onClickPadecimientos(View view){
        //intent
        Intent intent = new Intent(this, PadecimientosActivity.class);
        //Aqui debemos de crear el usuario y mandarlo a la base de datos
        //obteniendo La edad del usuario

        EditText etEdad = (EditText)findViewById(R.id.etEdad);
        int edadUsuario = Integer.parseInt(etEdad.getText().toString());

        //Obteniendo El Peso del Usuario
        EditText etPeso = (EditText)findViewById(R.id.etPeso);
        int pesoUsuario = Integer.parseInt(etPeso.getText().toString());

        //Obteniendo Si es Hombre o Mujer (Sexo)
        RadioGroup rgSexo = (RadioGroup) findViewById(R.id.rgSexo);
        String sexoUsuario = rgSexo.toString();

        //FALTA ENVIAR PADECIMIENTOS

        intent.putExtra("edadUsuario", edadUsuario);
        intent.putExtra("pesoUsuario", pesoUsuario);
        intent.putExtra("sexoUsuario", sexoUsuario);
        //intent.putExtra("padecimientos", padecimientos);


        //aqui enviamos el intent
        //Usuario usuario = new Usuario(1,edadUsuario,pesoUsuario,sexoUsuario);
        startActivity(intent);


    }


    //función del botón, recaudar datos  del activity, conectar a base, guardar datos y cerrar conección a base


}