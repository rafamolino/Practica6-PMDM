package com.example.rafa.practica6pmdm;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Personas extends AppCompatActivity {
    ImageView imgCasillas;
    ImageView imgFabregas;
    ImageView imgIniesta;
    ImageView imgPuyol;
    ImageView imgVilla;
    ImageView imgXabi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);

        imgCasillas = findViewById(R.id.imgCasillas);
        imgFabregas = findViewById(R.id.imgFabregas);
        imgIniesta = findViewById(R.id.imgIniesta);
        imgPuyol = findViewById(R.id.imgPuyol);
        imgVilla = findViewById(R.id.imgVilla);
        imgXabi = findViewById(R.id.imgXabi);

        registerForContextMenu(imgCasillas);
        registerForContextMenu(imgFabregas);
        registerForContextMenu(imgIniesta);
        registerForContextMenu(imgPuyol);
        registerForContextMenu(imgVilla);
        registerForContextMenu(imgXabi);

    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu_personas, menu);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu_editarcontactos, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.editarContacto:

                Intent i1 = new Intent(this, EditarContactos.class);
                startActivity(i1);

                break;



        }
        return true;
    }
}
