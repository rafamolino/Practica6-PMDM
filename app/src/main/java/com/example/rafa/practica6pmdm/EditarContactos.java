package com.example.rafa.practica6pmdm;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class EditarContactos extends AppCompatActivity {

    ImageView imgCasillas;
    ImageView imgFabregas;
    ImageView imgIniesta;
    ImageView imgPuyol;
    ImageView imgVilla;
    ImageView imgXabi;
    String numeroTelefono;
    String correoElectronico;
    EditText txtTelefono;
    EditText txtCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_contactos);

        imgCasillas = findViewById(R.id.imgCasillas);
        imgFabregas = findViewById(R.id.imgFabregas);
        imgIniesta = findViewById(R.id.imgIniesta);
        imgPuyol = findViewById(R.id.imgPuyol);
        imgVilla = findViewById(R.id.imgVilla);
        imgXabi = findViewById(R.id.imgXabi);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreo = findViewById(R.id.txtCorreo);
    }

    public void editCasillas(View view) {
        imgCasillas.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgPuyol.setBackgroundColor(android.R.drawable.btn_default);
        imgFabregas.setBackgroundColor(android.R.drawable.btn_default);
        imgVilla.setBackgroundColor(android.R.drawable.btn_default);
        imgIniesta.setBackgroundColor(android.R.drawable.btn_default);
        imgXabi.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono1";
        correoElectronico="correoElectronico1";
    }

    public void editPuyol(View view) {
        imgPuyol.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgCasillas.setBackgroundColor(android.R.drawable.btn_default);
        imgFabregas.setBackgroundColor(android.R.drawable.btn_default);
        imgVilla.setBackgroundColor(android.R.drawable.btn_default);
        imgIniesta.setBackgroundColor(android.R.drawable.btn_default);
        imgXabi.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono2";
        correoElectronico="correoElectronico2";
    }

    public void editFabregas(View view) {
        imgFabregas.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgPuyol.setBackgroundColor(android.R.drawable.btn_default);
        imgCasillas.setBackgroundColor(android.R.drawable.btn_default);
        imgVilla.setBackgroundColor(android.R.drawable.btn_default);
        imgIniesta.setBackgroundColor(android.R.drawable.btn_default);
        imgXabi.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono3";
        correoElectronico="correoElectronico3";
    }

    public void editVilla(View view) {
        imgVilla.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgPuyol.setBackgroundColor(android.R.drawable.btn_default);
        imgFabregas.setBackgroundColor(android.R.drawable.btn_default);
        imgCasillas.setBackgroundColor(android.R.drawable.btn_default);
        imgIniesta.setBackgroundColor(android.R.drawable.btn_default);
        imgXabi.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono4";
        correoElectronico="correoElectronico4";
    }

    public void editIniesta(View view) {
        imgIniesta.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgPuyol.setBackgroundColor(android.R.drawable.btn_default);
        imgFabregas.setBackgroundColor(android.R.drawable.btn_default);
        imgVilla.setBackgroundColor(android.R.drawable.btn_default);
        imgCasillas.setBackgroundColor(android.R.drawable.btn_default);
        imgXabi.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono5";
        correoElectronico="correoElectronico5";
    }

    public void editXabiAlonso(View view) {
        imgXabi.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        imgPuyol.setBackgroundColor(android.R.drawable.btn_default);
        imgFabregas.setBackgroundColor(android.R.drawable.btn_default);
        imgVilla.setBackgroundColor(android.R.drawable.btn_default);
        imgIniesta.setBackgroundColor(android.R.drawable.btn_default);
        imgCasillas.setBackgroundColor(android.R.drawable.btn_default);
        numeroTelefono="numeroTelefono6";
        correoElectronico="correoElectronico6";
    }

    public void onClick(View view) {
        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(numeroTelefono, txtTelefono.getText().toString());
        editor.putString(correoElectronico, txtCorreo.getText().toString());
        editor.commit();
        Toast.makeText(this,getString(R.string.edicionContactos) , Toast.LENGTH_SHORT).show();
    }
}
