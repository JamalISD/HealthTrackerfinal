package com.example.healthtracker;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MentalWellBeingActivity extends AppCompatActivity {

    private SeekBar moodSeekBar;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_well_being);

        moodSeekBar = findViewById(R.id.moodSeekBar);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void onSubmitButtonClick(View view) {
        int moodRating = moodSeekBar.getProgress();

        // Process the responses (you can send them to a server, store locally, etc.)
        displayResults(moodRating);
    }

    private void displayResults(int moodRating) {
        // Display the result in the TextView
        String resultMessage = "Your mood rating is: " + moodRating + "\n\n";

        // Provide suggestions based on mood rating
        if (moodRating <= 3) {
            resultMessage += "Suggestions: Consider talking to a friend, going for a walk, or practicing mindfulness.";
        } else if (moodRating <= 6) {
            resultMessage += "Suggestions: Try engaging in activities you enjoy, listening to music, or taking a break.";
        } else {
            resultMessage += "Suggestions: Keep up the good work! Consider continuing activities that bring you joy and relaxation.";
        }

        resultTextView.setText(resultMessage);
    }
}
