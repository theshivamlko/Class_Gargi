package com.navoki.myapp;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView1;
    TextView textView2;
    Button button;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        button = findViewById(R.id.button);


        textView1.setText("Hello EVERYONE");
        textView1.setTextColor(Color.BLUE);

        textView2.setTextSize(40);
        textView2.setAllCaps(true);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        textView1.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.txtColor));

        ++count;

        textView2.setText("Hi! "+count);



    }
}
