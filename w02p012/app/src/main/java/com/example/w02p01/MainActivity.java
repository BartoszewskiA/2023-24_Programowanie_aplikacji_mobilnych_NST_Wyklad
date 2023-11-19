package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ramka;
    TextView ramkaOpis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ramka = findViewById(R.id.imageView01);
        ramkaOpis = findViewById(R.id.opis);
    }

    public void zmien(View view) {
        ramka.setImageResource(R.drawable.grafika_01);
    }

    public void pokazOpis(View view) {
        String s = getResources().getString(R.string.opis);
        ramkaOpis.setText(s);
    }
}