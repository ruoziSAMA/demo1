package com.example.wxy.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.wxy.demo1.R.id.txt;

public class MainActivity extends AppCompatActivity {

    int tol=0;
    int first=0;
    int second=0;
    int op=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button) findViewById(R.id.btn1);
        //Button btn1=(Button)findViewById(R.id.btn1) ;
        Button btn2=(Button)findViewById(R.id.btn2) ;
        Button btnEqu=(Button)findViewById(R.id.equ) ;
        Button btnPlus=(Button)findViewById(R.id.plus) ;
        Button btnMinus=(Button)findViewById(R.id.minus);
        final TextView textView=(TextView )findViewById(txt) ;
        textView.setText("0");
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op==1){
                    tol=first+second;
                    textView.setText(String.valueOf(tol));
                }
                if(op==2){
                    tol=first-second;
                    textView.setText(String.valueOf(tol)) ;
                }
            }
        });
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textView.setText("1");
               first=1;
           }
       });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("2");
                second=2;
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op=1;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op=2;
            }
        });
    }
    public void setTextView(){
        TextView textView=(TextView )findViewById(txt) ;
        textView.setText(String.valueOf(tol));
    }
}
