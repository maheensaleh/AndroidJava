package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button see1;
    TextView ans1;
    Button go2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        see1 = (Button) findViewById(R.id.show1);
        ans1 = (TextView) findViewById(R.id.a1);

        final Intent to_second = new Intent(MainActivity.this,Main2Activity.class);

        go2 = (Button) findViewById(R.id.next1);

        see1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer1 = "Islamabad";
                ans1.setText(answer1);

            }
        });

        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(to_second);
            }
        });



    }
}
