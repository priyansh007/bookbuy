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
        TextView yor=(TextView)findViewById(R.id.text4);
        TextView yor1=(TextView)findViewById(R.id.text6);
        TextView yor2=(TextView)findViewById(R.id.text8);
        TextView yor3=(TextView)findViewById(R.id.text10);
        vao.setText(someV);

        /*
        list.add("Maths of universe");
        list.add("Physics you never get to learn");
        list.add("Hey codedot");
        list.add("Life");
        list.add("Animals");
        list.add("Herbals");
         */
        if(someV.equals("Animals")){
            yor.setText("Dr. Romeroy");
            yor1.setText("01/12/2000");
            yor2.setText("878 Rupees");
            yor3.setText("Second Edition");
        }
        else if(someV.equals("Maths of universe")){
            yor.setText("Dr. Shantam");
            yor1.setText("08/11/2008");
            yor2.setText("1878 Rupees");
            yor3.setText("First Edition");
        }
        else if(someV.equals("Physics you never get to learn")){
            yor.setText("Dr. H.C.Verma");
            yor1.setText("18/02/1992");
            yor2.setText("188 Rupees");
            yor3.setText("Third Edition");
        }
        else if(someV.equals("Hey codedot")){
            yor.setText("Dr. C.Raman");
            yor1.setText("18/07/1998");
            yor2.setText("1808 Rupees");
            yor3.setText("Third Edition");
        }
        else if(someV.equals("Life")){
            yor.setText("Dr. P.G.Zalavadiya");
            yor1.setText("08/11/1980");
            yor2.setText("18080 Rupees");
            yor3.setText("First Edition");
        }
        else if(someV.equals("Herbals")){
            yor.setText("Dr. Alkesh Vaghela");
            yor1.setText("02/10/2010");
            yor2.setText("1000 Rupees");
            yor3.setText("Fourth Edition");
        }

    }
}
