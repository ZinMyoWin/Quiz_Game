package com.example.quiz_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button level0, level1, level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        level0 = (Button) findViewById(R.id.idBtl0);
        level1 = (Button) findViewById(R.id.idBtl1);
        level2 = (Button) findViewById(R.id.idBtl2);

        level0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callNewIntent("0");
            }
        });
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callNewIntent("1");

            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callNewIntent("2");
            }
        });

    }
    //THis is the method(callNewIntent)
    public void callNewIntent(String _level){
        Intent intent = new Intent(MainActivity.this, Level.class);
        intent.putExtra("Level", _level);
        startActivity(intent);
    }

}