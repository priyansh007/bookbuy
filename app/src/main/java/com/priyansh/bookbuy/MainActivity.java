package com.priyansh.bookbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner  spinner2;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemsOnSpinner2();
        addListenerOnButton();

    }
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Maths of universe");
        list.add("Physics you never get to learn");
        list.add("Hey codedot");
        list.add("Life");
        list.add("Animals");
        list.add("Herbals");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }



    // get the selected dropdown list value
    public void addListenerOnButton() {


        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        "OnClickListener : " +

                                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
                String yo=String.valueOf(spinner2.getSelectedItem());

                Intent toy=new Intent("com.priyansh.bookbuy.second");
                toy.putExtra("value1",yo);
                startActivity(toy);
            }

        });
    }
}
