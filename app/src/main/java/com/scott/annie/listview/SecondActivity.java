package com.scott.annie.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    String India[] = {"Satna", "Mumbai", "Bhopal", "Banglore"};
    String America[] = {"Newyork","Chicago", "Boston", "Washington"};
    String China[] = {"Beijing", "Shanghai", "Shenzen","Tianjin"};
    String France[] = {"Paris", "Lyon", "Canes","Colmar"};

    ListView list2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        list2 = (ListView) findViewById(R.id.list2);
        String choice = (getIntent().getStringExtra("position"));

        switch (choice) {

            case "0": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, India);
                list2.setAdapter(arrayAdapter);
                break;
            }


            case "1": {
                ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, America);
                list2.setAdapter(arrayAdapter1);
                break;

            }
            case "2": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, China);
                list2.setAdapter(arrayAdapter);
                break;

            }
            case "3": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, France);
                list2.setAdapter(arrayAdapter);
                break;


            }


        }
    }
}



