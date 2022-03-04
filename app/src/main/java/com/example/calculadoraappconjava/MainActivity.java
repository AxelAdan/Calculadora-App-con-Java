package com.example.calculadoraappconjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    double num1;
    double num2;
    double total = 0;
    public Button button1,button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonSuma, buttonResta, buttonDivicion, buttonMultiplicacion, buttonIgual;

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


        buttonSuma = findViewById(R.id.buttonSuma);
        buttonResta = findViewById(R.id.buttonResta);
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        buttonDivicion = findViewById(R.id.buttonDivicion);
        buttonIgual = findViewById(R.id.buttonIgual);
    }
    public void escribirPunto(View view){
        String cap = textView.getText().toString();
        cap = cap+".";
        textView.setText(cap);
    }

    public void escribirUno(View view){
        String cap = textView.getText().toString();
        cap = cap+"1";
        textView.setText(cap);
    }

    public void escribirDos(View view) {
        String cap = textView.getText().toString();
        cap = cap+"2";
        textView.setText(cap);
    }
    public void escribirTres(View view) {
        String cap = textView.getText().toString();
        cap = cap+"3";
        textView.setText(cap);
    }
    public void escribirCuatro(View view) {
        String cap = textView.getText().toString();
        cap = cap+"4";
        textView.setText(cap);
    }
    public void escribirCinco(View view) {
        String cap = textView.getText().toString();
        cap = cap+"5";
        textView.setText(cap);
    }
    public void escribirSeis(View view) {
        String cap = textView.getText().toString();
        cap = cap+"6";
        textView.setText(cap);
    }
    public void escribirSiete(View view) {
        String cap = textView.getText().toString();
        cap = cap+"7";
        textView.setText(cap);
    }
    public void escribirOcho(View view) {
        String cap = textView.getText().toString();
        cap = cap+"8";
        textView.setText(cap);
    }
    public void escribirNueve(View view) {
        String cap = textView.getText().toString();
        cap = cap+"9";
        textView.setText(cap);
    }

    public void escribirCero(View view) {
        String cap = textView.getText().toString();
        cap = cap+"0";
        textView.setText(cap);
    }

    public void limpiarDatos(View view) {
        textView.setText("");
    }

    public void sumarDatos(View view) {
        num1 = Double.parseDouble(textView.getText().toString());
        operador = buttonSuma.getText().charAt(0);
        textView.setText("");
    }

    public void restarDatos(View view) {
        num1 = Double.parseDouble(textView.getText().toString());
        operador = buttonResta.getText().charAt(0);
        textView.setText("");
    }
    public void multiplicarDatos(View view) {
        num1 = Double.parseDouble(textView.getText().toString());
        operador = '×';
        textView.setText("");
    }
    public void dividirrDatos(View view) {
        num1 = Double.parseDouble(textView.getText().toString());
        operador = '/';
        textView.setText("");
    }

    public void operacionResultado(View view) {
        num2 = Double.parseDouble(textView.getText().toString());
        switch (operador){
            case '+':
                total = num1 + num2;
                break;

            case '-':
                total = num1 - num2;
                break;
            case '×':
                total = num1 * num2;
                break;
            case '/':
                total = num1/num2;
                break;

        }
        textView.setText(Double.toString(total));
        num1 = 0.0;
        num2= 0.0;
        total=0;
    }
}