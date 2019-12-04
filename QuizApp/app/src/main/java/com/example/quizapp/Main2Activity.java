package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button see2;
    TextView ans2;
    Button go3;
    Button back1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        see2 = (Button) findViewById(R.id.show2);
        ans2 = (TextView) findViewById(R.id.a2);

        final Intent prev  = new Intent(Main2Activity.this,MainActivity.class);
        final Intent to_third = new Intent(Main2Activity.this,Main3Activity.class);

        go3 = (Button) findViewById(R.id.next2);

        back1 = (Button) findViewById(R.id.prev1);

        see2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer2 = "beijing";
                ans2.setText(answer2);

            }
        });

        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(to_third);
            }
        });


        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prev);
            }
        });



    }
}
