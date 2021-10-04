package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button button1, button2, button3, button4,button5;
    TextView textResult;
    String number1, number2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단한 계산기"); // 자바코드에서 제목지정

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        textResult = findViewById(R.id.textResult);

            button1.setOnClickListener(view -> {
                //Upload Action TODO:-
                number1 = edit1.getText().toString();
                number2 = edit2.getText().toString();
                if(number1.isEmpty() && number2.isEmpty()) {
                    Toast.makeText(this, "값이 존재하지 않습니다.!", Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Float.parseFloat(number1) + Integer.parseInt(number2);
                    textResult.setText("계산결과 :" + result);
                }

            });
            button2.setOnClickListener(view -> {
                //Upload Action TODO:-
                number1 = edit1.getText().toString();
                number2 = edit2.getText().toString();
                if(number1.isEmpty() && number2.isEmpty()) {
                    Toast.makeText(this, "값이 존재하지 않습니다.!", Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Float.parseFloat(number1) - Integer.parseInt(number2);
                    textResult.setText("계산결과 :" + result);
                }
            });
            button3.setOnClickListener(view -> {
                //Upload Action TODO:-
                number1 = edit1.getText().toString();
                number2 = edit2.getText().toString();
                if(number1.isEmpty() && number2.isEmpty()) {
                    Toast.makeText(this, "값이 존재하지 않습니다.!", Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Float.parseFloat(number1) * Integer.parseInt(number2);
                    textResult.setText("계산결과 :" + result);
                }
            });
            button4.setOnClickListener(view -> {
                //Upload Action TODO:-
                if(number1.isEmpty() && number2.isEmpty()) {
                    Toast.makeText(this, "값이 존재하지 않습니다.!", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (number1.equals("0") || number2.equals("0")) {
                        Toast.makeText(this, "나누는 값이 0입니다.", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        number1 = edit1.getText().toString();
                        number2 = edit2.getText().toString();
                        result = Float.parseFloat(number1) / Integer.parseInt(number2);
                        textResult.setText("계산결과 :" + result);
                    }
                }

            });
            button5.setOnClickListener(view -> {
                //Upload Action TODO:-
                number1 = edit1.getText().toString();
                number2 = edit2.getText().toString();
                if(number1.isEmpty() && number2.isEmpty()) {
                    Toast.makeText(this, "값이 존재하지 않습니다.!", Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Float.parseFloat(number1) % Integer.parseInt(number2);
                    textResult.setText("계산결과 :" + result);
                }
            });
        }

}