package com.example.p12_c2_example_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvRes;
    EditText etVal1, etVal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicio
        tvRes = findViewById(R.id.tvResultado);
        etVal1 = findViewById(R.id.etValor1);
        etVal2 = findViewById(R.id.etValor2);

        //FIN
    }

    public void sumar(View view){
        int x = Integer.parseInt(etVal1.getText().toString());
        int y = Integer.parseInt(etVal2.getText().toString());
        int r = x+y;

        if(r<0){

        }

        tvRes.setText(String.valueOf(r));
    }
}
//agregar un valor correspondiente a una distancia especifica
//y otro valor correspondiente al tiempo de recorrido
//calcular velocidad


//agrega un valor correspondiente al radio de un circulo y calcular area y perimetro

//3 valores,determina que tipo de triangulo se forma por sus lados (isoceles escaleo equilatero), validar que se pueda formar el triangulo.

