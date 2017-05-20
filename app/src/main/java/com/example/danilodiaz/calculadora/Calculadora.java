package com.example.danilodiaz.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class Calculadora extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv3 = (EditText) findViewById(R.id.tv3);
    }
    public void sumar (View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int suma = nro1 + nro2;
        String resu = String.valueOf(suma);
        tv3.setText(resu);
    }




}
