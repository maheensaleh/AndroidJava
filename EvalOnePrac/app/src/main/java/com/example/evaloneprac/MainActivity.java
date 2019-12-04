package com.example.evaloneprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userinput;
    Button mybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4exb);

        userinput = (EditText) findViewById(R.id.userinput);
        mybtn  = (Button) findViewById(R.id.button3);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userurl = userinput.getText().toString();
                String completeurl = "http://"+ userurl;
                Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse(completeurl));
                startActivity(webintent);
            }
        });



    }
}



// -----------------------------------------lab4 a internal intents ---------------
//package com.example.evaloneprac;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    EditText ename;
//    Button esubmit;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.lab4ex_a);
//
//        final Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);//remember
//
//        ename  = (EditText) findViewById(R.id.myeditview);
//        esubmit = (Button) findViewById(R.id.mybutton);
//        esubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = ename.getText().toString();
//                intent1.putExtra("user_name",username);
//                startActivity(intent1);
//
//            }
//        });
//
//
//
//    }
//}




















//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ relative pooh


//package com.example.evaloneprac;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
////    EditText myedittxt = (EditText) findViewById(R.id.input1) ;
//    EditText myedittxt;
//    Button mybtn;
//    TextView show;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.relative);
//        System.out.println("hey");
//
//    myedittxt = (EditText) findViewById(R.id.input1);
//    mybtn = (Button) findViewById(R.id.submit);
//    show = (TextView) findViewById(R.id.txt2);
//
//
//        mybtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = myedittxt.getText().toString();
//                show.setText("welcome" + username);
//
//
//            }
//        });
//
//    }
//}

