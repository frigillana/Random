package com.example.projectdatapassing.challenge1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectdatapassing.R;

public class Challenge1FirstActivity extends AppCompatActivity {

    private EditText inputOne, inputTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1_first);

        inputOne = findViewById(R.id.firstinput);
        inputTwo = findViewById(R.id.secondinput);
        Button btnCheck = findViewById(R.id.button);

        btnCheck.setOnClickListener(v -> {
            String firstInput = inputOne.getText().toString();
            String secondInput = inputTwo.getText().toString();
            startActivity(Challenge1SecondActivity.newIntent(Challenge1FirstActivity.this, firstInput, secondInput));
        });
    }
}