package com.course.myproject01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customer_Service01 extends AppCompatActivity {
    Button callb;
    Button sendE;
    Button mapv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_service01);

        callb = (Button) findViewById(R.id.button2);
        callb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01033275913"));
                startActivity(intent);
            }
        });

        sendE = (Button) findViewById(R.id.button3);
        sendE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                String[] TO = {"paranet312@dgu.ac.kr"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                startActivity(emailIntent);
            }
        });

        mapv = (Button)findViewById(R.id.button4);
        mapv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}