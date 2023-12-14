package com.example.healthtracker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    // Called when the "Exercise" tile is clicked
    public void onExerciseTileClick(View view) {
        // Intent to navigate to the Exercise tracking screen
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }

    // Called when the "Nutrition" tile is clicked
    public void onNutritionTileClick(View view) {
        // Intent to navigate to the Nutrition tracking screen
        Intent intent = new Intent(this, NutritionActivity.class);
        startActivity(intent);
    }

    // Called when the "Mental Well-being" tile is clicked
    public void onMentalWellBeingTileClick(View view) {
        // Intent to navigate to the Mental Well-being tracking screen
        Intent intent = new Intent(this, MentalWellBeingActivity.class);
        startActivity(intent);
    }

    public void onCaloriesTileClick(View view) {
        String url = "https://www.mayoclinic.org/healthy-lifestyle/weight-loss/in-depth/calorie-calculator/itt-20402304"; // Replace with your desired URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}

