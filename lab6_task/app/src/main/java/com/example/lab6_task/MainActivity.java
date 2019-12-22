package com.example.lab6_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    // here we will create our array data and add it to listview
    String[] title = new String[]{"pooh","baymax","cinderella","rapunzel","rio","up","toothless"};

    String[] desc = new String[]{"pooh","baymax","cinderella","rapunzel","rio","up","toothless"};
    int[] imgs = new int[]{R.drawable.pooh,R.drawable.baymax,R.drawable.cinderella,R.drawable.rapunzel,R.drawable.rio,R.drawable.up,R.drawable.toothless};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<HashMap<String ,String >> alldata = new ArrayList<HashMap<String ,String>>();
        for (int i = 0; i<6; i++){

            HashMap<String ,String> temp = new HashMap<String ,String>();
            temp.put("title",title[i]);
            temp.put("details",desc[i]);
            temp.put("images", Integer.toString(imgs[i]));
            alldata.add(temp);

        }

        String[] from = {
                "title","details","images"
        };

        int[] to  = {
          R.id.text1,R.id.text2,R.id.imgs
        };
        ListView mylistview = (ListView)findViewById(R.id.mylistview);


        SimpleAdapter myadapter = new SimpleAdapter(getBaseContext(),alldata,R.layout.listview_items,from,to);
        mylistview.setAdapter(myadapter);

        //perform listView item click event
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),title[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
                String mess;
                switch (title[i]){

                    case "pooh":
                        mess = "this is yellow bear";
                        break;
                    case "baymax":
                        mess = "this is a white robot";
                        break;
                    case "toothless":
                        mess = "this is a night fury";
                        break;
                    case "cinderella":
                        mess = "i have a glass slipper";
                        break;
                    case "rapunzel":
                        mess = "the lost princess";
                        break;
                    case "rio":
                        mess = "linda is finding Rio";
                        break;
                    case "up":
                        mess = "i wanna go to paradise falls";
                        break;
                    default:
                        mess = "seems to be a problem...";
                }
                Toast.makeText(MainActivity.this, mess, Toast.LENGTH_SHORT).show();


            }
        });






    }




}
