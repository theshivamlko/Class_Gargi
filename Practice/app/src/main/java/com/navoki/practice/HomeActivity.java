package com.navoki.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Intent intent=getIntent();
        if(intent!=null)
        {
            String name= intent.getStringExtra("name");

            String text="Hello "+name;
           Toast.makeText(HomeActivity.this,text,Toast.LENGTH_SHORT).show();
        }
    }
}
