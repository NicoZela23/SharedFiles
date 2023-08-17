package com.example.calcuejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperacionesActivity extends AppCompatActivity {

    EditText editTextTextA,editTextTextB;
    Button buttonSuma;
    TextView textViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        editTextTextA = findViewById(R.id.editTextTextA);
        editTextTextB = findViewById(R.id.editTextTextB);
        buttonSuma = findViewById(R.id.buttonSuma);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(editTextTextA.getText().toString());
                int y = Integer.parseInt(editTextTextB.getText().toString());
                Operaciones operaciones = new Operaciones(x,y);
                textViewResultado.setText(String.valueOf(operaciones.sumar()));
            }
        });
    }
}