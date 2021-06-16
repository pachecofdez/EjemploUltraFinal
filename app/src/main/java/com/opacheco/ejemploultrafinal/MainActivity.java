package com.opacheco.ejemploultrafinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        item.getItemId();

        if (R.id.op_registrar == item.getItemId()){
            Intent it = new Intent(this, Registrar.class);
            startActivity(it);
        }

        if (R.id.op_iniciarsesion == item.getItemId()){
            Intent it = new Intent(this, IniciarSesion.class);
            startActivity(it);
        }

        return true;
    }
}