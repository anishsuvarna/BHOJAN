package com.example.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Donate extends AppCompatActivity {
Button subbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        subbtn=findViewById(R.id.subbtn);
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Donate.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(Donate.this,"SUCCESS",Toast.LENGTH_SHORT).show();

            }
        });
    }
}