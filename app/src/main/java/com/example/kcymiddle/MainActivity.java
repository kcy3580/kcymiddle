package com.example.kcymiddle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    EditText Et1;
    Button button, button2, button3;
    TextView Result;
    String name1;
    char[] name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("한글 계산기");

        Et1 = (EditText) findViewById(R.id.Et1);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        Result = (TextView) findViewById(R.id.Result);


                button.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View arg0, MotionEvent arg1) {
                        name1 = Et1.getText().toString();
                        Result.setText("결과는 : " + name1.toString());
                        return false;
                    }
                });

                button2.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View arg0, MotionEvent arg1) {
                        name1 = Et1.getText().toString();
                        name2 = name1.toCharArray();
                        Result.setText("결과는 : " + name2[1]);
                        return false;
                    }
                });

                button3.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View arg0, MotionEvent arg1) {
                        name1 = Et1.getText().toString();
                        name2 = name1.toCharArray();
                            Result.setText("결과는 : " + name2[1]);
                        return false;
                    }
                });
        }
    }

