package com.example.main_ctivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libros;

public class Github_act extends AppCompatActivity {

    private Spinner spin1;
    private TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        mostrar =(TextView)findViewById(R.id.vista);
        spin1 = (Spinner)findViewById(R.id.spn1);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaLibros);

        spin1.setAdapter(adapt);
    }

    public void Resultado(View v)
    {
        Libros l1 = new Libros ();

        String libros = spin1.getSelectedItem().toString();

        if(libros.equals("Farenheith"))
        {
            mostrar.setText("El valor de Farenheith es:" + l1.Farenheith() );
        }
        if(libros.equals("Revival"))
        {
            mostrar.setText("El valor de Revival es:" + l1.Revival() );

        }
        if(libros.equals("El Alquimista"))
        {
            mostrar.setText("El valor de El Alquimista es:" + l1.ElAlquimista() );

        }
    }
}