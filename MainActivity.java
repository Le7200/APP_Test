package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tt = null;
    int a=0;
    char do_ = 'a';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tt = findViewById(R.id.tt);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'1';
                tt.setText(s);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'2';
                tt.setText(s);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'3';
                tt.setText(s);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'4';
                tt.setText(s);
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'5';
                tt.setText(s);
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'6';
                tt.setText(s);
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'7';
                tt.setText(s);
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'8';
                tt.setText(s);
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'9';
                tt.setText(s);
            }
        });
        findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                tt.setText(s);
            }
        });
        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                s=s+'0';
                tt.setText(s);
            }
        });
        findViewById(R.id.equ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                switch (do_){
                    case 1:
                        a+=Integer.parseInt(s);
                        tt.setText(""+a);
                        break;
                    case 2:
                        a-=Integer.parseInt(s);
                        tt.setText(""+a);
                        break;
                    case 3:
                        a*=Integer.parseInt(s);
                        tt.setText(""+a);
                        break;
                }

            }
        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                a = Integer.parseInt(s);
                do_=1;
                tt.setText("");
            }
        });
        findViewById(R.id.min).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                a = Integer.parseInt(s);
                do_=2;
                tt.setText("");
            }
        });
        findViewById(R.id.mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tt.getText().toString();
                a = Integer.parseInt(s);
                do_=3;
                tt.setText("");
            }
        });
    }
}
