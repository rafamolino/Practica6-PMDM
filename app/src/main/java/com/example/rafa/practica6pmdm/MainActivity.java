package com.example.rafa.practica6pmdm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu_principal, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Personas:
                Intent i1 = new Intent(this, Personas.class);
                startActivity(i1);
                break;
            case R.id.BlocDeNotas:
                Intent i2 = new Intent(this, BlocDeNotas.class);
                startActivity(i2);
                break;


        }
        return true;
    }

}
