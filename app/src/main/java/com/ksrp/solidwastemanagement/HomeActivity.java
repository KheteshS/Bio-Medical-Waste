package com.ksrp.solidwastemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button bmw,ew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bmw = findViewById(R.id.bmw);

        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bmw_intent = new Intent(HomeActivity.this, BMWActivity.class);
                startActivity(bmw_intent);
            }
        });
    }
}