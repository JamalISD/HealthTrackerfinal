package com.example.healthtracker;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ExerciseActivity extends AppCompatActivity {

    private TextView exerciseTextView;
    private TextView setsTextView;
    private ImageView exerciseImageView;
    private Button workoutCompletedButton;  // Assuming this is the button for completing the workout
    private MediaPlayer mpDay;
    private int playing;

    private String[] exercises = {"Push-ups", "Sit-ups", "Jumping Jacks", "Squats", "Plank"};
    private int[] exerciseImages = {
            R.drawable.pushups_image,
            R.drawable.situps_image,
            R.drawable.jumping_jacks_image,
            R.drawable.squats_image,
            R.drawable.plank_image
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        exerciseTextView = findViewById(R.id.exerciseTextView);
        setsTextView = findViewById(R.id.setsTextView);
        exerciseImageView = findViewById(R.id.exerciseImageView);
        workoutCompletedButton = findViewById(R.id.workoutCompletedButton);

        workoutCompletedButton.setOnClickListener(dayButtonClick);

        mpDay = new MediaPlayer();
        mpDay = MediaPlayer.create(this, R.raw.day);

        playing = 0;
    }

    public void onNewWorkoutButtonClick(View view) {
        String randomExercise = getRandomExercise();
        exerciseTextView.setText("Current Exercise: " + randomExercise);
        int index = getIndex(randomExercise);
        if (index != -1) {
            exerciseImageView.setImageResource(exerciseImages[index]);
        }
        int numberOfSets = getRandomNumberOfSets();
        setsTextView.setText("Number of Sets: " + numberOfSets);
    }

    private String getRandomExercise() {
        Random random = new Random();
        int index = random.nextInt(exercises.length);
        return exercises[index];
    }

    private int getIndex(String exercise) {
        for (int i = 0; i < exercises.length; i++) {
            if (exercises[i].equals(exercise)) {
                return i;
            }
        }
        return -1;
    }

    private int getRandomNumberOfSets() {
        Random random = new Random();
        return random.nextInt(3) + 3;
    }

    Button.OnClickListener dayButtonClick = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpDay.start();
                    playing = 1;
                    workoutCompletedButton.setText("Pause Day Song");
                    // Assuming button2 is the second button you mentioned in the previous code
                    // You should replace it with the correct reference
                    // button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpDay.pause();
                    playing = 0;
                    workoutCompletedButton.setText("Completed Workout");
                    // Replace button2 with the correct reference
                    // button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
