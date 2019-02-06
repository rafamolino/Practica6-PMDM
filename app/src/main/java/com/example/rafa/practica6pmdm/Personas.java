package com.example.rafa.practica6pmdm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class Personas extends AppCompatActivity {
    SharedPreferences prefs;
    ImageView imgCasillas;
    ImageView imgFabregas;
    ImageView imgIniesta;
    ImageView imgPuyol;
    ImageView imgVilla;
    ImageView imgXabi;
    String numeroTelefono;
    String correoElectronico;
    String str;

    @SuppressLint("ClickableViewAccessibility")
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

        imgCasillas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico1";
                numeroTelefono="numeroTelefono1";
                return false;
            }
        });
        imgPuyol.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico2";
                numeroTelefono="numeroTelefono2";
                return false;
            }
        });
        imgFabregas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico3";
                numeroTelefono="numeroTelefono3";
                return false;
            }
        });
        imgVilla.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico4";
                numeroTelefono="numeroTelefono4";
                return false;
            }
        });
        imgIniesta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico5";
                numeroTelefono="numeroTelefono5";
                return false;
            }
        });
        imgXabi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correoElectronico="correoElectronico6";
                numeroTelefono="numeroTelefono6";
                return false;
            }
        });
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
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);

        switch (item.getItemId())
        {

            case R.id.llamar:
            str = prefs.getString(numeroTelefono, null);
            if(str==null)
            {
                Toast.makeText(this, getString(R.string.errorTelefono),  Toast.LENGTH_LONG).show();
            }
            else
            {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
                {

                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + str));
                    startActivity(callIntent);
                }
                else
                {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
            break;
            case R.id.correo:
            str = prefs.getString(correoElectronico, null);
            if(str==null)
            {
                Toast.makeText(this, getString(R.string.errorCorreo), Toast.LENGTH_LONG).show();
            }
            else
            {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{str});
                startActivity(emailIntent);
            }
            break;
    }
        return super.onContextItemSelected(item);
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
