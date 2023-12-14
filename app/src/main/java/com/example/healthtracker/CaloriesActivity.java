package com.example.healthtracker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CaloriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
    }

    // Called when the "Calculate Calories" button is clicked
    public void onCalculateCaloriesClick(View view) {
        // Open the website for calculating calories
        String url = "https://www.calculator.net/calorie-calculator.html";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
