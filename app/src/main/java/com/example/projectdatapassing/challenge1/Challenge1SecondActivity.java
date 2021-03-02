package com.example.projectdatapassing.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.projectdatapassing.R;

public class Challenge1SecondActivity extends AppCompatActivity {

    private static final String EXTRA_KEY1 = "key1";
    private static final String EXTRA_KEY2 = "key2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1_second);

        TextView result = findViewById(R.id.textView);

        String firstInput = getIntent().getStringExtra(EXTRA_KEY1);
        String secondInput = getIntent().getStringExtra(EXTRA_KEY2);

        if (firstInput.equals(secondInput)) {
            result.setText(getString(R.string.msg_matched));
        }
        else{
            result.setText(getString(R.string.msg_not_matched));
        }
    }

    static Intent newIntent(Context context, String firstInput, String secondInput) {
        Intent intent = new Intent(context, Challenge1SecondActivity.class);
        intent.putExtra(EXTRA_KEY1, firstInput);
        intent.putExtra(EXTRA_KEY2, secondInput);
        return intent;
    }
}