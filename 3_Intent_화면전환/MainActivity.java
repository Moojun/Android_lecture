package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText editText;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                str = editText.getText().toString(); // 여기 선언해야, onClick event 이후 데이터가 전달됨

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str);

                startActivity(intent);  // activity 이동
            }
        });

    }
}