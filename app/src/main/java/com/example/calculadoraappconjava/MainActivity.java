package com.example.calculadoraappconjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    double num1;
    double num2;
    double total = 0;
    public Button button1,button2, button3, button4, button5, button6, button7, button8, button9, button0;

    char operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);

    }
    public void punto(View view){
        String btn = textView.getText().toString();
        if(!btn.contains(".")) {
            btn = btn+".";
        }
        textView.setText(btn);
    }

    public void uno(View view){
        String btn = textView.getText().toString();
        btn = btn+"1";
        textView.setText(btn);
    }

    public void dos(View view) {
        String btn = textView.getText().toString();
        btn = btn+"2";
        textView.setText(btn);
    }
    public void tres(View view) {
        String btn = textView.getText().toString();
        btn = btn+"3";
        textView.setText(btn);
    }
    public void cuatro(View view) {
        String btn = textView.getText().toString();
        btn = btn+"4";

        textView.setText(btn);
    }
    public void cinco(View view) {
        String btn = textView.getText().toString();
        btn = btn+"5";
        textView.setText(btn);
    }
    public void seis(View view) {
        String btn = textView.getText().toString();
        btn = btn+"6";
        textView.setText(btn);
    }
    public void siete(View view) {
        String btn = textView.getText().toString();
        btn = btn+"7";
        textView.setText(btn);
    }
    public void ocho(View view) {
        String btn = textView.getText().toString();
        btn = btn+"8";
        textView.setText(btn);
    }
    public void nueve(View view) {
        String btn = textView.getText().toString();
        btn = btn+"9";
        textView.setText(btn);
    }

    public void cero(View view) {
        String btn = textView.getText().toString();
        btn = btn+"0";
        textView.setText(btn);
    }

    public void limpiar(View view) {
        textView.setText("");
    }

    public void sumar(View view) {
        if(textView.getText().toString() != "") {
            num1 = Double.parseDouble(textView.getText().toString());
            operador = '+';
            textView.setText("");
        }
    }

    public void restar(View view) {
        if(textView.getText().toString() != "") {
            num1 = Double.parseDouble(textView.getText().toString());
            operador = '-';
            textView.setText("");
        }
    }
    public void multiplicar(View view) {
        if(textView.getText().toString() != "") {
            num1 = Double.parseDouble(textView.getText().toString());
            operador = 'x';
            textView.setText("");
        }
    }
    public void dividir(View view) {
        if(textView.getText().toString() != "") {
            num1 = Double.parseDouble(textView.getText().toString());
            operador = '/';
            textView.setText("");
        }
    }

    public void resultado(View view) {
        if(textView.getText().toString() != "" ) {
            num2 = Double.parseDouble(textView.getText().toString());
            if(operador== '+'){
                total = num1 + num2;
            } else if(operador == '-') {
                total = num1 - num2;
            } else if (operador == 'x') {
                total = num1 * num2;
            } else {
                total = num1/num2;
            }
            textView.setText(Double.toString(total));
            num1 = 0.0;
            num2= 0.0;
        }

    }
}