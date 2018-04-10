package com.priyansh.bookbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Bundle extras = getIntent().getExtras();
        String someV = extras.getString("value2");
        TextView vao=(TextView)findViewById(R.id.textt2);
        vao.setText(someV);
    }
}
