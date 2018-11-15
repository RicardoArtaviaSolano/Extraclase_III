package com.example.ricardo.operaciones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsum = (Button) findViewById(R.id.buttonsuma);
        Button btnsub = (Button) findViewById(R.id.buttonresta);
        Button btndiv = (Button) findViewById(R.id.buttondivision);
        Button btnmul = (Button) findViewById(R.id.buttonmult);
        final EditText n1 = (EditText) findViewById(R.id.num1);
        final EditText n2 = (EditText) findViewById(R.id.num2);
        final TextView result = (TextView) findViewById(R.id.resultado);

        btnsum.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Float x = new Float (n1.getText().toString());
                Float y = new Float (n2.getText().toString());
                Float sum = x + y;
                result.setText("El resultado de " + x + " + " + y + " = " + sum);}
        });

        btnsub.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Float x = new Float(n1.getText().toString());
                Float y = new Float(n2.getText().toString());
                Float sub = x - y;
                result.setText("El resultado de  " + x + " - " + y + " = " + sub);
            }
        });

        btndiv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Float x = new Float(n1.getText().toString());
                Float y = new Float(n2.getText().toString());
                Float div = x / y;
                result.setText("El resultado de " + x + " / " + y + " = " + div);
            }
        });

        btnmul.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Float x = new Float(n1.getText().toString());
                Float y = new Float(n2.getText().toString());
                Float mul = x * y;
                result.setText("El resultado de " + x + " * " + y + " = " + mul);
            }
        });
    }

}