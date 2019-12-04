package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    Button see4;
    TextView ans4;
    Button back3;
    TextView last;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        see4 = (Button) findViewById(R.id.show4);
        ans4 = (TextView) findViewById(R.id.a4);
    last = (TextView) findViewById(R.id.last);
        final Intent prev_to3  = new Intent(Main4Activity.this,Main3Activity.class);


        back3 = (Button) findViewById(R.id.prev3);

        see4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer3 = "Canberra";
                ans4.setText(answer3);
                last.setText("Quiz Ended!!");

            }
        });



        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prev_to3);
            }
        });



    }
}
