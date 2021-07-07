package com.example.dell.practiceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView=new TextView(this);
        super.onCreate(savedInstanceState);
        textView.setText("hh");
        textView.setTextSize(40f);
        setContentView(R.layout.activity_main);
       ImageView img=(ImageView)findViewById(R.id.image_i);
               img.setImageResource(R.drawable.download);
    }
}
