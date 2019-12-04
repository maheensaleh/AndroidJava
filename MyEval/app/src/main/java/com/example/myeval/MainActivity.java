package com.example.myeval;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<movie> moviesList = new ArrayList<>();
        moviesList.add(new movie(R.drawable.a, "Petit Four" , ""));
        moviesList.add(new movie(R.drawable.b, "Cupcake" , ""));
        moviesList.add(new movie(R.drawable.c, "Doughnut" , ""));
        moviesList.add(new movie(R.drawable.d, "Eclai" , ""));
        moviesList.add(new movie(R.drawable.e, "Froyo" , ""));
        moviesList.add(new movie(R.drawable.f, "Gingerbread" , ""));
        moviesList.add(new movie(R.drawable.g, "HooneyComb" , ""));
        moviesList.add(new movie(R.drawable.h, "Icecream Sandwhich" , ""));



        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                String selectedItem = (String) parent.getItemAtPosition(position);
//                Toast toast=Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT);
//                toast.setMargin(50,50);
//                toast.show();
//                Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),
//                        "This a toast message",
//                        Toast.LENGTH_LONG);

                Toast.makeText(getApplicationContext(),
                        "This a toast message",
                        Toast.LENGTH_LONG)
                        .show();



            }
        });
    }
}