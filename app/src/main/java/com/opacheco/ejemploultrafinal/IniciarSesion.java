package com.opacheco.ejemploultrafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {

    EditText et_nombredeusuario, et_passworddeusuario;
    Button btn_iniciarsesion;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        et_nombredeusuario = findViewById(R.id.et_nombredeusuario);
        et_passworddeusuario = findViewById(R.id.et_passworddeusuario);
        btn_iniciarsesion = findViewById(R.id.btn_iniciarsesion);

    }


    public void iniciarsesion (View view){

        String nombreusuario = et_nombredeusuario.getText().toString();
        String passwordusuario = et_passworddeusuario.getText().toString();

        SharedPreferences sp = getSharedPreferences("registros", Context.MODE_PRIVATE);
        String variablenombreusuario = sp.getString("nombreusuario", null);
        String variablepasswordusuario = sp.getString("passwordusuario", null);

        //Toast.makeText(this, variablenombreusuario, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, variablepasswordusuario, Toast.LENGTH_SHORT).show();


        if (nombreusuario.equals(variablenombreusuario) && passwordusuario.equals(variablepasswordusuario)){

            Intent it = new Intent(this, Inicio.class);
            startActivity(it);

        } else {
            Toast.makeText(this, "Los datos son incorrectos", Toast.LENGTH_SHORT).show();
        }


    }


}