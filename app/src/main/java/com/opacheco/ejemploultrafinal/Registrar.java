package com.opacheco.ejemploultrafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrar extends AppCompatActivity {

    EditText et_nombreusuario, et_passwordusuario;
    Button btn_registrar;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        et_nombreusuario = findViewById(R.id.et_nombreusuario);
        et_passwordusuario = findViewById(R.id.et_passwordusuario);
        btn_registrar = findViewById(R.id.btn_registrar);

    }

    public void registrarUsuario (View view){

        String nombreusuario = et_nombreusuario.getText().toString();
        String passwordusuario = et_passwordusuario.getText().toString();

        SharedPreferences sp = getSharedPreferences("registros", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("nombreusuario", nombreusuario);
        editor.putString("passwordusuario", passwordusuario);
        editor.commit();

        Intent it = new Intent(this, IniciarSesion.class);
        startActivity(it);




    }


}