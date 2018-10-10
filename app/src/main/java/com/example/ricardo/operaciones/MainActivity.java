package com.example.ricardo.operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText primerNumero = (EditText)findViewById(R.id.primerN);
    EditText segundoNumero = (EditText)findViewById(R.id.segundoN);
    TextView resultado = (EditText)findViewById(R.id.resultado);
    int numero1 = Integer.parseInt(primerNumero.getText().toString());
    int numero2 = Integer.parseInt(segundoNumero.getText().toString());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void sumaClick(View v){



        int suma = numero1 + numero2;


        resultado.setText(Integer.toString(suma));


    }

    public void restaClick(View v){



        int resta = numero1 - numero2;


        resultado.setText(Integer.toString(resta));


    }

    public void multiClick(View v){




        int mult = numero1* numero2;

        resultado.setText(Integer.toString(mult));


    }
    public void divClick(View v){



        int div = numero1 / numero2;


        resultado.setText(Integer.toString(div));


    }

}
