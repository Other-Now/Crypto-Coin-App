package com.example.cryptocoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(iHome);
            }
        }, 4000);

        Toast.makeText(getApplicationContext(), "By MANPRIT", Toast.LENGTH_LONG).show();

    }
}