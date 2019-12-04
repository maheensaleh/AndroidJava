package com.example.evaltask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    txt2= (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        txt2.setText(data);

    }
}
