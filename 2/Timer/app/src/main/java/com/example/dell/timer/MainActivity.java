package com.example.dell.timer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button buttonStart;
    ProgressBar progressBar;
    TextView textCounter;

    MyCountDownTimer myCountDownTimer;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = (Button) findViewById(R.id.Go);
        progressBar = (ProgressBar) findViewById(R.id.seekBar);
        textCounter = (TextView) findViewById(R.id.min);


        buttonStart.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v) {
                progressBar.setProgress(100);
                myCountDownTimer = new MyCountDownTimer(1000, 10);
                myCountDownTimer.start();
            }
        });

    }

    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            textCounter.setText(String.valueOf(millisUntilFinished));
            int progress = (int) (millisUntilFinished / 10);
            progressBar.setProgress(progress);
        }

        @Override
        public void onFinish() {
            textCounter.setText("Finished");
            progressBar.setProgress(0);

        }

    }
}
