package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String questions[]={"Q1.)Is Java object oriented programming language?","Q2.)Does Java supports Interface?",
                                "Q3.)Java was introduced in 1800?","Q4.)Is Java used in Android Development",
                                "Q5.)Is Java used in ios development "};
    private boolean answers[]={true,true,false,true,false};
    Button yes;
    Button no;
    TextView textView;
    private  int index=0;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView=findViewById(R.id.textView);
        textView.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(answers[index]==true){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score+"/"+questions.length, Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        String str=Integer.toString(score);
                        String str2=Integer.toString(questions.length);
                        intent.putExtra("com.example.quizapp.SCORE",str);
                        intent.putExtra("com.example.quizapp.Questions",str2);
                        startActivity(intent);
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(answers[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        String str=Integer.toString(score);
                        String str2=Integer.toString(questions.length);
                        intent.putExtra("com.example.quizapp.SCORE",str);
                        intent.putExtra("com.example.quizapp.Questions",str2);
                        startActivity(intent);
                    }
                }
            }
        });

    }
}