package com.example.rafa.practica6pmdm;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

public class BlocDeNotas extends AppCompatActivity {

    EditText blocNotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc_de_notas);
        blocNotas = findViewById(R.id.BlocNotas);

        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);

        String textoLeido =prefs.getString("textoBlocDeNotas","");

        blocNotas.setText(textoLeido);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu_blocnotas, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.guardar:
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("textoBlocDeNotas",blocNotas.getText().toString());

                editor.commit();
                break;



        }
        return true;
    }

}
