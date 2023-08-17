package com.example.calcuejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcuEcuacionesActivity extends AppCompatActivity {
    EditText editValA,editValB,editValC,editValD;
    Button buttonSuma,buttonResta,buttonMulti,buttonDivi;
    TextView textViewRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_ecuaciones);
        editValA = findViewById(R.id.editTextTextA);
        editValB = findViewById(R.id.editTextTextB);
        editValC = findViewById(R.id.editTextTextC);
        editValD = findViewById(R.id.editTextTextD);
        buttonSuma = findViewById(R.id.buttonSumar);
        buttonResta = findViewById(R.id.buttonRestar);
        buttonMulti = findViewById(R.id.buttonMultiplicar);
        buttonDivi = findViewById(R.id.buttonDividir);
        textViewRes = findViewById(R.id.textViewResultado);

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(editValA.getText().toString());
                float b = Float.parseFloat(editValB.getText().toString());
                float c = Float.parseFloat(editValC.getText().toString());
                float d = Float.parseFloat(editValD.getText().toString());
                CalcuEcuaciones calcuecuaciones = new CalcuEcuaciones(a,b,c,d);
                calcuecuaciones.suma();
                textViewRes.setText(calcuecuaciones.getRES());
            }
        });
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(editValA.getText().toString());
                float b = Float.parseFloat(editValB.getText().toString());
                float c = Float.parseFloat(editValC.getText().toString());
                float d = Float.parseFloat(editValD.getText().toString());
                CalcuEcuaciones calcuecuaciones = new CalcuEcuaciones(a,b,c,d);
                calcuecuaciones.resta();
                textViewRes.setText(calcuecuaciones.getRES());
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(editValA.getText().toString());
                float b = Float.parseFloat(editValB.getText().toString());
                float c = Float.parseFloat(editValC.getText().toString());
                float d = Float.parseFloat(editValD.getText().toString());
                CalcuEcuaciones calcuecuaciones = new CalcuEcuaciones(a,b,c,d);
                calcuecuaciones.multi();
                textViewRes.setText(calcuecuaciones.getRES());
            }
        });
        buttonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(editValA.getText().toString());
                float b = Float.parseFloat(editValB.getText().toString());
                float c = Float.parseFloat(editValC.getText().toString());
                float d = Float.parseFloat(editValD.getText().toString());
                CalcuEcuaciones calcuecuaciones = new CalcuEcuaciones(a,b,c,d);
                calcuecuaciones.divi();
                textViewRes.setText(calcuecuaciones.getRES());
            }
        });

    }
}