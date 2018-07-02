package com.navoki.myapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView1;
    TextView textView2;
    Button button;
    Button showToast;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        button = findViewById(R.id.button);
        showToast = findViewById(R.id.button2);

        textView1.setText("Hello EVERYONE");
        textView1.setTextColor(Color.BLUE);

        textView2.setTextSize(40);
        textView2.setAllCaps(true);

        button.setOnClickListener(this);
        showToast.setOnClickListener(this);
        textView2.setOnClickListener(this);

    }


    /*
    Child child=new Child();
    ParentClass parent=new Child();
     */

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Log.e("Button ID", id + " " + R.id.button);

        if (id == R.id.button) {
            textView1.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.txtColor));
            ++count;
            textView2.setText("Hi! " + count);
        } else if (id == R.id.button2) {
            Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
        }
        else if(id==R.id.txt2){
            button.setBackgroundColor(Color.BLACK);
        }
    }

}
