package com.example.dell.scorebuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0,b=0;
    public void increamentA1(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreA_text_view);
        a+=1;
        priceTextView.setText(a+"");

    }
    public void increamentA2(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreA_text_view);
        a+=2;
        priceTextView.setText(a+"");

    }
    public void increamentA3(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreA_text_view);
        a+=3;
        priceTextView.setText(a+"");

    }
    public void increamentB1(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreB_text_view);
        b+=1;
        priceTextView.setText(b+"");

    }
    public void increamentB2(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreB_text_view);
        b+=2;
        priceTextView.setText(b+"");

    }
    public void increamentB3(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreB_text_view);
        b+=3;
        priceTextView.setText(b+"");

    }
    public void reset(View view){
        TextView priceTextView = (TextView) findViewById(R.id.scoreA_text_view);
        a=0;
        priceTextView.setText(a+"");

        TextView priceTextViewB = (TextView) findViewById(R.id.scoreB_text_view);
        b=0;
        priceTextViewB.setText(b+"");


    }
}
