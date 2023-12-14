package com.example.healthtracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthtracker.DashboardActivity;
import com.example.healthtracker.R;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void onSignInButtonClick(View view) {
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);

        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Implement your sign-in logic here
        // For simplicity, let's just check if username and password are not empty
        if (!username.isEmpty() && !password.isEmpty()) {
            // Successful sign-in, navigate to the next screen
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
            finish();  // Finish the current activity to prevent going back to the sign-in screen
        } else {
            // Display a toast for unsuccessful sign-in
            Toast.makeText(this, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }
}
