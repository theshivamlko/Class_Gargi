package com.navoki.practice;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText pass;

    Button register;
    String stremail;
    String strpass;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        TextView newaccount=findViewById(R.id.newaccount);

        email = findViewById(R.id.email);
        register = findViewById(R.id.login);

        pass =findViewById(R.id.pass);

        email.setHint("enter username");
        register.setText("signup");

        progressDialog=new ProgressDialog(LoginActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Toast.makeText(LoginActivity.this, "button click", Toast.LENGTH_SHORT).show();
                register.setBackgroundColor(Color.BLUE);*/
                checkEditText();
            }
        };

        register.setOnClickListener(click);

        newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private void checkEditText() {

        stremail = email.getText().toString();
        Log.e("email", stremail);

        strpass = pass.getText().toString();
        // null ""

        if(!TextUtils.isEmpty(stremail) && !TextUtils.isEmpty(strpass)){
          /*  Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();*/

          LoginTask loginTask=new LoginTask();
          loginTask.execute();

        }
        else {
            Toast.makeText(LoginActivity.this,"enter valid no",Toast.LENGTH_SHORT).show();
        }
    }


// naman@gmail.com
    // naman
    class LoginTask extends AsyncTask<String,String,String>{

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog.show();
    }

    @Override
        protected String doInBackground(String... strings) {

            try {
                Log.e("URL","https://apteral-bay.000webhostapp.com/attendanceapp/loginnews.php?email="+stremail+"&pass="+strpass);

                URL url = new URL("https://apteral-bay.000webhostapp.com/attendanceapp/loginnews.php?email="+stremail+"&pass="+strpass);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                int responsecode = urlConnection.getResponseCode();
                if (responsecode == 200)
                {
                    Log.e("Loginactivity","result ok");

                    Scanner scanner=new Scanner(urlConnection.getInputStream());
                    scanner.useDelimiter("\\A");
                    String s=scanner.next();
                    Log.e("Loginactivity","result "+s);

                    return s;
                }
                else {
                    Log.e("Loginactivity","page not found");

                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressDialog.dismiss();
            if(s!=null){
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    boolean status=jsonObject.getBoolean("status");
                    if(status){

                        JSONObject obj=jsonObject.getJSONObject("data");
                        String name=obj.getString("name");

                        Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                        intent.putExtra("name",name);
                        startActivity(intent);
                        finish();
                    }
                    else
                        Toast.makeText(LoginActivity.this,jsonObject.getString("msg"),Toast.LENGTH_SHORT).show();


                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("ERROR",e.getLocalizedMessage());
                }
            }
            else
                Toast.makeText(LoginActivity.this,"Something gone wrong!",Toast.LENGTH_SHORT).show();
        }
    }









}
