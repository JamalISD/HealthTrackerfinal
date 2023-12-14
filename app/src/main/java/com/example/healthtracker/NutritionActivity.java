package com.example.healthtracker;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class NutritionActivity extends AppCompatActivity {

    private String[] meals = {
            "Monday Meal: Grilled Chicken Salad",
            "Tuesday Meal: Spaghetti Bolognese",
            "Wednesday Meal: Vegetarian Stir-Fry",
            "Thursday Meal: Salmon with Quinoa",
            "Friday Meal: Margherita Pizza",
            "Saturday Meal: Shrimp and Broccoli Stir-Fry",
            "Sunday Meal: BBQ Chicken Wrap",
            "Monday Meal: Quinoa Salad with Chickpeas",
            "Tuesday Meal: Teriyaki Chicken with Brown Rice",
            "Wednesday Meal: Caprese Sandwich with Pesto",
            "Thursday Meal: Lentil Soup with Whole Grain Bread",
            "Friday Meal: Veggie Burrito Bowl",
            "Saturday Meal: Caesar Salad with Grilled Shrimp",
            "Sunday Meal: Mediterranean Grilled Lamb"
    };

    private int[] mealImages = {
            R.drawable.grilled_chicken_salad,
            R.drawable.spaghetti_bolognese,
            R.drawable.vegetarian_stir_fry,
            R.drawable.salmon_quinoa_,
            R.drawable.quinoa_chickpea_salad,
            R.drawable.teriyaki_chicken_brown_rice,
            R.drawable.caprese_sandwich_pesto,
            R.drawable.lentil_soup_whole_grain_bread,
            R.drawable.veggie_burrito_bowl,
            R.drawable.caesar_salad_grilled_shrimp,
            R.drawable.mediterranean_grilled_lamb
    };

    private int currentMealIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
    }

    public void onSuggestFoodButtonClick(View view) {
        // Display the suggested meal for the current index in the TextView
        TextView suggestionTextView = findViewById(R.id.suggestionTextView);
        suggestionTextView.setText("Today's Suggestion:\n" + meals[currentMealIndex]);


        // Display the corresponding image for the current meal in an ImageView
        ImageView mealImageView = findViewById(R.id.mealImageView);
        mealImageView.setImageResource(mealImages[currentMealIndex]);


        // Increment the current index for the next button press
        currentMealIndex = (currentMealIndex + 1) % meals.length;
    }
}
