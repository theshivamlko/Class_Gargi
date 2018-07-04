package com.navoki.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtMobile;
    private EditText edtPass;
    private Button submit;
    private Button submit2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);

        edtName = findViewById(R.id.edtName);
        edtMobile = findViewById(R.id.edtMobile);
        edtPass = findViewById(R.id.edtPass);
        submit = findViewById(R.id.submit);
        submit2 = findViewById(R.id.submit2);


        submit.setOnClickListener(onClickListener);
        //  submit2.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = edtName.getText().toString();
            String mobile = edtMobile.getText().toString();
            String pass = edtPass.getText().toString();

            if (!TextUtils.isEmpty(name)) // check if null or   ""
            {
                if (!TextUtils.isEmpty(mobile) && mobile.length() == 10) {

                    if (!TextUtils.isEmpty(pass) && pass.length() >= 8) {
                        Toast.makeText(EditTextActivity.this, "User Registered", Toast.LENGTH_SHORT).show();
                    } else
                        Toast.makeText(EditTextActivity.this, "Enter pass greater than 8", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(EditTextActivity.this, "Enter valid mobile", Toast.LENGTH_SHORT).show();

            } else
                Toast.makeText(EditTextActivity.this, "Enter valid name", Toast.LENGTH_SHORT).show();


            Log.e("FIELDS", name);
            Log.e("FIELDS", mobile);
            Log.e("FIELDS", pass);

        }
    };
}
