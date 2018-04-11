package com.priyansh.bookbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Bundle extras = getIntent().getExtras();
        String someV = extras.getString("value2");
        String nomeN = extras.getString("value3");
        TextView vao=(TextView)findViewById(R.id.textt2);
        TextView vao1=(TextView)findViewById(R.id.textt4);
        vao.setText(someV);
        vao1.setText(nomeN);
    }

    public void nxt1(View view) {
        if(view.getId()==R.id.yo) {
            Intent ne = new Intent("com.priyansh.bookbuy.third");

            String yel=((EditText)findViewById(R.id.edi1)).getText().toString();

            String ki=((TextView)findViewById(R.id.textt4)).getText().toString();



            ne.putExtra("val2",yel);
            ne.putExtra("val3",ki);
            startActivity(ne);
        }
    }

        /*TextView xoxo=(TextView)findViewById(R.id.textt10);
        xoxo.setText("Hey Mr. "+one+" you bought book "+ki+" Total bill is ");*/

}
