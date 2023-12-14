package com.example.healthtracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the "Get Started" button is clicked


        // Called when the "Get Started" button is clicked
        public void onGetStartedButtonClick(View view) {
            // Intent to navigate to the sign-in screen
            Intent intent = new Intent(this, com.example.healthtracker.SignInActivity.class);
            startActivity(intent);

        }

    }

