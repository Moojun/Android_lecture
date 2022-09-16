package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView textview_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textview_sub = findViewById(R.id.textview_sub);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        textview_sub.setText(str);
    }
}