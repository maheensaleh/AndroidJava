package com.example.evaltask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    int counter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        counter = 0;
        System.out.println("a");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String count = textView.getText().toString();
                System.out.println("b");
                System.out.println(count);

                if (counter == 7){

                    Intent newintent = new Intent(MainActivity.this,Main2Activity.class);
                    String data = editText.getText().toString();
                    newintent.putExtra("data",data);
                    startActivity(newintent);

                }
                else{
                    counter+=1;
                    String newcount = Integer.toString(counter);
                    textView.setText(newcount);
                    System.out.println("c");



                }
            }
        });



    }
}
