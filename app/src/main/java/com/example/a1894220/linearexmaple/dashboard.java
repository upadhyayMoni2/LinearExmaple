package com.example.a1894220.linearexmaple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    String uname,pwd;
    TextView Txt3,Txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent i=getIntent();

        uname=i.getStringExtra("uname");
        pwd=i.getStringExtra("pwd");

        Txt3=findViewById(R.id.Txt3);
        Txt4=findViewById(R.id.Txt4);

        Txt3.setText(uname);
        Txt4.setText(pwd);

        



    }
}
