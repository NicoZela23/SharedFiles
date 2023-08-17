package com.example.calcuejemplo;

import androidx.annotation.FloatRange;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EcuacionActivity extends AppCompatActivity {
    EditText editEcuacionA,editEcuacionB,editEcuacionC;
    Button buttonEcuacion;
    TextView textViewX1, textViewX2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion);
        editEcuacionA = findViewById(R.id.editTextTextA);
        editEcuacionB = findViewById(R.id.editTextTextB);
        editEcuacionC = findViewById(R.id.editTextTextC);
        buttonEcuacion = findViewById(R.id.buttonEcuacion);
        textViewX1 = findViewById(R.id.textViewX1);
        textViewX2 = findViewById(R.id.textViewX2);

        buttonEcuacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(editEcuacionA.getText().toString());
                float b = Float.parseFloat(editEcuacionA.getText().toString());
                float c = Float.parseFloat(editEcuacionA.getText().toString());
                Ecuaciones ecuacion = new Ecuaciones(a,b,c);
                ecuacion.solucion();
                textViewX1.setText(ecuacion.getX1());
                textViewX2.setText(ecuacion.getX2());
            }
        });

    }
}