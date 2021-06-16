package com.opacheco.ejemploultrafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DatosJugador extends AppCompatActivity {

    TextView tv_nombreJugador, tv_equipoJugador, tv_edadJugador;
    SharedPreferences sp;
    Jugador jugador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_jugador);

        tv_nombreJugador = findViewById(R.id.tv_nombreJugador);
        tv_equipoJugador = findViewById(R.id.tv_equipoJugador);
        tv_edadJugador = findViewById(R.id.tv_edadJugador);

        sp = getSharedPreferences("indice", Context.MODE_PRIVATE);

        int posicion = sp.getInt("indice", 0);

        //Bundle bundle = getIntent().getExtras();
        //int posicion = bundle.getInt("posicion");

        jugador = Jugadores.jugadores[posicion];

        tv_nombreJugador.setText(jugador.getNombre());
        tv_equipoJugador.setText(jugador.getEquipo());
        tv_edadJugador.setText(String.valueOf(jugador.getEdad()));



    }
}