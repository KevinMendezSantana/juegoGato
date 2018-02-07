package com.example.mendez26.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Variables globales
    public EditText pantalla;
    public double operando1,operando2,resultado;
    public int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Almacenamos el contenido de la pantalla de resultados en nuestra variable
        pantalla = (EditText)findViewById(R.id.caja);

    }

    //Programamos los botones de los numeros
    //1
    public void btn1(View v){

        String cadena=pantalla.getText().toString();
        cadena += "1";
        pantalla.setText(cadena);

    }//btn1

    //2
    public void btn2(View v){

        String cadena=pantalla.getText().toString();
        cadena += "2";
        pantalla.setText(cadena);

    }//btn2

    //3
    public void btn3(View v){

        String cadena=pantalla.getText().toString();
        cadena += "3";
        pantalla.setText(cadena);

    }//btn3

    //4
    public void btn4(View v){

        String cadena=pantalla.getText().toString();
        cadena += "4";
        pantalla.setText(cadena);

    }//btn4

    //5
    public void btn5(View v){

        String cadena=pantalla.getText().toString();
        cadena += "5";
        pantalla.setText(cadena);

    }//btn5

    //6
    public void btn6(View v){

        String cadena=pantalla.getText().toString();
        cadena += "6";
        pantalla.setText(cadena);

    }//btn6

    //7
    public void btn7(View v){

        String cadena=pantalla.getText().toString();
        cadena += "7";
        pantalla.setText(cadena);

    }//btn7

    //8
    public void btn8(View v){

        String cadena=pantalla.getText().toString();
        cadena += "8";
        pantalla.setText(cadena);

    }//btn8

    //9
    public void btn9(View v){

        String cadena=pantalla.getText().toString();
        cadena += "9";
        pantalla.setText(cadena);

    }//btn9

    //0
    public void btn0(View v){

        String cadena=pantalla.getText().toString();
        cadena += "0";
        pantalla.setText(cadena);

    }//btn0

    //Boton para poner el punto
    public void btnPunto(View v){

        String cadena=pantalla.getText().toString();
        cadena += ".";
        pantalla.setText(cadena);

    }//btnPunto

}//class
