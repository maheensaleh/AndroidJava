package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button see3;
    TextView ans3;
    Button go4;
    Button back2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        see3 = (Button) findViewById(R.id.show3);
        ans3 = (TextView) findViewById(R.id.a3);

        final Intent prev_to2  = new Intent(Main3Activity.this,Main2Activity.class);
        final Intent to_fourth = new Intent(Main3Activity.this,Main4Activity.class);

        go4 = (Button) findViewById(R.id.next3);

        back2 = (Button) findViewById(R.id.prev2);

        see3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer2 = "Kabul";
                ans3.setText(answer2);

            }
        });

        go4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(to_fourth);
            }
        });


        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prev_to2);
            }
        });



    }
}
