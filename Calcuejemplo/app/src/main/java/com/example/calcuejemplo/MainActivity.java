package com.example.calcuejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonOperaciones, buttonSalir,buttonEcuaciones,buttonCalculadoraImaginarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOperaciones = findViewById(R.id.buttonOperaciones);
        buttonSalir = findViewById(R.id.buttonSalir);
        buttonEcuaciones = findViewById(R.id.buttonEcuaciones);
        buttonCalculadoraImaginarios = findViewById(R.id.buttonImaginarios);

        buttonOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, OperacionesActivity.class);
                startActivity(intent);
            }
        });
        buttonEcuaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, EcuacionActivity.class);
                startActivity(intent);
            }
        });
        buttonCalculadoraImaginarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, CalcuEcuacionesActivity.class);
                startActivity(intent);
            }
        });
        buttonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });


    }
}