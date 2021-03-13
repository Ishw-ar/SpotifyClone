package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenderActivity extends AppCompatActivity {
    private Button btnfemale;
    private Button btnMale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        initViews();
    }

    private void initViews() {
        btnfemale=findViewById(R.id.btnFeamle2);
        btnMale=findViewById(R.id.btnMale2);
        btnfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent =new Intent(GenderActivity.this,NameActivity.class);
               // startActivity(intent);


            }
        });

        btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent intent =new Intent(GenderActivity.this,NameActivity.class);
              //  startActivity(intent);
            }
        });
    }
}