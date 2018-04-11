package com.priyansh.bookbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle extras = getIntent().getExtras();

        String nm = extras.getString("val2");
        String sb = extras.getString("val3");
        TextView vao=(TextView)findViewById(R.id.textt10);
        vao.setText("Hey Mr. "+nm+" you bought book "+sb+".");
    }
}
