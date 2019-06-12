package com.example.a1894220.linearexmaple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoAcitivity extends AppCompatActivity {


    String uname,pwd;
    TextView Txt3,Txt4;
    Button ChechButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        ChechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=getIntent().getExtras();
                uname=bundle.getString("uname");
                pwd=bundle.getString("pwd");
                Txt3=findViewById(R.id.Txt3);
                Txt4=findViewById(R.id.Txt4);

                Txt3.setText(uname);
            }
        });
     /*Intent i=getIntent();

        uname=i.getStringExtra("uname");
        pwd=i.getStringExtra("pwd");
*/

       // Txt4.setText(pwd);








    }
}
