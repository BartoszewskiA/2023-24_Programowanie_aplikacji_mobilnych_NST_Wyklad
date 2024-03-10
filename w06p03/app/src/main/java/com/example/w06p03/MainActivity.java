package com.example.w06p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String s = textView01.getText().toString();
        s+="\nonStart";
        textView01.setText(s);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String s = textView01.getText().toString();
        s+="\nonStop";
        textView01.setText(s);
    }
}