package com.example.tarjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,suma,resta,multiplicacion,division,igual,borrar;
    TextView resultado;
    String operador;
    int num1, num2, result, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = (Button) findViewById(R.id.btn_0);
        uno = (Button) findViewById(R.id.btn_1);
        dos = (Button) findViewById(R.id.btn_2);
        tres = (Button) findViewById(R.id.btn_3);
        cuatro = (Button) findViewById(R.id.btn_4);
        cinco = (Button) findViewById(R.id.btn_5);
        seis = (Button) findViewById(R.id.btn_6);
        siete = (Button) findViewById(R.id.btn_7);
        ocho = (Button) findViewById(R.id.btn_8);
        nueve = (Button) findViewById(R.id.btn_9);

        suma = (Button) findViewById(R.id.btn_suma);
        resta = (Button) findViewById(R.id.btn_resta);
        multiplicacion = (Button) findViewById(R.id.btn_multi);
        division = (Button) findViewById(R.id.btn_divi);

        igual = (Button) findViewById(R.id.btn_result);
        borrar = (Button) findViewById(R.id.btn_borrar);

        resultado = (TextView) findViewById(R.id.txt_ing);
    };
    public void borrar (View view) {
        resultado.setText("");
        num1 = 0;
        num2 = 0;
        result = 0;
    };
    public void presionarCero(View view) {
        resultado.setText(resultado.getText().toString() + "0");
    };
    public void presionarUno(View view) {
        resultado.setText(resultado.getText().toString() + "1");
    };

    public void presionarDos(View view) {
        resultado.setText(resultado.getText().toString() + "2");
    };

    public void presionarTres(View view) {
        resultado.setText(resultado.getText().toString() + "3");
    };

    public void presionarCuatro(View view) {
        resultado.setText(resultado.getText().toString() + "4");
    };

    public void presionarCinco(View view) {
        resultado.setText(resultado.getText().toString() + "5");
    };

    public void presionarSeis(View view) {
        resultado.setText(resultado.getText().toString() + "6");
    };

    public void presionarSiete(View view) {
        resultado.setText(resultado.getText().toString() + "7");
    };

    public void presionarOcho(View view) {
        resultado.setText(resultado.getText().toString() + "8");
    };

    public void presionarNueve(View view) {
        resultado.setText(resultado.getText().toString() + "9");
    };

    public void restar(View view) {
        operador = "-";
        num1 = Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
    };

    public void sumar(View view) {
        operador = "+";
        num1 = Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
    };

    public void division(View view) {
        operador = "/";
        num1 = Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
    };

    public void multiplicacion(View view) {
        operador = "*";
        num1 = Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
    };

    public void resultado(View view) {
        num2 = Integer.parseInt(resultado.getText().toString());
        if(operador.equals("+")){
            result = num1 + num2;
        }
        if(operador.equals("-")){
            result = num1 - num2;
        }
        if(operador.equals("*")){
            result = num1 * num2;
        }
        if(operador.equals("/")){
            if(num2 != 0){
                result = num1 / num2;
            }else{
                resultado.setText("Syntax Error");
            }
        }
        resultado.setText(String.valueOf(result));
        num1 = 0;
        num2 = 0;
    };
};