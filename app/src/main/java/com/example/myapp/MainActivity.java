package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum, secondNum;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        output = findViewById(R.id.output);
    }
    public void plus(View view){
        output.setText(Integer.parseInt(firstNum.getText().toString()) + Integer.parseInt(secondNum.getText().toString()) + "");
    }
    public void minus(View view){
        output.setText(Integer.parseInt(firstNum.getText().toString()) - Integer.parseInt(secondNum.getText().toString()) + "");
    }
    public void multiply(View view){
        output.setText(Integer.parseInt(firstNum.getText().toString()) * Integer.parseInt(secondNum.getText().toString()) + "");
    }
    public void divide(View view){
        output.setText(Float.parseFloat(firstNum.getText().toString()) / Float.parseFloat(secondNum.getText().toString()) + "");
    }
}