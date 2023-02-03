package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, numP, numS, numX, numD, numC, numE;

    calculator calculator = new calculator();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.display);

        numP = findViewById(R.id.numP);

        numS = findViewById(R.id.numS);

        numX = findViewById(R.id.numX);

        numD = findViewById(R.id.numD);

        numC = findViewById(R.id.numC);

        numE = findViewById(R.id.numE);

        num0 = findViewById(R.id.num0);

        num1 = findViewById(R.id.num1);

        num2 = findViewById(R.id.num2);

        num3 = findViewById(R.id.num3);

        num4 = findViewById(R.id.num4);

        num5 = findViewById(R.id.num5);

        num6 = findViewById(R.id.num6);

        num7 = findViewById(R.id.num7);

        num8 = findViewById(R.id.num8);

        num9 = findViewById(R.id.num9);

        num0.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                calculator.push("0");
                textView.setText(calculator.toString());

            }

        });
        numP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("+");

                textView.setText(calculator.toString());

            }

        });
        numS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("-");

                textView.setText(calculator.toString());

            }

        });
        numX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("*");

                textView.setText(calculator.toString());

            }

        });
        numD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("/");

                textView.setText(calculator.toString());

            }

        });
        numC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.res();

                textView.setText(calculator.toString());

            }
        });

        numE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.v()) {
                    calculator.calculate();
                    textView.setText(calculator.answer());
                } else {
                    textView.setText("Error");
                }
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("1");

                textView.setText(calculator.toString());

            }

        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("2");

                textView.setText(calculator.toString());

            }

        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("3");

                textView.setText(calculator.toString());

            }

        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("4");

                textView.setText(calculator.toString());

            }

        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("5");

                textView.setText(calculator.toString());

            }

        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("6");

                textView.setText(calculator.toString());

            }

        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("7");

                textView.setText(calculator.toString());

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("8");

                textView.setText(calculator.toString());

            }

        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.push("9");

                textView.setText(calculator.toString());

            }

        });
    }

}