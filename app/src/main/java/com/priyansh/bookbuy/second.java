package com.priyansh.bookbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        String someV = extras.getString("value1");
        TextView vao=(TextView)findViewById(R.id.text1);
        vao.setText(someV);
    }
}
