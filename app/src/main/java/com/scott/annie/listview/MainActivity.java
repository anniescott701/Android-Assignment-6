package com.scott.annie.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list1;
    String []countries={"India","America","China","France","South Africa","Colombia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=(ListView) findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,countries);
        list1.setAdapter(arrayAdapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String cities = String.valueOf(list1.getItemAtPosition(i));

                if(i== 0)
                {

                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(myIntent, i);

                }

                if(i == 1)
                {

                    Intent myIntent =  new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(myIntent, i);
                }
                if(i== 2)
                {

                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(myIntent, i);
                }

                if(i == 3)
                {

                    Intent myIntent =  new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(myIntent, i);
                }


            }
        });
            }
        }




