package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2_1 extends AppCompatActivity {
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        tx1=(TextView)   findViewById(R.id.tv1);
        Intent i1=getIntent();
         // lay du lieu da truyen
        String str1=i1.getExtras().getString("so_1");
        String str2=i1.getExtras().getString("so2");
        float so_1=Float.parseFloat(str1);
        float so_2=Float.parseFloat(str2);
        float tong=so_1+so_2;
        tx1.setText("\t\t\t\t"+tong+" ");

    }
}