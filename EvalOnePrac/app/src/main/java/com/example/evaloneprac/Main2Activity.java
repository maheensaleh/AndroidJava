package com.example.evaloneprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nameshow ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4ex_aa);

        Intent intent1_take = getIntent();
        String username = intent1_take.getStringExtra("user_name");

        nameshow = (TextView) findViewById(R.id.namedisplay);
        nameshow.setText(username);
    }
}
