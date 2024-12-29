package com.example.rps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Button btnHome = findViewById(R.id.btnHome);
        TextView playerName = findViewById(R.id.tvPlayerName);

        // Get the player name from the Intent
        String name = getIntent().getStringExtra("name");
        playerName.setText(name);

        // Set up the Home button to go back to the MainActivity
        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(FinishActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
