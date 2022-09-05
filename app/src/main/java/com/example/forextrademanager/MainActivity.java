package com.example.forextrademanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_login, tv_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_login = (TextView) findViewById(R.id.login_tx);
        tv_signup = (TextView) findViewById(R.id.signup_tx);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {

                            Intent in = new Intent(getApplicationContext(), Login.class);
                            startActivity(in);
                            MainActivity.this.finish();
                    }
                }, 3000);
            }
        });
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                            Intent in = new Intent(getApplicationContext(), Signup.class);
                            startActivity(in);
                            MainActivity.this.finish();
                    }
                }, 3000);
            }
        });
    }
}