package com.example.w01p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView poleTekstowe;
    int ile =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poleTekstowe = findViewById(R.id.textView2);
        poleTekstowe.setText("Jeszcze nic nie kliknięto");
    }

    public void klik(View view) {

        ile++;
        poleTekstowe.setText("Kliknięto "+ile+" razy");
    }
}