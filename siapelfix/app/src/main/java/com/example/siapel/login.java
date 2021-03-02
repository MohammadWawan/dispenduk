package com.example.siapel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        TextView forgotpass=(TextView) findViewById(R.id.forgot_password);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_forgot =new Intent(login.this, forgot_password.class);
                startActivity(b_forgot);
            }
        });
        Button log_beranda= (Button) findViewById(R.id.btn_login);
        log_beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_beranda=new Intent(login.this, homepage.class);
                startActivity(b_beranda);
            }
        });
    }
}