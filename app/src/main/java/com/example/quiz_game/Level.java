package com.example.quiz_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level extends AppCompatActivity implements View.OnClickListener {
    TextView level;
    TextView Total_Question;
    TextView Question;
    TextView Timer;
    Button AnsA, AnsB, AnsC;
    Button submitBtn;

    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        //Extra
        String my_level = getIntent().getStringExtra("Level");

        level = findViewById(R.id.idLevel);
        level.setText("Level" + my_level);

        Timer = findViewById(R.id.idTimer);

        AnsA = findViewById(R.id.idansA);
        AnsB = findViewById(R.id.idansB);
        AnsC = findViewById(R.id.idansC);

        submitBtn = findViewById(R.id.idSubmit);

        Total_Question = findViewById(R.id.idTotalQ);
        Question = findViewById(R.id.idQuestion);



    }

    @Override
    public void onClick(View view) {

    }

    private void Timer() {
        countDownTimer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long l) {
                Timer.setText("00" + l / 1000);
            }

            @Override
            public void onFinish() {

            }

        }.start();
    }
}
