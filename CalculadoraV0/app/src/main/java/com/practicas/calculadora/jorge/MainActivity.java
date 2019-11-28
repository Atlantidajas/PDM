package com.practicas.calculadora.jorge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public String valueDisplay = "";
    public String valueNumeric = "";
    public String operation = "";
    public Double result = 0.00;
    public ArrayList<Double>values = new ArrayList<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickButton( View view ) {


        try {
            TextView display = (TextView) findViewById(R.id.display);
            Button buttonClear = findViewById(R.id.clearButton);
            Button buttonDecimal = findViewById(R.id.decimalSimbolButton);
            Button button0 = findViewById(R.id.numericButton0);
            Button button1 = findViewById(R.id.numericButton1);
            Button button2 = findViewById(R.id.numericButton2);
            Button button3 = findViewById(R.id.numericButton3);
            Button button4 = findViewById(R.id.numericButton4);
            Button button5 = findViewById(R.id.numericButton5);
            Button button6 = findViewById(R.id.numericButton6);
            Button button7 = findViewById(R.id.numericButton7);
            Button button8 = findViewById(R.id.numericButton8);
            Button button9 = findViewById(R.id.numericButton9);
            Button buttonDivide = findViewById(R.id.divideSimbolButton);
            Button buttonMultiply = findViewById(R.id.multiplySimbolButton);
            Button buttonDeduct = findViewById(R.id.deductSimbolButton);
            Button buttonAdd = findViewById(R.id.plusSimbolButton);

            switch (view.getId()) {

                case R.id.clearButton:

                    display.setText("");
                    valueNumeric = "";
                    valueDisplay = "";
                    values.clear();
                    break;

                case R.id.decimalSimbolButton:
                    valueDisplay = valueDisplay + buttonDecimal.getText().toString();
                    valueNumeric = valueNumeric + buttonDecimal.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton0:
                    valueDisplay = valueDisplay + button0.getText().toString();
                    valueNumeric = valueNumeric + button0.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton1:
                    valueDisplay = valueDisplay + button1.getText().toString();
                    valueNumeric = valueNumeric + button1.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton2:
                    valueDisplay = valueDisplay + button2.getText().toString();
                    valueNumeric = valueNumeric + button2.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton3:
                    valueDisplay = valueDisplay + button3.getText().toString();
                    valueNumeric = valueNumeric + button3.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton4:
                    valueDisplay = valueDisplay + button4.getText().toString();
                    valueNumeric = valueNumeric + button4.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton5:
                    valueDisplay = valueDisplay + button5.getText().toString();
                    valueNumeric = valueNumeric + button5.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton6:
                    valueDisplay = valueDisplay + button6.getText().toString();
                    valueNumeric = valueNumeric + button6.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton7:
                    valueDisplay = valueDisplay + button7.getText().toString();
                    valueNumeric = valueNumeric + button7.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton8:
                    valueDisplay = valueDisplay + button8.getText().toString();
                    valueNumeric = valueNumeric + button8.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;

                case R.id.numericButton9:
                    valueDisplay = valueDisplay + button9.getText().toString();
                    valueNumeric = valueNumeric + button9.getText().toString();
                    mostrarDisplay(valueDisplay);
                    break;


                //<-- Operations
                case R.id.divideSimbolButton:
                    if ( valueNumeric == ""){
                       mostrarDisplay("Introduzca valor numérico");
                    }
                    else {
                        valueDisplay = valueDisplay + buttonDivide.getText().toString();
                        values.add(Double.parseDouble(valueNumeric));
                        valueNumeric = "";
                        operation = "/";
                        mostrarDisplay(valueDisplay);
                    }
                    break;

                case R.id.multiplySimbolButton:

                    if ( valueNumeric == ""){
                        mostrarDisplay("Introduzca valor numérico");
                    }
                    else {
                        valueDisplay = valueDisplay + buttonMultiply.getText().toString();
                        values.add(Double.parseDouble(valueNumeric));
                        valueNumeric = "";
                        operation = "*";
                        mostrarDisplay(valueDisplay);
                    }
                    break;

                case R.id.deductSimbolButton:
                    if ( valueNumeric == ""){
                        mostrarDisplay("Introduzca valor numérico");
                    }
                    else {
                        valueDisplay = valueDisplay + buttonDeduct.getText().toString();
                        values.add(Double.parseDouble(valueNumeric));
                        valueNumeric = "";
                        operation = "-";
                        mostrarDisplay(valueDisplay);
                        break;
                    }

                case R.id.plusSimbolButton:
                    if ( valueNumeric == ""){
                        mostrarDisplay("Introduzca valor numérico");
                    }
                    else {
                        valueDisplay = valueDisplay + buttonAdd.getText().toString();
                        values.add(Double.parseDouble(valueNumeric));
                        valueNumeric = "";
                        operation = "+";
                        mostrarDisplay(valueDisplay);
                    }
                    break;


                case R.id.ResultSimbolButton:

                    values.add(Double.parseDouble(valueNumeric));

                    switch (operation) {
                        case "/":

                            result = values.get(0) / values.get(1);
                            mostrarDisplay(String.valueOf(result));
                            break;

                        case "*":
                            Double si = values.get(0) * values.get(1);
                            mostrarDisplay(String.valueOf(si));
                            break;

                        case "-":
                            result = values.get(0) - values.get(1);
                            mostrarDisplay(String.valueOf(result));
                            break;

                        case "+":
                            result = values.get(0) + values.get(1);
                            mostrarDisplay(String.valueOf(result));
                            break;
                    }

            }
        }catch ( Exception e ){
            mostrarDisplay( "Error " );
        }

    }

    public void mostrarDisplay( String valueDisplay ){
        TextView display = (TextView) findViewById(R.id.display);
        display.setText( valueDisplay );
    }

}


