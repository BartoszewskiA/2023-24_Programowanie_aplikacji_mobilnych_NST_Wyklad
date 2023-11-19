package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText poleX, poleY, poleWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poleX = findViewById(R.id.editText01);
        poleY = findViewById(R.id.editText02);
        poleWynik = findViewById(R.id.editText03);
    }

    public void licz(View view) {
        String s;
        s = poleX.getText().toString();
        if (s.length()==0)
        {
            s="0";
            poleX.setText("0");
        }
        int x = Integer.parseInt(s);
        s = poleY.getText().toString();
        if (s.length()==0)
        {
            s="0";
            poleY.setText("0");
        }
        int y = Integer.parseInt(s);

        int wynik = x+y;
        poleWynik.setText(String.valueOf(wynik));
    }
}