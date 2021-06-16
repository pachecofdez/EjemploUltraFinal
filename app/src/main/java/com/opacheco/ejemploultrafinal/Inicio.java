package com.opacheco.ejemploultrafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Inicio extends AppCompatActivity {

    ListView lista;
    ArrayList<String> jugadores = new ArrayList<>();
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        lista = findViewById(R.id.lista);

        for (int i = 0; i<Jugadores.jugadores.length; i++){
            jugadores.add(Jugadores.jugadores[i].getNombre());
        }


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jugadores);
        lista.setAdapter(arrayAdapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent it = new Intent(getApplicationContext(), DatosJugador.class);
                SharedPreferences sp = getSharedPreferences("indice", 0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("indice", position);
                editor.commit();
                startActivity(it);

            }
        });


    }
}