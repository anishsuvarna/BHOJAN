package com.example.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class recieve extends AppCompatActivity {
Button rcvbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        rcvbtn=findViewById(R.id.rcvbtn);
        rcvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recieve.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(recieve.this,"SUCCESS",Toast.LENGTH_SHORT).show();

            }
        });
    }
}