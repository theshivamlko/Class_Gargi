package com.navoki.practice;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    EditText mobileno;

    Button register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signupactivity);

        email = findViewById(R.id.email);
        register = findViewById(R.id.login);

        pass =findViewById(R.id.pass);
        mobileno=findViewById(R.id.mobileno);

        email.setHint("enter username");
        register.setText("signup");

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Toast.makeText(SignupActivity.this, "button click", Toast.LENGTH_SHORT).show();
                register.setBackgroundColor(Color.BLUE);*/
                checkEditText();
            }
        };

        register.setOnClickListener(click);
    }


    private void checkEditText() {
        String stremail = email.getText().toString();
        Log.e("email", stremail);

        String strpass = pass.getText().toString();
        String strmobileno=mobileno.getText().toString();

        Log.e("SignupActivity", strpass+" "+strmobileno);
        int len=strmobileno.length();

        if(len==10){
            Intent intent=new Intent(SignupActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(SignupActivity.this,"enter valid no",Toast.LENGTH_SHORT).show();
        }
    }
}
