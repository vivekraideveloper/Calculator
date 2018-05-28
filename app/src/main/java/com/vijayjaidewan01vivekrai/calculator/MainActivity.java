package com.vijayjaidewan01vivekrai.calculator;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNum;
    EditText secondNum;
    Button delete;
    Button divide;
    Button multiply;
    Button sub;
    Button add;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button dot;
    Button singleDelete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);

        delete = findViewById(R.id.delete);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.zero);
        singleDelete = findViewById(R.id.singleDelete);

        firstNum.setShowSoftInputOnFocus(false);
        secondNum.setShowSoftInputOnFocus(false);


        singleDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus() && firstNum.getText().toString().equals("")){
                    firstNum.setText("");
                }else if (secondNum.hasFocus() && secondNum.getText().toString().equals("")){
                    secondNum.setText("");
                }
                else if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString().substring(0, (firstNum.getText().length()-1)));
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString().substring(0, (secondNum.getText().length()-1)));
                }
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (firstNum.hasFocus()){
                    firstNum.setText("");
                }else if (secondNum.hasFocus()){
                    secondNum.setText("");
                }



            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (firstNum.getText().toString().equals("")){
                    firstNum.setError("Enter first number");
                }else if (secondNum.getText().toString().equals("")){
                    secondNum.setError("Enter second number");

                }else {
                    String s1 = firstNum.getText().toString();
                    String s2 = secondNum.getText().toString();


                    Double i1 = Double.parseDouble(s1);
                    Double i2 = Double.parseDouble(s2);

                    Double result = i1 / i2;
                    firstNum.setText("");
                    secondNum.setText("");
                    firstNum.setText(result.toString());
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().equals("")){
                    firstNum.setError("Enter first number");
                }else if (secondNum.getText().toString().equals("")){
                    secondNum.setError("Enter second number");

                }else {
                    String s1 = firstNum.getText().toString();
                    String s2 = secondNum.getText().toString();

                    Double i1 = Double.parseDouble(s1);
                    Double i2 = Double.parseDouble(s2);

                    Double result = i1 * i2;
                    firstNum.setText("");
                    secondNum.setText("");
                    firstNum.setText(result.toString());
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().equals("")){
                    firstNum.setError("Enter first number");
                }else if (secondNum.getText().toString().equals("")){
                    secondNum.setError("Enter second number");

                }else {
                    String s1 = firstNum.getText().toString();
                    String s2 = secondNum.getText().toString();

                    Double i1 = Double.parseDouble(s1);
                    Double i2 = Double.parseDouble(s2);

                    Double result = i1 - i2;
                    firstNum.setText("");
                    secondNum.setText("");
                    firstNum.setText(result.toString());
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.getText().toString().equals("")){
                    firstNum.setError("Enter first number");
                }else if (secondNum.getText().toString().equals("")){
                    secondNum.setError("Enter second number");

                }else {
                    String s1 = firstNum.getText().toString();
                    String s2 = secondNum.getText().toString();

                    Double i1 = Double.parseDouble(s1);
                    Double i2 = Double.parseDouble(s2);

                    Double result =  i1+i2 ;
                    secondNum.setText("");
                    firstNum.setText(result.toString());
                }

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "7");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "8");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "9");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "9");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "4");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "5");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "6");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "6");
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "1");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "2");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "3");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "3");
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + ".");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + ".");
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstNum.hasFocus()){
                    firstNum.setText(firstNum.getText().toString() + "0");
                }else if (secondNum.hasFocus()){
                    secondNum.setText(secondNum.getText().toString() + "0");
                }
            }
        });






    }
}
