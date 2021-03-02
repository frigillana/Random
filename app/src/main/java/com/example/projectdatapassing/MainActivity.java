package com.example.projectdatapassing;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputOne, inputTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = findViewById(R.id.firstinput);
        inputTwo = findViewById(R.id.secondinput);
        Button btnCheck = findViewById(R.id.button);

        btnCheck.setOnClickListener(v -> {
            String firstInput = inputOne.getText().toString();
            String secondInput = inputTwo.getText().toString();
            startActivity(MainActivity2.newIntent(MainActivity.this, firstInput, secondInput));
        });
    }
}