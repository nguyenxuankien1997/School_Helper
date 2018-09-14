package com.example.mrrs.schoolhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash_Silde extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Hide action bar
        getSupportActionBar().hide();

    }
}
