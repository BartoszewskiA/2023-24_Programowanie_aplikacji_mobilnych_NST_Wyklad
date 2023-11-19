package com.example.w03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button przycisk, przycisk_2;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk = findViewById(R.id.button01);
        przycisk_2 = findViewById(R.id.button02);
        wynik = findViewById(R.id.textView01);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = wynik.getText().toString();
                s+="*";
                wynik.setText(s);
            }
        });

        przycisk_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = wynik.getText().toString();
                if (!s.isEmpty())
                {
                    s = s.substring(0,s.length()-1);
                    wynik.setText(s);

                }
            }
        });

    }
}