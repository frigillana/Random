package com.example.projectdatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputOne, inputTwo;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = findViewById(R.id.firstinput);
        inputTwo = findViewById(R.id.secondinput);
        btnCheck = findViewById(R.id.button);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String finput = inputOne.getText().toString();
                String sinput = inputTwo.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key1", finput);
                intent.putExtra("key2", sinput);
                startActivity(intent);
            }
        });
    }
}