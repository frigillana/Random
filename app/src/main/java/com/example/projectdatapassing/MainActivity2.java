package com.example.projectdatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.textView);

        String finput = getIntent().getStringExtra("key1");
        String sinput = getIntent().getStringExtra("key2");

        if (finput.equals(sinput)) {
            result.setText("Matched!");
        }
        else{
            result.setText("Not Matched!");
        }
    }
}