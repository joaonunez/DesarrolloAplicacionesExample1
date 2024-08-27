package com.example.p12_c2_example_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvRes;
    EditText etVal1, etVal2;
    Button etButtonSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicio

        tvRes = findViewById(R.id.tvResultado);
        etVal1 = findViewById(R.id.etValor1);
        etVal2 = findViewById(R.id.etValor2);
        etButtonSumar = findViewById(R.id.buttonSumar);

        //FIN

        etButtonSumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sumar();
            }
        });
    }


    public void sumar(){
        try {
            int x = Integer.parseInt(etVal1.getText().toString());
            int y = Integer.parseInt(etVal2.getText().toString());
            int r = x+y;
            tvRes.setText("La Suma Es: " + r);
        } catch (NumberFormatException e){
            tvRes.setText("Ingrese valores validos");
        }


    }
}
//agregar un valor correspondiente a una distancia especifica
//y otro valor correspondiente al tiempo de recorrido
//calcular velocidad


//agrega un valor correspondiente al radio de un circulo y calcular area y perimetro

//3 valores,determina que tipo de triangulo se forma por sus lados (isoceles escaleo equilatero), validar que se pueda formar el triangulo.
//aplicar teorema de desigualdad triangular, suma de 2 lados debe ser mayor al tercero

