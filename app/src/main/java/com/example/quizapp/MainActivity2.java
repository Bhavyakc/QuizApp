package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView score;
    String s,q;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        score=findViewById(R.id.score);

        Intent intent=getIntent();
        s=intent.getStringExtra("com.example.quizapp.SCORE");
        q=intent.getStringExtra("com.example.quizapp.Questions");
        score.setText("Your Score is "+s+"/"+q);
    }
}