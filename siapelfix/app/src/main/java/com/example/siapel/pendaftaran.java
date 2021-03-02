package com.example.siapel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pendaftaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran_activity);
        Button btnlogin =(Button) findViewById(R.id.b_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_masuk =new Intent(pendaftaran.this, login.class);
                startActivity(b_masuk);
            }
        });
        Button btnregister =(Button) findViewById(R.id.b_register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_daftar=new Intent(pendaftaran.this,register.class);
                startActivity(b_daftar);
            }
        });
    }
}